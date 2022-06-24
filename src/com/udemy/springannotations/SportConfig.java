package com.udemy.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public FortuneService myFortuneService(){
        return new SadFortuneService();
    }

    @Bean
    public Coach myCoach(){
        return new BaseballCoach(myFortuneService());
    }

}
