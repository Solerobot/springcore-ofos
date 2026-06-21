package com.pavan.ofos;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan("com.pavan.ofos")
@PropertySource("classpath:application.properties")
public class ofosConfig{
    
}
