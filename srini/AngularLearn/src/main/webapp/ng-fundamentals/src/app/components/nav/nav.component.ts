import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../services/auth.service';
import { EventService } from '../../services/event.service';
import { ISession } from '../../models/event.model';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {
  searchText: string;
  foundSessions: ISession[];
  constructor(private auth: AuthService, private eventServ: EventService) { }

  ngOnInit() {
  }

  searchSessions(searchText) {
    console.log(searchText);
    this.eventServ.searchSession(searchText).subscribe(s => {
      this.foundSessions = s;
      console.log(this.foundSessions);
    });

  }

}
