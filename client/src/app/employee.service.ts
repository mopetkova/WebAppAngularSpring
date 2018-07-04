///<reference path="employee.ts"/>
import {Injectable} from '@angular/core';

import {Observable, of} from 'rxjs';

import {Employee} from './employee';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError, map, tap} from 'rxjs/operators';


const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};

@Injectable({providedIn: 'root'})

export class EmployeeService {

  private employeeUrl = 'api/employees';  // URL to web api

  constructor(private http: HttpClient) {
  }

  /** GET: see employees from the server */
  allEmployees(): Observable<Employee[]> {
    this.stamapa("allEmployee()");
    return this.http.get<Employee[]>(this.employeeUrl);
  }

  /** PUT: update the employee on the server */
  updateEmployee(employee: Employee): Observable<any> {
    this.stamapa("updateEmployee()");
    return this.http.put(this.employeeUrl, employee, httpOptions);
    // return this.http.put(this.heroesUrl, employee, httpOptions).pipe(
    //   tap(_ => this.log(`updated hero id=${employee.id}`)),
    //   catchError(this.handleError<any>('updateHero'))
    // );
  }

  /** GET employee by id. Will 404 if id not found */
  getEmployee(id: number): Observable<Employee> {
    this.stamapa("getEmployee() "+id);
    const url = `${this.employeeUrl}/${id}`;
    return this.http.get<Employee>(url)
  }



  //TODO



  /** POST: add a new employee to the server */
  addEmployee(employee: Employee): Observable<Employee> {
    return null;
    // return this.http.post<Employee>(this.heroesUrl, employee, httpOptions).pipe(
    //   tap((hero: Employee) => this.log(`added hero w/ id=${hero.id}`)),
    //   catchError(this.handleError<Employee>('addHero'))
    // );
  }



  // UTILS

  stamapa(msg: string){
    console.log(msg);
  }


  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      // this.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }
  // private log(message: string) {
  //   this.messageService.add('HeroService: ' + message);
  // }

}
