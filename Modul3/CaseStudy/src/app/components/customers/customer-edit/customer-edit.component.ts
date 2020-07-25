import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../../services/customer.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.scss']
})
export class CustomerEditComponent implements OnInit {
  private formEditCustomer: FormGroup;
  public maxDate = new Date();
  public minDate = new Date(1900, 0, 1);
  private customerId;

  constructor(
    public formBuilder: FormBuilder,
    public customerService: CustomerService,
    public router: Router,
    public activatedRoute: ActivatedRoute
  ) {
  }

  ngOnInit() {
    this.formEditCustomer = this.formBuilder.group({
      fullName: ['', [Validators.required]],
      gender: ['', [Validators.required]],
      dateOfBirth: ['', [Validators.required]],
      IDnumber: ['', [Validators.required, Validators.pattern('^[0-9]{9,10}$')]],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', [Validators.required, Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      address: ['', [Validators.required]],
      typeCustomer: ['', [Validators.required]],
    })
    this.activatedRoute.params.subscribe(data => {
      this.customerId = data.id;
      this.customerService.getCustomerById(this.customerId).subscribe(data=>{
        this.formEditCustomer.patchValue(data);
      })
    })
  }


  editCustomer() {
    this.customerService.editCustomer(this.formEditCustomer.value,this.customerId).subscribe(data=>{
      this.router.navigateByUrl('customer-list')
    })
  }
}
