package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


// Because the superclass is abstract, we must override its abstract methods

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
	
	@Override
	public void setImportance(boolean importance) throws Exception {
		if (importance){
			throw new IllegalArgumentException(); // Pretty obvious. If you can't find the proper exception, then Google the Java doc.
		}
		this.importance = importance;
	}

}
