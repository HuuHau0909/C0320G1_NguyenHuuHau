import {Component, OnInit} from '@angular/core';
import {CustomerService} from "../../../services/customer.service";

// @ts-ignore
import {MatDialog} from "@angular/material/dialog";
import {CustomerDeleteDialogComponent} from "../customer-delete-dialog/customer-delete-dialog.component";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.scss']
})
export class CustomerListComponent implements OnInit {

  private customers;

  constructor(
    public customerService: CustomerService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit() {
    this.customerService.getAllCustomers().subscribe(dataCustomer => {
      this.customers = dataCustomer;
    })
  }

  openDialog(customerId): void {
    this.customerService.getCustomerById(customerId).subscribe(dataOfCustomer => {
      const dialogRef = this.dialog.open(CustomerDeleteDialogComponent, {
        width: '500px',
        data: {data: dataOfCustomer},
        disableClose: true
      });
      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    })
  }
}
