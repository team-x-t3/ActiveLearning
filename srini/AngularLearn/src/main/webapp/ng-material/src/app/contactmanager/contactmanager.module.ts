import {
  NgModule
} from '@angular/core';
import {
  CommonModule
} from '@angular/common';
import {
  ContactManagerComponent
} from './contact-manager.component';
import {
  RouterModule,
  Routes
} from '../../../node_modules/@angular/router';
import {
  SideNavComponent
} from './side-nav/side-nav.component';
import {
  ToolBarComponent
} from './tool-bar/tool-bar.component';
import {
  MainContentComponent
} from './main-content/main-content.component';
import { MaterialModule } from '../material/material.module';
import { HttpClientModule } from '../../../node_modules/@angular/common/http';

const routes: Routes = [{
  path: '',
  component: ContactManagerComponent,
  children: [{
    path: ':id', component: MainContentComponent
  }, {
    path: '',
    component: MainContentComponent
  }]
}];




@NgModule({
  imports: [
    CommonModule,
    MaterialModule,
    HttpClientModule,
    RouterModule.forChild(routes)
  ],
  declarations: [
    ContactManagerComponent,
    SideNavComponent,
    ToolBarComponent,
    MainContentComponent
  ]
})
export class ContactmanagerModule { }
