package it.si2001.springangular.configuration;


import it.si2001.springangular.converters.MaritalStatusConverter;
import it.si2001.springangular.converters.RoleConverter;
import it.si2001.springangular.converters.SkillConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "it.si2001.springangular")
public class AppConfig extends WebMvcConfigurerAdapter {

    @Autowired
    public AppConfig() {

    }
    @Autowired
    SkillConverter skillConverter;

    @Autowired
    MaritalStatusConverter maritalStatusConverter;

    @Autowired
    RoleConverter roleConverter;


    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.ignoreAcceptHeader(true).defaultContentType(
                MediaType.TEXT_HTML);
    }


    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(skillConverter);
        registry.addConverter(maritalStatusConverter);
        registry.addConverter(roleConverter);
    }

    @Bean
    public ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {
        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
        resolver.setContentNegotiationManager(manager);
        return resolver;
    }


    @Bean
    public ViewResolver jspViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer matcher) {

        matcher.setUseRegisteredSuffixPatternMatch(true);
    }

//    @Bean
//    public MaritalStatusConverter getMyConverterStatus()
//    {
//        return new MaritalStatusConverter();
//    }
//    @Bean
//    public SkillConverter getMyConverterSkill()
//    {
//        return new SkillConverter();
//    }

//        @Bean
//    public ViewResolver jaxb2MarshallingXmlViewResolver() {
//        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//        marshaller.setClassesToBeBound(Employee.class);
//        return new Jaxb2MarshallingXmlViewResolver(marshaller);
//    }


}
