package it.si2001.springangular.service;

import it.si2001.springangular.model.Employee;
import it.si2001.springangular.model.MaritalStatus;
import it.si2001.springangular.utils.Utils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service("EmployeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    String u = new Utils("EmployeeService Impl", "class").toString();

    private static final AtomicLong counter = new AtomicLong();

    private static List<Employee> users;

    static{
        users = populateDummyUsers();
    }

    @Override
    public List<Employee> findAllEmployees() {
        return users;
    }

    private static List<Employee> populateDummyUsers(){
        MaritalStatus ms = new MaritalStatus();
        List<Employee> users = new ArrayList<Employee>();

        users.add(new Employee((int) counter.incrementAndGet(),"A","B","C",ms,null,"a","a"));
        users.add(new Employee((int) counter.incrementAndGet(),"X","Y","Z",ms,null,"b","b"));
        users.add(new Employee((int) counter.incrementAndGet(),"Name","Surname","Country",ms,null,"c","c"));

        return users;
    }
}
