package it.si2001.springangular.controller;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;



@EnableResourceServer
@SpringBootApplication
public class SpringApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringApplication.class, args);
    }

    @Bean
    ApplicationRunner init(/*EmployeeRepository repository*/) {
        //TODO
        return null;
//        return args -> {
//            Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
//                    "AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
//                Car car = new Car();
//                car.setName(name);
//                repository.save(car);
//            });
//            repository.findAll().forEach(System.out::println);
//        };
    }
}
