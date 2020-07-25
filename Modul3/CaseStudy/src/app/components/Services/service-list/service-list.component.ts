import { Component, OnInit } from '@angular/core';
// @ts-ignore
import {MatDialog} from "@angular/material/dialog";
import {ServiceService} from "../../../services/service.service";

@Component({
  selector: 'app-service-list',
  templateUrl: './service-list.component.html',
  styleUrls: ['./service-list.component.scss']
})
export class ServiceListComponent implements OnInit {
 private services;

  constructor(
    public serviceService: ServiceService,
    public dialog: MatDialog
  ) { }

  ngOnInit() {
    this.serviceService.getAllService().subscribe(dataService => {
      this.services = dataService;
    });
  }

}
