package com.berna.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// 1. spring yapılandırma dosyasını yükle

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. bean'i spring container' dan geri al
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// 3. bean deki metotları çağır
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		// yeni metotlarımızı çağıralım
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());

		// 4. bağlamı(contex) kapat.
		context.close();

	}

}
