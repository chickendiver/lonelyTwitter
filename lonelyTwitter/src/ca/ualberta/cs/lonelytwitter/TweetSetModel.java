package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetSetModel {
	
	private int count = 0;
	private ArrayList<LonelyTweetModel> tweetList = new ArrayList<LonelyTweetModel>();
	
	public int countTweets(){
		return count;
	}
	public void addTweet(NormalTweetModel tweet){
		
		int exception = 0;
		if (tweetList.size() == 0){
			tweetList.add(tweet);
			count++;
		}
		else{
			
			for (int i = 0; i < tweetList.size(); i++){
				if (tweet.equals(tweetList.get(i))){
					exception = 1;
				}
			}
			
			if (exception == 1){
				exception = 0;
				throw new IllegalArgumentException();
			}
			else{
				tweetList.add(tweet);
				count++;
			}
		}
	}
	
	public ArrayList<LonelyTweetModel> getTweets(){
		return tweetList;
	}
}
