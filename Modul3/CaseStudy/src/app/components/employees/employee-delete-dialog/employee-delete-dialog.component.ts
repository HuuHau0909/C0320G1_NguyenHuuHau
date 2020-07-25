import {Component, Inject, OnInit} from '@angular/core';
// @ts-ignore
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {EmployeeService} from "../../../services/employee.service";

@Component({
  selector: 'app-employee-delete-dialog',
  templateUrl: './employee-delete-dialog.component.html',
  styleUrls: ['./employee-delete-dialog.component.scss']
})
export class EmployeeDeleteDialogComponent implements OnInit {
  private employeeFullName;
  private employeeId;

  constructor(
    public dialogRef: MatDialogRef<EmployeeDeleteDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public employeeService: EmployeeService) {
  }

  ngOnInit() {
    this.employeeFullName = this.data.data.fullName;
    this.employeeId = this.data.data.id;
  }

  deleteEmployee() {
    this.employeeService.deleteEmployee(this.employeeId).subscribe(data=>{
      this.dialogRef.close();
    })
  }
}
