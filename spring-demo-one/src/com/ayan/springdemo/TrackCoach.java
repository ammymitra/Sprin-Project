package com.ayan.springdemo;

public class TrackCoach implements Coach {

	//define a private field for the dependency
	private FortuneService fortuneService;
	//define a constructor for dependency injection
	 public TrackCoach(FortuneService thefortuneservice) {
		fortuneService=thefortuneservice;
	}
	//define no-arg constructor
	 public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 10k";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	//add an init method
	   public void doMyStaff()
	   {
		   System.out.println("TrackCoach : Inside the method doMyStaff");
	   }
	//add a destroy method
	   public void doMyCleanupStaff()
	   {
		   System.out.println("TrackCoach : Inside the method doMyCleanupStaff");
	   }

}


 