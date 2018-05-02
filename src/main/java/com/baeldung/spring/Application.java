package com.baeldung.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.HashSet;


@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {

        SpringApplication sa = new SpringApplication();
        sa.addListeners(new EndpointsListener());
        sa.setSources(new HashSet(Arrays.asList(Application.class)));
        ConfigurableApplicationContext context = sa.run(args);
    }
}
