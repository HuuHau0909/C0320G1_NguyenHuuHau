import {Component, OnInit} from '@angular/core';
import {EmployeeService} from '../../../services/employee.service';
// @ts-ignore
import {MatDialog} from "@angular/material/dialog";
import {EmployeeDeleteDialogComponent} from "../employee-delete-dialog/employee-delete-dialog.component";

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.scss']
})
export class EmployeeListComponent implements OnInit {

  private employees;

  constructor(
    public employeeService: EmployeeService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit() {
    this.employeeService.getAllEmployees().subscribe(dataEmployee => {
      this.employees = dataEmployee;
      });
  }

  openDialog(employeeId): void {
    this.employeeService.getEmployeeById(employeeId).subscribe(dataOfEmployee => {
      const dialogRef = this.dialog.open(EmployeeDeleteDialogComponent, {
        width: '500px',
        data: {data: dataOfEmployee},
        disableClose: true
      });
      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    })


  }
}
