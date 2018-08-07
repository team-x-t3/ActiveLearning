import { Component, OnInit, Output, EventEmitter, NgZone } from '@angular/core';
import { UserService } from '../services/user.service';
import { User } from '../models/user';
import { Observable } from '../../../../node_modules/rxjs';

const SMALL_SCREEN_SIZE = 720;

@Component({
  selector: 'app-side-nav',
  templateUrl: './side-nav.component.html',
  styleUrls: ['./side-nav.component.scss']
})
export class SideNavComponent implements OnInit {
  contactList: Observable<User[]>;

  private mediaQuery: MediaQueryList = matchMedia(`(min-width:${SMALL_SCREEN_SIZE}px)`);
  constructor(private zone: NgZone, private userServ: UserService) {
    this.mediaQuery.addListener(listner => {
      zone.run(() => {
        this.mediaQuery = listner;
      });
    });
  }

  ngOnInit() {
    this.userServ.getContacts();
    this.contactList = this.userServ.users;
  }

  isSmallScreen(): boolean {
    return this.mediaQuery.matches;
  }

}
