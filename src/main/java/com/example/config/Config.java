package com.example.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.example")
@Import( {JdbcConfig.class, MybatisConfig.class} )
public class Config {
}
