package com.l3ch3f;


public class HelloSpringApp {
    public static void main(String[] args) {
        // Load the spring config file
        ClassPathXmlApplicationContext context;
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        // close the context
        context.close();
    }
}
