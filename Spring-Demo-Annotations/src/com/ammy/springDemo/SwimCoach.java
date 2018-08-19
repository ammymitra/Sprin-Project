package com.ammy.springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class SwimCoach implements Coach {
    @Autowired
    @Qualifier("randomeFortuneService")
	private FortuneService fortuneService;
    @Value("${foo.email}")
	private String email;
    @Value("${foo.team}")
	private String team;
    
    public SwimCoach() {
		System.out.println("SWimCoach :I am in default constructor..");
	}
	@Override
	public String getDailyWorkout() {
		
		return "Go for OLympic";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getDailyFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	//definemy init method
	   @PostConstruct
	   public void doMyStuff()
	   {
		   System.out.println("SwimCoach : inside of doMyStuff()");
	   }
	//define my destroy method
	   @PreDestroy
	  public void doMyCleanupStuff()
	  {
		  System.out.println("SwimCoach : inside of doMyCleanupStuff()");
	  }

}
