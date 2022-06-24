package com.udemy.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NewJavaConfigDemoApp {

    public static void main(String[] args) {

        // read config
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get bean
        Coach theCoach = context.getBean("baseballCoach", Coach.class);

        // call methods
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        // close config
        context.close();

    }

}
