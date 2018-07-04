package it.si2001.springangular.dao;


import it.si2001.springangular.model.Employee;

import java.util.List;

public interface EmployeeDao {


    Employee findById(int employeeId);

    void saveEmployee(Employee employee);

    List<Employee> findAllEmployees();

    Employee checkEmployee(String username, String password);

    void updateEmployee(Employee Employee);

    Employee getEmployeeById(int employeeId);

    void deleteEmployee(Employee employee);

    List<Employee> search(String search);

    Employee getEmployeeByUsername(String username);


//    void deleteEmployeeBySsn(String ssn);
//    Employee findEmployeeBySsn(String ssn);
}
