package com.codingsparrows.factory.pattern.ObserverPattern;

public class ObserverController {

	
	public static void main(String[] args) {
		System.out.println("Lets start the system");
		CodingSparrows sparrows= new CodingSparrows();
		User user1= new User(sparrows);
		User user2= new User(sparrows);
		user1.setUserName("Manish");
		user2.setUserName("Lokesh");
		
		System.out.println("user1 is subscribed to codingSparrows");
		System.out.println("User2 is subsribed to codingSparrows");
		
		System.out.println("CodingSparrows have some Update ");
		sparrows.update("GitHub Tutorial", "GithubTutorial.jpg");
		
		System.out.println("user1 is still yet to watch "+user1.getUserName() +"  "+user1.getVideoToBeWatched());
		System.out.println("user2 is still yet to watch "+user2.getUserName()+"   "+user2.getVideoToBeWatched());
	}
}
