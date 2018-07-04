package it.si2001.springangular.service;


import it.si2001.springangular.model.Skill;
import it.si2001.springangular.utils.Utils;

import java.util.List;

public interface SkillService {
    String u = new Utils("SkillService Interface", "class").toString();

    List<Skill> allSkills();

    Skill findById(Integer skillId);
}
