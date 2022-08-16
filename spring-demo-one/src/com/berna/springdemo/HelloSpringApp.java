package com.berna.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//spring config dosyasını yükle
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//bean leri spring container dan geri aldığımız kısım
		Coach theCoach = context.getBean("myCoach",CricketCoach.class);
		//  myCoach-->Bean Id         Coach.Class--> Interface
		
		
		//bean lerdeki methodları çağıralım
		System.out.println(theCoach.getDailyWorkout());
		
		// fortuneservice için yeni methodları çağıralım.
		System.out.println(theCoach.getDailyFortune());
		
		
		
		//context(bağlam) i kapatalım
		context.close();
		

	}

}
