package ru.kuznetsov.springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Kill the second problem – manual objects creation. 
 * We don't create different objects right here. 
 * All objects are beans. Spring create them. XML file has class names and required parameters. 
 */

public class Main {
public static void main (String [] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			"applicationContext.xml"); 											 // Create app.context and set XML file with configurations
	
	MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // Get bean from context														 

	musicPlayer.playMusic();
	
	context.close();
}
}
