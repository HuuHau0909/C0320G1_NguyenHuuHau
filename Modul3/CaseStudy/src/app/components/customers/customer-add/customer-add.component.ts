import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../../services/customer.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.scss']
})
export class CustomerAddComponent implements OnInit {
  private formAddNewCustomer: FormGroup;
  public maxDate = new Date();
  public minDate = new Date(1900, 0, 1)

  constructor(
    public formBuilder: FormBuilder,
    public customerService: CustomerService,
    public router: Router
  ) {
  }

  ngOnInit() {
    this.formAddNewCustomer = this.formBuilder.group({
      fullName: ['', [Validators.required]],
      gender: ['', [Validators.required]],
      dateOfBirth: ['', [Validators.required]],
      IDnumber: ['', [Validators.required, Validators.pattern('^[0-9]{9,10}$')]],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', [Validators.required, Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      address: ['', [Validators.required]],
      typeCustomer: ['', [Validators.required]],
    })
  }

  createCustomer() {
this.customerService.addNewCustomer(this.formAddNewCustomer.value).subscribe(dataCustomer=>{
  this.router.navigateByUrl('customer-list');
})
  }
}
