import { NgModule } from "../../../../node_modules/@angular/core";
import { CommonModule } from "../../../../node_modules/@angular/common";
import { ProfileComponent } from "./profile/profile.component";
import { RouterModule } from "../../../../node_modules/@angular/router";
import { UserRoute } from "./user-routes";

@NgModule({
    imports: [CommonModule, RouterModule.forChild(UserRoute)],
    declarations: [ProfileComponent],
    providers: []
})
export class UserModule { }
