import {Component, Input, OnInit} from '@angular/core';
import {IStudent} from "../IStudent";

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {
  @Input()
studentDetail: IStudent;
  constructor() { }

  ngOnInit() {
  }

  setMark(value: any) {
    this.studentDetail.mark = value;
  }
}
