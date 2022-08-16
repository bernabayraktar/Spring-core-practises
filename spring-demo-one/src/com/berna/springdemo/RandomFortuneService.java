package com.berna.springdemo;

public class RandomFortuneService implements FortuneService {
	
	//array containing fortune variants is defined
	String[] fortunes = {"Palmistry", "tarot", "Coffee"};


	@Override
	public String getFortune() {
		
		return fortunes[(int) (Math.random()*3)];
	}

}
