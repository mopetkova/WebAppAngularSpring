import {Component, Input, OnInit} from '@angular/core';
import {Employee} from '../employee';
import {EmployeeService} from "../employee.service";
import { Location } from '@angular/common';
import {ActivatedRoute, RouterModule} from '@angular/router'

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})


export class DetailComponent implements OnInit {

  title = 'app-detail';
  employees: Employee[];
  @Input() empl: Employee;


  constructor(private employeeService: EmployeeService, private route: ActivatedRoute,) {
  }

  ngOnInit(): void {
    this.stampa("onInitEmployee");
    this.getEmployee();
  }

  getEmployee(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.employeeService.getEmployee(id)
      .subscribe(empl => this.empl = empl);

  }

  // UTILS



  stampa(msg: string){
    console.log(msg);
  }
}
