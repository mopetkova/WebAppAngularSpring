package it.si2001.springangular.service;

import it.si2001.springangular.model.Employee;
import it.si2001.springangular.utils.Utils;

import java.util.List;

public interface EmployeeService {
    String u = new Utils("EmployeeService Interface", "class").toString();

    List<Employee> findAllEmployees();

//    Employee checkEmployee(String a, String b);
//
//    void saveEmployee(Employee employee);
//
//    void updateEmployee(Employee employee);
//
//    Employee getEmployeeById(int employeeId);
//
//    Employee getEmployeeByUsername(String username);
//
//    void deleteEmployee(Employee employee);
//
//    List<Employee> search(String search);

//    String insertMaritalStatus(Employee employee, String maritalStatusName);
}
