/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liferon.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author olanrewaju.ebenezer
 */
@SpringBootApplication

@ComponentScan("com.liferon")
//@ComponentScan(basePackages = { "net.code","net.code.repo"})

//@RestController
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class TestProjectApplication extends WebMvcConfigurerAdapter {
    
    public static void main(String[] args) {
        SpringApplication.run(TestProjectApplication.class, args);
    }
}
