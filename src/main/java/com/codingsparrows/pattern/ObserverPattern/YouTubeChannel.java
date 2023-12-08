package com.codingsparrows.pattern.ObserverPattern;

public interface YouTubeChannel {
	
	public abstract void subscribe(Subscriber s);
	public abstract void unsubcribe(Subscriber s);
	public abstract void notifySubscribers();

}
