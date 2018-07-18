import { CanActivate, ActivatedRouteSnapshot, Router } from "../../../node_modules/@angular/router";
import { EventService } from "../services/event.service";
import { Injectable } from "../../../node_modules/@angular/core";
@Injectable({
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
}
