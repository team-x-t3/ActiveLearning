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
import { HttpClientModule } from '../../node_modules/@angular/common/http';

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
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
