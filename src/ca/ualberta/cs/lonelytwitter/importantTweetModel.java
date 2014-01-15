package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

// This class extends (is inherited from) lonelyTweetModel (it HAS the date and time from lonelyTweetModel)
// Abstract classes must have these sub-classes
// Because this inherits and uses the constructors of the superclass, this class is polymorphic (it doesn't matter which class you use)

public class importantTweetModel extends lonelyTweetModel {

	public importantTweetModel(String text, Date timestamp) {
		super(text, timestamp);
		// TODO Auto-generated constructor stub
	}
	
	public importantTweetModel(String text) {
		super(text);
		this.text = text; // THIS OVERRIDES THE SUPERCLASS'S VERSION OF THE METHOD
	}
	
	@Override
	public void setTimestamp(Date timestamp) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void setImportance(int importance){
		if (importance > 0)
			importance = 1;
		else 
			importance = 0;
		this.importance = importance;
	}
	
}


