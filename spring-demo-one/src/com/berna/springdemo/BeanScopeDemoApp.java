package com.berna.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// check if they are the same
		boolean result = (theCoach == alphaCoach);

		// print out the results
		System.out.println("\nPointing to the same objects? " + result);

		System.out.println("\n Memory location for theCoach: " + theCoach);

		System.out.println("\n Memory location for alphaCoach: " + alphaCoach + "\n");

		// close the context
		context.close();
		
		
		/*Bean scope Default(Singleton) olduğunda bean e gelen tüm istekler aynı bean e, hafızanın aynı bölgesine işaret ederken; 
		  Prototype scope kavramında bu durum tam tersi şekilde işler. */
		

	}

}
