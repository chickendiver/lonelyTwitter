package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


// A controller manipulates the model, and no other code should do this.
// This is where you instantiate a new object from the model and do shit with it.

public class TweetListController { 
	private static TweetListModel tweetListModel = null; // Create a new TweetListModel, called tweetListModel. TweetListModel is the type.
	
	public TweetListController() {
		super();
		if (tweetListModel == null){
			tweetListModel = new TweetListModel();
		}
	}
	
	public void addTweet(String text) {
		lonelyTweetModel lt = new normalTweetModel(text); // Can't use LonelyTweetModel here because it's an abstract base class
		ArrayList<lonelyTweetModel> list = tweetListModel.getList();
		list.add(lt);									  // This should be in a controller, not a view, not a model, etc.
	}
	
		
}
