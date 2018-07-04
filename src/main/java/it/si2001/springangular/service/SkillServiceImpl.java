package it.si2001.springangular.service;

import it.si2001.springangular.dao.SkillDao;
import it.si2001.springangular.model.Skill;
import it.si2001.springangular.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("SkillService")
@Transactional
public class SkillServiceImpl implements SkillService {
    String u = new Utils("SkillService Impl", "class").toString();

    @Autowired
    private SkillDao dao;

    public List<Skill> allSkills() {
        return dao.allSkills();
    }

    @Override
    public Skill findById(Integer skillId) {

        return dao.findById(skillId);
    }

}
