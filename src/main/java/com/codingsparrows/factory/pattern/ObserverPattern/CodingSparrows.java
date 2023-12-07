package com.codingsparrows.factory.pattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class CodingSparrows implements YouTubeChannel {

	List<Subscriber> subs = new ArrayList<Subscriber>();
	private String videoTitle;
	private ChannelData channelData;

	public void update(String videoName, String photoName) {
		System.out.println("Welcome to codingsparrows, Please enjoy newly added video " + videoName);
		this.channelData = new ChannelData();
		channelData.setVideoTitle(videoName);
		channelData.setPhotoTitle(photoName);

		notifySubscribers();
	}

	@Override
	public void subscribe(Subscriber s) {
		subs.add(s);
	}

	@Override
	public void unsubcribe(Subscriber s) {
		subs.remove(s);
	}

	@Override
	public void notifySubscribers() {
		System.out.println("We have sucessfully Uploaded the video, Now lets notify my all users");
		for (Subscriber s : subs) {
			s.notifySubscriber(this.channelData);
		}
		System.out.println("All users have been notified");
	}

}
