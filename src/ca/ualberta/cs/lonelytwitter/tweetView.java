package ca.ualberta.cs.lonelytwitter;

// Interfaces are like abstract classes, except they don't have methods.
// Views are the way we prepare data to show to the user.

public interface tweetView {
	
	String formatTweet(lonelyTweetModel lt); // You can call this in any of normalTweetModel, importantTweetModel, etc.
	
	
}
