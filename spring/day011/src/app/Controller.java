package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import frame.TV;

public class Controller {

	public static void main(String[] args) {
		System.out.println("App Start ....");
		
		// Spring 시작 공간.
		System.out.println("Spring Start ..");
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		
		TV tv = (TV)factory.getBean("lg");
		tv.on();
		tv.off();
		
		
		System.out.println("App End ....");
	}

}
