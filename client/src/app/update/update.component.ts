import {Component, Input, OnInit} from '@angular/core';
import {Employee} from '../employee';
import {EmployeeService} from "../employee.service";
import { Location } from '@angular/common';
import {ActivatedRoute, RouterModule} from '@angular/router'

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})


export class UpdateComponent implements OnInit {

  title = 'app-crud UPDATE';
  employees: Employee[];
  @Input() empl: Employee;


  constructor(
    private route: ActivatedRoute,
    private employeeService: EmployeeService,
    private location: Location) {
  }

  ngOnInit(): void {
    this.stampa("onInitEmployee");
    this.getEmployee()
  }

  updateEmployee(): void {
    this.stampa("updateEmployee");
    this.employeeService.updateEmployee( this.empl )
      // .subscribe(empl => this.empl = empl);

      .subscribe(() => this.goBack());
  }

  getEmployee(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.employeeService.getEmployee(id)
      .subscribe(empl => this.empl = empl);

  }

  goBack(): void{
    this.location.back();
  }



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
