package it.si2001.springangular.converters;

import it.si2001.springangular.model.MaritalStatus;
import it.si2001.springangular.service.MaritalStatusService;
import it.si2001.springangular.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class MaritalStatusConverter implements Converter<Object, MaritalStatus> {

    @Autowired
    MaritalStatusService maritalStatusService;


    public MaritalStatusConverter() {
    }

    public MaritalStatus convert(Object o) {
        Integer id = Integer.parseInt((String) o);
        MaritalStatus ms = maritalStatusService.findById(id);
        String u = new Utils("MaritalStatusConverter", "convert "+ms).toString();
        return ms;
    }
}