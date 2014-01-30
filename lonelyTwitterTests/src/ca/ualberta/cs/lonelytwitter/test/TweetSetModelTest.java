package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;
import java.util.Date;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetSetModel;
import android.test.ActivityInstrumentationTestCase2;

public class TweetSetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetSetModelTest() {
		super(LonelyTwitterActivity.class);
	}
	
	/*public void testCount()
	{
		TweetSetModel tweets = new TweetSetModel();
		
		assertEquals("tweets should start empty", 0, tweets.countTweets());
		
		tweets.addTweet(new NormalTweetModel("test"));
		assertEquals("after adding a tweet, count should be 1", 1, tweets.countTweets());
	}*/
	
	public void testGetTweets()
	{
		
		Date date = new Date();
		TweetSetModel tweets = new TweetSetModel();
		
		tweets.addTweet(new NormalTweetModel("test", date));
		tweets.addTweet(new NormalTweetModel("test2", date));
		tweets.addTweet(new NormalTweetModel("test3", date));
		
		ArrayList<LonelyTweetModel> testTweetList = new ArrayList<LonelyTweetModel>();
		
		assertTrue("test", 1==1);
		testTweetList.add(new NormalTweetModel("test", date));
		testTweetList.add(new NormalTweetModel("test2", date));
		testTweetList.add(new NormalTweetModel("test3", date));
		
		ArrayList<LonelyTweetModel> tweetReturnList = tweets.getTweets();
		
		for (int i = 0; i < 3; i++)
		{
			assertTrue("These two arrays should be equal", testTweetList.get(i).equals(tweetReturnList.get(i)));
		}
	}

}
