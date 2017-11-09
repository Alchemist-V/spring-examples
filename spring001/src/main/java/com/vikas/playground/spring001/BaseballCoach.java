/**
 * 
 */
package com.vikas.playground.spring001;

import com.vikas.playground.spring001.fortune.FortuneService;

/**
 * @author vrajori
 *
 */
public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "spend 45 mins daily in nets";
	}

	public String tellFortune() {
		return fortuneService.tellFortune();
	}
}
