import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../../services/auth.service';
import { Router } from '../../../../../node_modules/@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username: string;
  password: string;
  constructor(private auth: AuthService, private router: Router) { }

  ngOnInit() {
  }
  login(formValue) {
    console.log(formValue);
    this.auth.loginUser(formValue.username, formValue.password);

  }
  cancel() {
    this.router.navigate(['/events']);
  }


}
