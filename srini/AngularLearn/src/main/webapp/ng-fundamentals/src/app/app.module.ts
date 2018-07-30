import {
  BrowserModule
} from '@angular/platform-browser';
import {
  NgModule
} from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
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
import { UserModule } from './modules/user/user.module';
import { SessionListComponent } from './components/session-list/session-list.component';
import { CollapsibleWellComponent } from './components/common/collapsible-well/collapsible-well.component';
import { CreateSessionComponent } from './components/create-session/create-session.component';
import { DurationPipe } from './pipes/duration.pipe';
import { SearchModalComponent } from './components/search-modal/search-modal.component';
import { ModalTriggerDirective } from './directives/modal-trigger.directive';
import { JQ_TOKEN } from './services/jQuery.service';

declare let jQuery: Object;

@NgModule({
  declarations: [
    EventsAppComponent,
    EventthumbnailComponent,
    EventListComponent,
    NavComponent,
    EventDetailComponent,
    CreateEventComponent,
    Err404Component,
    SessionListComponent,
    CollapsibleWellComponent,
    CreateSessionComponent,
    DurationPipe,
    SearchModalComponent,
    ModalTriggerDirective
  ],
  imports: [
    BrowserModule, FormsModule, ReactiveFormsModule, RouterModule.forRoot(AppRoute)
  ],
  providers: [{
    provide: JQ_TOKEN,
    useValue: jQuery
  }],
  bootstrap: [EventsAppComponent]
})
export class AppModule { }
