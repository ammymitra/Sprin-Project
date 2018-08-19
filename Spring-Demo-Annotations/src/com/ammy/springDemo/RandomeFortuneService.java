package com.ammy.springDemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomeFortuneService implements FortuneService {

	//create an array of strings
	String[] data= {"This is the best day for you..",
			"Perfect day for interview..",
			"Best day for your Date",
			"Fantastic day for all work.."};
	
	private Random myRandome=new Random();
	@Override
	public String getDailyFortune() {
		
		int index=myRandome.nextInt(data.length) ;
		
		String show=data[index];
		
		return show;
	}

}
