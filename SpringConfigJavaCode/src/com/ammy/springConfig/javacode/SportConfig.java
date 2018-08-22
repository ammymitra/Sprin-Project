package com.ammy.springConfig.javacode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.ammy.springConfig.javacode")
@PropertySource("classpath:sports.properties")
public class SportConfig {
	
	//define bean for our happy fortune service
	@Bean
	public FortuneService happyFortuneService()
	{
		return new HappyFortuneService();
	}
	//define bean for our cricket coach and Inject dependencies
	@Bean
	public Coach cricketCoach()
	{
		return new CricketCoach(happyFortuneService());
	}
  
}
