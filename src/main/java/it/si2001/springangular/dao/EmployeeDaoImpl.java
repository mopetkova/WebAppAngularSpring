package it.si2001.springangular.dao;

import it.si2001.springangular.model.Employee;
import it.si2001.springangular.utils.Utils;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("EmployeeDao")
public class EmployeeDaoImpl extends AbstractDao<Integer, Employee> implements EmployeeDao {


    public List<Employee> findAllEmployees() {
        String u = new Utils("EmployeeDaoImpl", "findAllEmployee").toString();
        Criteria criteria = createEntityCriteria();
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return (List<Employee>) criteria.list();
    }


    public Employee checkEmployee(String username, String password) {
        String u = new Utils("EmployeeDaoImpl", "checkEmployee").toString();
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.and(
                Restrictions.eq("username", username),
                Restrictions.eq("password", password)));
        Employee employee = (Employee) criteria.uniqueResult();

        return employee;

    }

    public void saveEmployee(Employee employee) {
        String u = new Utils("EmployeeDaoImpl", "saveEmployee").toString();
        System.out.println(employee.toString());
        persist(employee);

    }

    public void updateEmployee(Employee employee) {
        String u = new Utils("EmployeeDaoImpl", "updateEmployee").toString();
        update(employee);
    }

    public Employee findById(int employeeId) {
        return getByKey(employeeId);
    }

    public Employee getEmployeeById(int employeeId) {
        String u = new Utils("EmployeeDaoImpl", "getEmployeeId").toString();
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("employeeId", employeeId));
        return (Employee) criteria.uniqueResult();
    }

    public void deleteEmployee(Employee employee) {
        String u = new Utils("EmployeeDaoImpl", "deleteEmployee").toString();
        delete(employee);
    }

    public List<Employee> search(String searchParam) {
        String u = new Utils("EmployeeDaoImpl", "search").toString();
        Criteria criteria = createEntityCriteria();

            criteria.add(Restrictions.or(
                    Restrictions.like("name", searchParam),
                    Restrictions.like("surname", searchParam),
                    Restrictions.like("country", searchParam),
                    Restrictions.like("username", searchParam)
            ));

        List<Employee> filterList = criteria.list();
        return filterList;
    }


    public Employee getEmployeeByUsername(String username){
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("username", username));
        return (Employee) criteria.uniqueResult();
    }

//    public void deleteEmployeeBySsn(String ssn) {
////        Query query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
////        query.setString("ssn", ssn);
////        query.executeUpdate();
//    }
//
//    public Employee findEmployeeBySsn(String ssn) {
//        Criteria criteria = createEntityCriteria();
//        criteria.add(Restrictions.eq("ssn", ssn));
//        return (Employee) criteria.uniqueResult();
//    }


//        Session session = getSession();
//        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//        CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
//        Root<Employee> from = criteriaQuery.from(Employee.class);
//        CriteriaQuery<Employee> select = criteriaQuery.select(from);
//        CriteriaQuery<Employee> where = select.where(criteriaBuilder.equal(from.get("Employeename"), Employeename),
//                criteriaBuilder.equal(from.get("password"), password));
//        List<Employee> Employees = session.createQuery(where).getResultList();
//
//        session.close();
//
//        if (Employees.size() == 1) return Employees.get(0);
//        else return null;

}