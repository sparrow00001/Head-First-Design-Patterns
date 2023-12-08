package com.codingsparrows.pattern.ObserverPattern;

public class ChannelData {
	
	private String videoTitle;
	private String photoTitle;
	
	public String getVideoTitle() {
		return videoTitle;
	}
	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}
	public String getPhotoTitle() {
		return photoTitle;
	}
	public void setPhotoTitle(String photoTitle) {
		this.photoTitle = photoTitle;
	}
	@Override
	public String toString() {
		return "ChannelData [videoTitle=" + videoTitle + ", photoTitle=" + photoTitle + "]";
	}
	

}
