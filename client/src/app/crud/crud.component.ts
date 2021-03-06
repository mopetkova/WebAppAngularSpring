import {Component, Input, OnInit} from '@angular/core';
import {Employee} from '../employee';
import {EmployeeService} from "../employee.service";
import { Location } from '@angular/common';
import {ActivatedRoute, RouterModule} from '@angular/router'

@Component({
  selector: 'app-crud',
  templateUrl: './crud.component.html',
  styleUrls: ['./crud.component.css']
})


export class CrudComponent implements OnInit {

  title = 'app-crud';
  employees: Employee[];
  @Input() empl: Employee;


  constructor(
    private route: ActivatedRoute,
    private employeeService: EmployeeService) {
  }

  ngOnInit(): void {
    this.stampa("onInitEmployee");
    this.allEmployee();
  }

  allEmployee(): void {
    this.stampa("allEmployee");
    this.employeeService.allEmployees()
      .subscribe(employees => this.employees = employees);

  }

  getEmployee(id: number): void {
    //const id = +this.route.snapshot.paramMap.get('id');
    this.stampa("allEmployee "+id);
    this.employeeService.getEmployee(id)
      .subscribe(hero => this.empl = hero);
  }

  // updateEmployee(employee: Employee): void {
  //   this.stampa("updateEmployee");
  //   if(!employee){ return; }
  //   this.employeeService.updateEmployee( this.empl )
  //     // .subscribe(() => this.goBack());
  // }


  //TODO

  addEmployee(name: string): void {
    this.stampa("addEmployee");
      name = name.trim();
      if(!name){ return; }
      this.employeeService.addEmployee( {name} as Employee)
        .subscribe(employee => {this.employees.push(employee)})

  }



  deleteEmployee(employee: Employee): void {

  }


  // UTILS



  stampa(msg: string){
    console.log(msg);
  }
}
