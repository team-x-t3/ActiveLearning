import { Routes } from "../../../node_modules/@angular/router";
import { EventListComponent } from "../components/events/events-list.component";
import { EventDetailComponent } from "../components/event-detail/event-detail.component";
import { CreateEventComponent } from "../components/create-event/create-event.component";
import { EventRouteActivate } from "./event-route-activate.service";
import { Err404Component } from "../components/errors/err404/err404.component";
import { CreateRouteDeactivate } from "./create-deactivate.service";
import { EventListResolver } from "./event-list.resolver";

export const AppRoute: Routes = [
    { path: 'events', component: EventListComponent, resolve: { events: EventListResolver } },
    { path: 'events/new', component: CreateEventComponent, canDeactivate: [CreateRouteDeactivate] },
    { path: 'events/:id', component: EventDetailComponent, canActivate: [EventRouteActivate] },
    { path: 'user', loadChildren: "../modules/user/user.module#UserModule" },
    { path: '404', component: Err404Component },
    { path: '', redirectTo: '/events', pathMatch: 'full' },
    { path: '**', redirectTo: '/events', pathMatch: 'full' }
];
