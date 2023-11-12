package com.example.SpringTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
        		new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Coach theCoach = context.getBean("tennisCoach",Coach.class);
        
        System.out.println(theCoach.getDailyWorkout());
        
        context.close();
    }
}