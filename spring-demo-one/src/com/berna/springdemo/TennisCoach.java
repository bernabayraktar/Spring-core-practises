package com.berna.springdemo;

public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	

	public TennisCoach() {
		super();
	}
	

	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Do 40 minutes of wall practice after breakfast";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return getDailyFortune();
	}

}
