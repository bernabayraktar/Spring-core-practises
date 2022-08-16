package com.berna.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;
	
	
	private FortuneService fortuneService;
	
	//create a no-arg constr
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");	
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAdress");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}



	public FortuneService getFortuneService() {
		return fortuneService;
	}



	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Practise fast bowling for 15 min";
	}

	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
