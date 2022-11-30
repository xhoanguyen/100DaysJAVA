package com.luv2code.springdemo;

public class PowerlifterCoach implements Coach {
	
	FortuneService fortuneService;
	
	public PowerlifterCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Do more Dealifts, Bench and Squats.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}


}
