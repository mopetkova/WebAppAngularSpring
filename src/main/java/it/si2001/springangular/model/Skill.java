package it.si2001.springangular.model;

import javax.persistence.*;

@Entity
@Table(name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Integer skillId;

    @Column(name = "name")
    private String name;

    public String toString() {
        return "\n Skill \n" +
                "[ Id: "+skillId+"  Name: "+name+" ]\n";
    }

    //Getter and Setter

    public Integer getSkillId() {
        return this.skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}