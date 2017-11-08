/**
 * 
 */
package com.vikas.playground.SpringDemoOne;

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

		// close context
		context.close();
	}

}
