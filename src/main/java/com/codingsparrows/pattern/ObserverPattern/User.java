package com.codingsparrows.pattern.ObserverPattern;

public class User implements Subscriber {
	private String userName;
	private String videoToBeWatched;
	YouTubeChannel channel;
	
	
	public User(YouTubeChannel channel) {
		this.channel=channel;
		channel.subscribe(this);
	}
	
	@Override
	public void notifySubscriber(ChannelData data) {
		
		videoToBeWatched= data.getVideoTitle();
		System.out.println(videoToBeWatched+ " still to be watched by "+ this.getUserName());
				
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getVideoToBeWatched() {
		return videoToBeWatched;
	}

	public YouTubeChannel getChannel() {
		return channel;
	}
	

}
