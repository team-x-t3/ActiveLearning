import { Resolve } from "../../../node_modules/@angular/router";
import { EventService } from "../services/event.service";
import { map } from 'rxjs/operators';
import { Injectable } from "../../../node_modules/@angular/core";
@Injectable({
    providedIn: 'root'
})
export class EventListResolver implements Resolve<any> {
    constructor(private eventService: EventService) { }
    resolve() {
        return this.eventService.getEvents().pipe(map(events => events));
    }
}
