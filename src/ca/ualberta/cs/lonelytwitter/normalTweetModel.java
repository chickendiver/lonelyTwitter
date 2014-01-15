package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class normalTweetModel extends lonelyTweetModel {

	public normalTweetModel(String text, Date timestamp) {
		super(text, timestamp);
		// TODO Auto-generated constructor stub
	}

	public normalTweetModel(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	@Override // FORCES THE COMPILER TO CHECK IF THE FOLLOWING IS NOT OVERRIDING SOMETHING
				// Eclipse will give you an error if you're not overriding an abstract class's abstract methods.
	
	public void setText(String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTimestamp(Date timestamp) {
		// TODO Auto-generated method stub

	}

}
