import { NgModule } from "../../../../node_modules/@angular/core";
import { CommonModule } from "../../../../node_modules/@angular/common";
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ProfileComponent } from "./profile/profile.component";
import { RouterModule } from "../../../../node_modules/@angular/router";
import { UserRoute } from "./user-routes";
import { LoginComponent } from "./login/login.component";

@NgModule({
    imports: [CommonModule, FormsModule, ReactiveFormsModule, RouterModule.forChild(UserRoute)],
    declarations: [ProfileComponent, LoginComponent],
    providers: []
})
export class UserModule { }
