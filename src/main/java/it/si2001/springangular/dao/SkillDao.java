package it.si2001.springangular.dao;


import it.si2001.springangular.model.Skill;

import java.util.List;

public interface SkillDao {

    List<Skill> allSkills();

    Skill findById(Integer skillIs);

    Skill findByName(String name);
}
