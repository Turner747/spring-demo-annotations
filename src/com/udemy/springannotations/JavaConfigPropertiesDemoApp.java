package com.udemy.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigPropertiesDemoApp {

    public static void main(String[] args) {

        // read config
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get bean
        BaseballCoach theCoach = context.getBean("myCoach", BaseballCoach.class);

        // call methods
        System.out.println(theCoach.getEmail());

        System.out.println(theCoach.getTeam());

        System.out.println(theCoach.getDailyFortune());

        // close config
        context.close();

    }

}
