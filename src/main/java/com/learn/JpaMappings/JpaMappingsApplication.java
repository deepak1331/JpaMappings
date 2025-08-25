package com.learn.JpaMappings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
/*@ComponentScan(//basePackages = {"com.learn.JpaMappings.OneToMany"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX,
                pattern = "com\\.learn\\.JpaMappings\\.OneToOne\\..*"))*/
public class JpaMappingsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaMappingsApplication.class, args);
    }

}