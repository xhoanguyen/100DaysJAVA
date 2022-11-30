package com.luv2code.springdemo;

	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class PracticeApp {

		public static void main(String[] args) {

			// load the spring configuration file
			ClassPathXmlApplicationContext context = 
					new ClassPathXmlApplicationContext("applicationContext.xml");
					
			// retrieve bean from spring container

			Coach theCoach = context.getBean("myPowerlifterCoach", Coach.class);
			
			Coach alphaCoach = context.getBean("myPowerlifterCoach", Coach.class);
			
			// check if they are the same bean
			boolean result = (theCoach == alphaCoach);
			
			// print out the results
			System.out.println("\nPointing to the same object: " + result);
			
			System.out.println("Location theCoach: " + theCoach);
			System.out.println("Location alphaCoach: " + alphaCoach);
			
			// close the context
			context.close();
		}

	}

