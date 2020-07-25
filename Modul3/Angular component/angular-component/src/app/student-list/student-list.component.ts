import { Component, OnInit } from '@angular/core';
import {StudentList} from "../StudentList";
import {IStudent} from "../IStudent";

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
students = StudentList;
studentDetailOutputDl: IStudent;
  constructor() { }

  ngOnInit() {
  }

  viewDetail(student: IStudent) {
this.studentDetailOutputDl = student;
  }
}
