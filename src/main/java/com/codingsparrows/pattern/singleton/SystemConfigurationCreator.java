package com.codingsparrows.pattern.singleton;

public class SystemConfigurationCreator {
	
	public static void main(String[] args) {
		
	
		
		Thread thread= new Thread( () ->{
			
			
			for(int i=0;i<100;i++) {

				SystemConfiguration.getInstance();
			}
		});
		
		Thread  thread2 = new Thread(()->{
			 try {
	                // Introducing a delay in thread2
	                Thread.sleep(100);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
			for(int i=0;i<100;i++) {

				 SystemConfiguration.getInstance();
			}
			
		});
		
		thread.start();
		thread2.start();
		SystemConfiguration configuration= SystemConfiguration.getInstance();
		SystemConfiguration configuration2= SystemConfiguration.getInstance();
		SystemConfiguration configuration3= SystemConfiguration.getInstance();
		System.out.println(configuration==configuration2);
		System.out.println(configuration2==configuration3);
		System.out.println("Program end");
	}

}
