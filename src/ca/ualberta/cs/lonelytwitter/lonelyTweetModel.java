package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class lonelyTweetModel {
	protected String text; 
	
	// In here, private = access modifier (four of them in Java: private, protected, public, default (not text))
	// Controls where you can access it from. 
	// Private = only within current class
	// Default = current class and anything else within the same package
	// Protected = current class and all its sub-classes within the package
	// Public = can view it from anywhere
	
	protected Date timestamp;
	protected int importance;
	
	// Constructor
	public lonelyTweetModel(String text, Date timestamp) {
		super(); // Class's parent's constructor is called (inheritance)
		this.text = text;
		this.timestamp = timestamp;
		this.importance = 0;
	}
	
	// Constructor II (Overloading -- Will be called if the parameters are appropriate)
	public lonelyTweetModel(String text) {
		super(); // Class's parent's constructor is called (inheritance)
		this.text = text;
		this.timestamp = new Date(); // Gives the timestamp the timestamp of right now. 
							// "new" creates a new object of the java.util.Date class
		this.importance = 0;
	}
		
	// Encapsulation: force other classes to go through methods in order to change attributes of a class (using private variables)
	
	public String getText() {
		return text;
	}

	public abstract void setText(String text);

	public Date getTimestamp() {
		return timestamp;
	}

	public abstract void setTimestamp(Date timestamp);
	
	public int getImportance(){
		return importance;
	}
	
	public abstract void setImportance(int importance);
	
}
