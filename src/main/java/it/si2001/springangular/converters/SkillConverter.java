package it.si2001.springangular.converters;

import it.si2001.springangular.model.Skill;
import it.si2001.springangular.service.SkillService;
import it.si2001.springangular.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SkillConverter implements Converter<Object, Skill>
{

    @Autowired
    SkillService skillService;

    public SkillConverter() { }

    public Skill convert(Object o)
    {
        Integer id = Integer.parseInt((String) o);
        Skill skill = skillService.findById(id);
        String u = new Utils("SkillConverter", "convert "+skill).toString();
        return skill;
    }
}
