import {
  BrowserModule
} from '@angular/platform-browser';
import {
  NgModule
} from '@angular/core';
import {
  RouterModule,
  Routes
} from '@angular/router';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import {
  AppComponent
} from './app.component';
import { MaterialModule } from './material/material.module';

const routes: Routes = [{
  path: 'contactmanager',
  loadChildren: './contactmanager/contactmanager.module#ContactmanagerModule',
},
{
  path: '**',
  redirectTo: 'contactmanager'
}];
@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
