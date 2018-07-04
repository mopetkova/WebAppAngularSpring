package it.si2001.springangular.converters;

import it.si2001.springangular.model.UserProfile;
import it.si2001.springangular.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter implements Converter<Object, UserProfile> {

    @Autowired
    UserProfileService userProfileService;

    public RoleConverter() { }

    public UserProfile convert(Object o)
    {
        return userProfileService.findByType((String) o);
    }
}
