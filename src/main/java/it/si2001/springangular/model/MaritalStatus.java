package it.si2001.springangular.model;

import javax.persistence.*;

@Entity
@Table(name = "marital_status")
public class MaritalStatus {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "marital_status_id")
    private Integer maritalStatusId;

    @Column(name = "status")
    private String status;

    public String toString() {
    return "\n Marital Status \n" +
            "[ Id: "+maritalStatusId+"  Status: "+status+" ]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((maritalStatusId == null) ? 0 : maritalStatusId.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof MaritalStatus))
            return false;
        MaritalStatus other = (MaritalStatus) obj;
        if (maritalStatusId == null) {
            if (other.maritalStatusId != null)
                return false;
        } else if (!maritalStatusId.equals(other.maritalStatusId))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }


    //Getter and Setter

    public Integer getMaritalStatusId() {

        return this.maritalStatusId;
    }

    public void setMaritalStatusId(Integer maritalStatusId) {

        this.maritalStatusId = maritalStatusId;
    }

    public String getStatus() {

        return this.status;
    }

    public void setStatus(String status) {

        this.status = status;
    }
}
