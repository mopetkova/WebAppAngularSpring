package it.si2001.springangular.model;

import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name="user_profile")
public class UserProfile implements Serializable
{


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name = "user_profile_id")
    private Integer userProfileId;

    @Column(name="type", length=15, unique=true, nullable=false)
    private String type ;

//    @ManyToMany(mappedBy = "userProfiles")
//    List<Employee> employees;

    //Getter and Setter


    public Integer getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(Integer userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public List<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((userProfileId == null) ? 0 : userProfileId.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof UserProfile))
            return false;
        UserProfile other = (UserProfile) obj;
        if (userProfileId == null) {
            if (other.userProfileId != null)
                return false;
        } else if (!userProfileId.equals(other.userProfileId))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "UserProfile [id=" + userProfileId + ", type=" + type + "]";
    }




}