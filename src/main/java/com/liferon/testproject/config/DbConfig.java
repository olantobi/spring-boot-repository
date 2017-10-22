/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liferon.testproject.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author olanrewaju.ebenezer
 */
@Configuration
public class DbConfig {

    @Value("${DATABASE_USERNAME}")
    private String DB_USERNAME;
    @Value("${DATABASE_PASSWORD}")
    private String DB_PASSWORD;
    @Value("${DATABASE_URL}")
    private String DB_URL;
    @Value("${DATABASE_DRIVER}")
    private String DB_DRIVER;
    
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .username(DB_USERNAME)
                .password(DB_PASSWORD)
                .url(DB_URL)
                .driverClassName(DB_DRIVER)
                .build();
    }
}
