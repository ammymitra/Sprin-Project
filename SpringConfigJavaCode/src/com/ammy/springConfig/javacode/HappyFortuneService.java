package com.ammy.springConfig.javacode;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		
		return "It's a great day..Happy weakend..";
	}

}
