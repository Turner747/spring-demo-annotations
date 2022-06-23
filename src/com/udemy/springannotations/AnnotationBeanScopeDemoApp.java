package com.udemy.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // read config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // check if the coachs are the same
        boolean same = (theCoach == alphaCoach);

        // call methods
        System.out.println("Pointing to the same object: " + same);

        System.out.println("Memory local of theCoach: " + theCoach);

        System.out.println("Memory local of alphaCoach:" + alphaCoach);

        // close config
        context.close();

    }

}
