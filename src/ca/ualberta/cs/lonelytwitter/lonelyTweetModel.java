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
	
	private Date timestamp;
	
	// Constructor
	public lonelyTweetModel(String text, Date timestamp) {
		super(); // Class's parent's constructor is called (inheritance)
		this.text = text;
		this.timestamp = timestamp;
	}
	
	// Constructor II (Overloading -- Will be called if the parameters are appropriate)
	public lonelyTweetModel(String text) {
		super(); // Class's parent's constructor is called (inheritance)
		this.text = text;
		this.timestamp = new Date(); // Gives the timestamp the timestamp of right now. 
							// "new" creates a new object of the java.util.Date class
	}
		
	// Encapsulation: force other classes to go through methods in order to change attributes of a class (using private variables)
	
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
