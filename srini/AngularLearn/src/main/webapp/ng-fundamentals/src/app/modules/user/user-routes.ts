import { Routes } from '@angular/router';
import { ProfileComponent } from './profile/profile.component';
import { LoginComponent } from './login/login.component';
import { ProfileRouteActivate } from '../../routes/event-route-activate.service';

export const UserRoute: Routes = [
    { path: 'profile', component: ProfileComponent, canActivate: [ProfileRouteActivate] },
    { path: 'login', component: LoginComponent }
];
