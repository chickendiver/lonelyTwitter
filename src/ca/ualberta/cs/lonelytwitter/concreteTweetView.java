package ca.ualberta.cs.lonelytwitter;

// This is class which uses the tweetView interface as a parent.
// You can implement more than one interface per class, so this is what separates interfaces from classes.

public class concreteTweetView implements tweetView {

	public String formatTweet(lonelyTweetModel lt) {
		return lt.getTimestamp().toString() + " | " + lt.getText();
								// ^ Turns the timestamp into a string
										//   ^ Concatenates the strings
		// The "period" is called the "dispatch operator"
		// "toString()" is a method of the "Java.util.date" class
	}

}
