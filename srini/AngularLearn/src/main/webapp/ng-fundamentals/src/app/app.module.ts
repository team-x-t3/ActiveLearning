import {
  BrowserModule
} from '@angular/platform-browser';
import {
  NgModule
} from '@angular/core';

import {
  EventListComponent,
  EventthumbnailComponent,
  NavComponent,
  EventDetailComponent,
  CreateEventComponent,
  Err404Component
} from './components/index';
import { EventsAppComponent } from './eventsapp.component';
import {
  RouterModule
} from '../../node_modules/@angular/router';
import {
  AppRoute
} from './routes/app.routes';


@NgModule({
  declarations: [
    EventsAppComponent,
    EventthumbnailComponent,
    EventListComponent,
    NavComponent,
    EventDetailComponent,
    CreateEventComponent,
    Err404Component
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(AppRoute)
  ],
  providers: [],
  bootstrap: [EventsAppComponent]
})
export class AppModule { }
