import { Injectable } from "../../../node_modules/@angular/core";
import { IUser } from "../models/user.model";
import { Router } from "../../../node_modules/@angular/router";

@Injectable({
    providedIn: 'root'
})
export class AuthService {
    constructor(private route: Router) { }
    currentUser: IUser;
    isAuthenticated(): boolean {
        return !!this.currentUser;
    }
    loginUser(userName: string, password: string) {
        this.currentUser = { uName: userName, id: 1, fName: 'srini', lName: 'channa' };
        this.route.navigate(['/events']);
    }
    updateCurUser(formValue) {
        console.log(formValue);
        this.currentUser.fName = formValue.firstName;
        this.currentUser.lName = formValue.lastName;
    }
}
