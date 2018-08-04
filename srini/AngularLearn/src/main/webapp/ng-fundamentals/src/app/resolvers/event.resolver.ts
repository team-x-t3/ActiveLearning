import { Resolve, ActivatedRouteSnapshot } from "../../../node_modules/@angular/router";
import { Observable } from "../../../node_modules/rxjs";
import { IEvent } from "../models/event.model";
import { HttpService } from "../services/http.service";
import { map } from "../../../node_modules/rxjs/operators";
import { Injectable } from "../../../node_modules/@angular/core";

@Injectable({
    providedIn: 'root'
})
export class EventResolver implements Resolve<Observable<IEvent>> {
    constructor(private httpServ: HttpService) { }
    resolve(routeSnap: ActivatedRouteSnapshot): Observable<IEvent> {
        console.log(routeSnap.params['id']);
        return this.httpServ.get(`api/events/${routeSnap.params['id']}`, 'get element by Id', null).pipe(map(event => event));
    }

}
