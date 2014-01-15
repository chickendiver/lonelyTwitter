package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class lonelyTweetModel {
	private String text; 
	
	// private = access modifier (four of them in Java: private, protected, public, default (not text))
	// Controls where you can access it from. 
	// Private = only within current class
	// Default = current class and anything else within the same package
	// Protected = current class and all its sub-classes within the package
	// Public = can view it from anywhere
	
	// Encapsulation: force other classes to go through methods in order to change attributes of a class (using private variables)
	
	private Date timestamp;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
}
