import {Component, Inject, OnInit} from '@angular/core';
// @ts-ignore
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {EmployeeService} from "../../../services/employee.service";
import {CustomerService} from "../../../services/customer.service";

@Component({
  selector: 'app-customer-delete-dialog',
  templateUrl: './customer-delete-dialog.component.html',
  styleUrls: ['./customer-delete-dialog.component.scss']
})
export class CustomerDeleteDialogComponent implements OnInit {

  private customerFullName;
  private customerId

  constructor(public dialogRef: MatDialogRef<CustomerDeleteDialogComponent>,
              @Inject(MAT_DIALOG_DATA)
              public data: any,
              public customerService: CustomerService) {}

  ngOnInit() {
    this.customerFullName = this.data.data.fullName;
    this.customerId = this.data.data.id;
    console.log(this.customerId);
  }

  deleteCustomer() {
    this.customerService.deleteCustomer(this.customerId).subscribe(data=>{
    this.dialogRef.close();
  })

}}
