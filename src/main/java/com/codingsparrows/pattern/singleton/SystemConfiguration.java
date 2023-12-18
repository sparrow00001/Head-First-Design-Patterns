package com.codingsparrows.pattern.singleton;

public class SystemConfiguration {

	private static SystemConfiguration configuration;
	private static int counter=0;
	
	private SystemConfiguration() {
		System.out.println("System Configuration Constructor called "+ ++counter + " times");
		
	}
		
	public static  SystemConfiguration getInstance() {
		System.out.println("getting the instance ");
		
		if(configuration==null) {
			synchronized (SystemConfiguration.class) {
				if(configuration==null) {
					 configuration= new SystemConfiguration();
				}
				
			}
		}
		return configuration;
	}
	
}
