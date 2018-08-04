import { CanActivate, ActivatedRouteSnapshot, Router } from "../../../node_modules/@angular/router";
import { EventService } from "../services/event.service";
import { Injectable } from "../../../node_modules/@angular/core";
import { AuthService } from "../services/auth.service";
/* @Injectable({
    providedIn: 'root'
})
export class EventRouteActivate implements CanActivate {
    constructor(private eventService: EventService, private router: Router) { }
    canActivate(routeSnap: ActivatedRouteSnapshot) {
        const eventExist = !!this.eventService.getEvent(+routeSnap.params['id']);
        if (!eventExist) {
            this.router.navigate(['/404']);
        }
        return eventExist;

    }
} */
@Injectable({
    providedIn: 'root'
})
export class ProfileRouteActivate implements CanActivate {
    constructor(private router: Router, private authServ: AuthService) { }
    canActivate(routeSnap: ActivatedRouteSnapshot) {
        if (!this.authServ.isAuthenticated()) {
            this.router.navigate(['user/login']);
        }
        return this.authServ.isAuthenticated();
    }
}
