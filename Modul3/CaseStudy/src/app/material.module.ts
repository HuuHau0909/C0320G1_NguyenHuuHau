import { NgModule } from '@angular/core';
import {
  MatNativeDateModule,

  MatInputModule } from "@angular/material";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
// @ts-ignore
import {MatDatepickerModule} from "@angular/material/datepicker";
// @ts-ignore
import {MatFormFieldModule} from "@angular/material/form-field";
// @ts-ignore
import {MatDialogModule} from "@angular/material/dialog";
import {EmployeeDeleteDialogComponent} from "./components/employees/employee-delete-dialog/employee-delete-dialog.component";

@NgModule({
  imports: [
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatDialogModule
  ],
  exports: [
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatDialogModule
  ],
  providers: [ MatDatepickerModule ],
  entryComponents: [EmployeeDeleteDialogComponent],
})

export class MaterialModule {}
