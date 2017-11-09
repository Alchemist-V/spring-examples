package com.vikas.playground.spring001;

import com.vikas.playground.spring001.fortune.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService service) {
		fortuneService = service;
	}

	public String getDailyWorkout() {
		return "dash 100m run";
	}

	public String tellFortune() {
		return "from track coach, " + fortuneService.tellFortune();
	}

}
