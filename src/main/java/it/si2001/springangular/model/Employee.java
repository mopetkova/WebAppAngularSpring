package it.si2001.springangular.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int employeeId;
    private String name;
    private String surname;
    private String country;
    private MaritalStatus maritalStatus;
    private Date birthDate;
    private String username;
    private String password;
    //private List<Skill> skills;


    public Employee(int employeeId, String name, String surname, String country, MaritalStatus maritalStatus, Date birthDate, String username, String password) {
        this.employeeId = employeeId;
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.maritalStatus = maritalStatus;
        this.birthDate = birthDate;
        this.username = username;
        this.password = password;
    }

    public Employee(){
        employeeId=0;
    }


    //Getter and Setter


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (employeeId ^ (employeeId >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (employeeId != other.employeeId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [id=" + employeeId + ", name=" + name + "]";
    }


}