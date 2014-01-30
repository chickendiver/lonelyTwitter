package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetSetModel;
import android.test.ActivityInstrumentationTestCase2;

public class TweetSetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetSetModelTest(String name) {
		super(LonelyTwitterActivity.class);
	}
	
	public void testCount()
	{
		TweetSetModel tweets = new TweetSetModel();
		
		assertEquals("tweets should start empty", 0, tweets.countTweets());
		
		tweets.addTweet(new NormalTweetModel("test"));
		assertEquals("after adding a tweet, count should be 1", 1, tweets.countTweets());
	}
	
	public void testGetTweets()
	{
		TweetSetModel tweets = new TweetSetModel();
		
		tweets.addTweet(new NormalTweetModel("test"));
		tweets.addTweet(new NormalTweetModel("test2"));
		tweets.addTweet(new NormalTweetModel("test3"));
		
		ArrayList<LonelyTweetModel> testTweetList = new ArrayList<LonelyTweetModel>();
		
		testTweetList.add(new NormalTweetModel("test"));
		testTweetList.add(new NormalTweetModel("test2"));
		testTweetList.add(new NormalTweetModel("test3"));
		
		
		
		assertTrue("These two arrays should be equal", testTweetList(pos), );
	}

}
