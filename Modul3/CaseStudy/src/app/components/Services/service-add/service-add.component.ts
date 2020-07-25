import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {ServiceService} from "../../../services/service.service";

@Component({
  selector: 'app-service-add',
  templateUrl: './service-add.component.html',
  styleUrls: ['./service-add.component.scss']
})
export class ServiceAddComponent implements OnInit {

  public formAddNewService: FormGroup;

  constructor(
    public formBuilder: FormBuilder,
    public serviceService: ServiceService,
    public router: Router
  ) {
  }

  ngOnInit() {
    this.formAddNewService = this.formBuilder.group({
      code: ['', [Validators.required, Validators.pattern('^(DV)-[a-zA-Z0-9]{4}$')]],
      nameService: ['', [Validators.required]],
      area: ['', [Validators.required]],
      rentCost: ['', [Validators.required]],
      maxPeople: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      typeRent: ['', [Validators.required]],
      standard: ['', [Validators.required]],
      serviceInclude: ['', [Validators.required]],
      poolArea: ['', [Validators.required]],
      numFlor: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      freeInclude: ['', [Validators.required]]
    });
  }

  createService() {
    this.serviceService.addNewService(this.formAddNewService.value).subscribe(data => {
      this.router.navigateByUrl('service-list');
    });
  }
}
