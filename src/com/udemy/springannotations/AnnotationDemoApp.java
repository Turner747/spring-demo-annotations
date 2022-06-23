package com.udemy.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call methods
        System.out.println(theCoach.getEmail());

        System.out.println(theCoach.getTeam());

        System.out.println(theCoach.getDailyFortune());

        // close config
        context.close();

    }

}
