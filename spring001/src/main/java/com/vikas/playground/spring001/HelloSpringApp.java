/**
 * 
 */
package com.vikas.playground.spring001;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author vrajori
 *
 */
public class HelloSpringApp {

	public static void main(String[] args) {
		// load spring context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// fetch bean from container
		Coach coach = (Coach) context.getBean("coach");

		// invoke bean method
		System.out.println(coach.getDailyWorkout());

		System.out.println(coach.tellFortune());

		// close context
		context.close();
	}

}
