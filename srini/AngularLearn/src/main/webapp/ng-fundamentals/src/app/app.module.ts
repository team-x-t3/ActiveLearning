import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { EventsAppComponent } from './eventsapp.component';
import { EventListComponent } from './events/events-list.component';
import { EventthumbnailComponent } from './eventthumbnail/eventthumbnail.component';

@NgModule({
  declarations: [
    EventsAppComponent,
    EventthumbnailComponent,
    EventListComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [EventsAppComponent]
})
export class AppModule { }
