package it.si2001.springangular.controller;


import it.si2001.springangular.model.Employee;
import it.si2001.springangular.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/")
public class AngularRestController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
        return "Welcome to RestTemplate Example";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> listAllEmployee() {
        List<Employee> listEmployees = employeeService.findAllEmployees();
        if (listEmployees.isEmpty()) {
            return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
        } else {
            System.out.println(listEmployees);
            return new ResponseEntity<List<Employee>>(listEmployees, HttpStatus.OK);
        }
    }
}
