package com.employee.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStarter {
	
	public static void main(String args[]) { 
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
	}

}
