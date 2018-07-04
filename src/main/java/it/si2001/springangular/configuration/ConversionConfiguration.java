package it.si2001.springangular.configuration;

import it.si2001.springangular.converters.MaritalStatusConverter;
import it.si2001.springangular.converters.RoleConverter;
import it.si2001.springangular.converters.SkillConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class ConversionConfiguration {

    @Bean (name="conversionService")
    public ConversionService getConversionService() {
        ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
        bean.setConverters(getConverters());
        bean.afterPropertiesSet();
        ConversionService object = bean.getObject();
        return object;
    }

    private Set<Converter> getConverters() {
        Set<Converter> converters = new HashSet<Converter>();

        converters.add(new MaritalStatusConverter());
        converters.add(new SkillConverter());
        converters.add(new RoleConverter());

        return converters;
    }
}
