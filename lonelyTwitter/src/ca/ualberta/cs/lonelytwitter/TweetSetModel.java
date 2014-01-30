package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetSetModel {
	
	private int count = 0;
	private ArrayList<LonelyTweetModel> tweetList = new ArrayList<LonelyTweetModel>();
	
	public int countTweets(){
		return count;
	}
	public void addTweet(NormalTweetModel tweet){
		count++;
	}
	
	public ArrayList<LonelyTweetModel> getTweets(){
		return tweetList;
	}
}
