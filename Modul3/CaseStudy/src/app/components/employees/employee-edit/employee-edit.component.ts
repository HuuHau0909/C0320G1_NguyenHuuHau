import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {EmployeeService} from "../../../services/employee.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.scss']
})
export class EmployeeEditComponent implements OnInit {
  public formEditEmployee: FormGroup;
  public maxDate = new Date();
  public minDate = new Date(1900, 0, 1)
  private employeeId;

  constructor(
    public formBuilder: FormBuilder,
    public employeeService: EmployeeService,
    public router: Router,
    public activatedRoute: ActivatedRoute
  ) {
  }

  ngOnInit() {
    this.formEditEmployee = this.formBuilder.group({
      fullName: ['', [Validators.required]],
      position: ['', [Validators.required]],
      academicLevel: ['', [Validators.required]],
      part: ['', [Validators.required]],
      dateOfBirth: ['', [Validators.required]],
      IDnumber: ['', [Validators.required, Validators.pattern('^[0-9]{9,10}$')]],
      salary: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', [Validators.required, Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      address: ['', [Validators.required]]
    })

    this.activatedRoute.params.subscribe(data => {
      this.employeeId = data.id;
      this.employeeService.getEmployeeById(this.employeeId).subscribe(data=>{
        this.formEditEmployee.patchValue(data);
      })
    })
  }


  editEmployee() {
this.employeeService.editEmployee(this.formEditEmployee.value,this.employeeId).subscribe(data=>{
  this.router.navigateByUrl('employee-list')
})
  }
}
