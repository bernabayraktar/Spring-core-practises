package com.berna.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopePractiseApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanScopePractise-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach otherCoach = context.getBean("myCoach", Coach.class);

		boolean result = (theCoach == otherCoach);

		System.out.println("\n Memory location: theCoach -->  " + theCoach);

		System.out.println("\n Memory location: otherCoach  -->   " + otherCoach);

	}

}
