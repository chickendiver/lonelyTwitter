package ca.ualberta.cs.lonelytwitter;

// This is class which uses the tweetView interface as a parent.
// You can implement more than one interface per class, so this is what separates interfaces from classes.

public class ConcreteTweetView implements tweetView {

	public String formatTweet(lonelyTweetModel lt) {
		return lt.getTimestamp().toString() + " | " + lt.getText();
								// ^ Turns the timestamp into a string
										//   ^ Concatenates the strings
		// The "period" is called the "dispatch operator"
		// "toString()" is a method of the "Java.util.date" class
	}

}


// CLASSNAMES IN JAVA START WITH AN UPPERCASE LETTER

// METHODS, ATTRIBUTES, OBJECTS, ETC., ALL START WITH LOWERCASE

// CAMEL CASE IS USED

// Java styleguide (Google/Oracle) has this information

// Want to change the name of a class? Click "Refactor" then "rename" by right-clicking the name.