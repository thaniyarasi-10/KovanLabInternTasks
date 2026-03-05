package com.kovanlabs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.kovanlabs")
@Import(JDBCConfig.class)
public class AppConfig {
}