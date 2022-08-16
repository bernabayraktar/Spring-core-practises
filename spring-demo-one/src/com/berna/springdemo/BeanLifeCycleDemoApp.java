package com.berna.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		// close the context
		context.close();
		
		
		/*Bean scope Default(Singleton) olduğunda bean e gelen tüm istekler aynı bean e, hafızanın aynı bölgesine işaret ederken; 
		  Prototype scope kavramında bu durum tam tersi şekilde işler. */
		

	}

}
