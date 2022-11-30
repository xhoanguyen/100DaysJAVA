package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// add new fields for emailAddress and team
	
	private String emailAddress;
	private String team;
	
	

	// create no-arg constructor
	
	public CricketCoach() {
		//System.out.println("CricketCoach: inside no arg construtor");
	}
	
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setEmailAddress(String emailAddress) {
		//System.out.println("CricketCoach: inside setter method - setEmailAddress.");
		this.emailAddress = emailAddress;
	}


	public void setTeam(String team) {
		//System.out.println("CricketCoach: inside setter method - setTeam.");
		this.team = team;
	}


	// this setter get call by Spring to inject the dependency
	public void setFortuneService(FortuneService fortuneService) {
		//System.out.println("CricketCoach: inside setter method - setFortuneService.");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 min.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
