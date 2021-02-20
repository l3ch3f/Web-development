package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringDemoAnnotationsApplication {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		// close the context
		context.close();
	}

}
