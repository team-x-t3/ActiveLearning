import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '../../../../node_modules/@angular/router';
import { UserService } from '../services/user.service';
import { User } from '../models/user';

@Component({
  selector: 'app-main-content',
  templateUrl: './main-content.component.html',
  styleUrls: ['./main-content.component.scss']
})
export class MainContentComponent implements OnInit {
  selectedContact: User;
  constructor(private route: ActivatedRoute, private userServ: UserService) { }

  ngOnInit() {
    this.route.params.forEach(param => {
      const userId = +param['id'];
      this.selectedContact = this.userServ.userById(userId);
      console.log(this.selectedContact);

    });
  }

}
