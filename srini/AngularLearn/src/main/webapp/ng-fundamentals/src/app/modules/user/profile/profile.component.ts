import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '../../../../../node_modules/@angular/forms';
import { AuthService } from '../../../services/auth.service';
import { Router } from '../../../../../node_modules/@angular/router';

@Component({
  selector: 'app-profile',
  // templateUrl: './profile.component.html',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  profileForm: FormGroup;
  constructor(private authServ: AuthService, private rouute: Router) { }

  ngOnInit() {
    const firstName = new FormControl(this.authServ.currentUser.fName, Validators.required);
    const lastName = new FormControl(this.authServ.currentUser.lName, Validators.required);
    this.profileForm = new FormGroup({
      firstName, lastName
    });
  }

  cancel(): void {
    this.rouute.navigate(['/events']);
  }

  saveProfile(formValue) {
    if (this.profileForm.valid) {
      this.authServ.updateCurUser(formValue);
    }
  }

}
