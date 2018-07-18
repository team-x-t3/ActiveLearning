import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { EventsAppComponent } from './eventsapp.component';
import { EventListComponent } from './components/events/events-list.component';
import { EventthumbnailComponent } from './components/eventthumbnail/eventthumbnail.component';
import { NavComponent } from './components/nav/nav.component';
import { EventDetailComponent } from './components/event-detail/event-detail.component';
import { RouterModule } from '../../node_modules/@angular/router';
import { AppRoute } from './routes/app.routes';
import { CreateEventComponent } from './components/create-event/create-event.component';
import { Err404Component } from './components/errors/err404/err404.component';

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
