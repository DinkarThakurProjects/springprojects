package com.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloworld");
		obj.setMessage("hello there");
		obj.getMessage();
		context.close();
	}
}
