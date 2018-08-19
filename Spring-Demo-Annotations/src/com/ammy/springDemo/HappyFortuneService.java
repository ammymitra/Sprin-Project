package com.ammy.springDemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		
		return "Good Luck Buddy..";
	}

}
