import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';

import {PageNotFoundComponent} from './components/page-not-found/page-not-found.component';
import {HomeComponent} from './components/home/home.component';
import {EmployeeListComponent} from './components/employees/employee-list/employee-list.component';
import {CustomerListComponent} from './components/customers/customer-list/customer-list.component';
import {CommonModule} from "@angular/common";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {NgxPaginationModule} from "ngx-pagination";
import {EmployeeAddComponent} from './components/employees/employee-add/employee-add.component';
import {MaterialModule} from "./material.module";
// @ts-ignore
import {MatDatepickerModule} from "@angular/material/datepicker";
import {EmployeeDeleteDialogComponent} from './components/employees/employee-delete-dialog/employee-delete-dialog.component';
import {EmployeeEditComponent} from './components/employees/employee-edit/employee-edit.component';
import {CustomerAddComponent} from './components/customers/customer-add/customer-add.component';
import {CustomerDeleteDialogComponent} from './components/customers/customer-delete-dialog/customer-delete-dialog.component';
import {CustomerEditComponent} from './components/customers/customer-edit/customer-edit.component';
import { ServiceListComponent } from './components/Services/service-list/service-list.component';
import { ServiceAddComponent } from './components/Services/service-add/service-add.component';
import { ServiceDeleteComponent } from './components/Services/service-delete/service-delete.component';
import { ServiceEditComponent } from './components/Services/service-edit/service-edit.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'employee-list', component: EmployeeListComponent},
  {path: 'employee-add', component: EmployeeAddComponent},
  {path: 'employee-edit/:id', component: EmployeeEditComponent},
  {path: 'customer-list', component: CustomerListComponent},
  {path: 'customer-add', component: CustomerAddComponent},
  {path: 'customer-edit/:id', component: CustomerEditComponent},
  {path: 'service-list', component: ServiceListComponent},
  {path: 'service-add', component: ServiceAddComponent},
  {path: 'service-edit/:id', component: ServiceEditComponent},


  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
    CommonModule,
    Ng2SearchPipeModule,
    FormsModule,
    NgxPaginationModule,
    ReactiveFormsModule,
    MaterialModule, MatDatepickerModule],
  exports: [RouterModule],
  declarations: [PageNotFoundComponent,
    HomeComponent,
    EmployeeListComponent,
    CustomerListComponent,
    EmployeeAddComponent,
    EmployeeDeleteDialogComponent,
    EmployeeEditComponent,
    CustomerAddComponent,
    CustomerDeleteDialogComponent,
    CustomerEditComponent,
    ServiceListComponent,
    ServiceAddComponent,
    ServiceDeleteComponent,
    ServiceEditComponent],
  entryComponents: [EmployeeDeleteDialogComponent, CustomerDeleteDialogComponent, ServiceDeleteComponent]
})
export class AppRoutingModule {
}
