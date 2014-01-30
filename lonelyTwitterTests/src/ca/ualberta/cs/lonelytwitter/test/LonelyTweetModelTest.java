package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class LonelyTweetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
		
	}
	
	/*public void testFailure()	// MUST HAVE TEST CASES LIKE THIS WHICH START WITH "TEST"
	{
		assertEquals("5 should not equal 5", 5, 4);
	}*/
	
	public void testEquals() {
		Date date = new Date();
		NormalTweetModel normal = new NormalTweetModel("text", date);
		NormalTweetModel otherNormal = new NormalTweetModel("different text", date);
		
		assertFalse("different tweets are not equal", normal.equals(otherNormal));
	}
	
	public void testTweetEquality(){
		Date date = new Date();
		NormalTweetModel normal = new NormalTweetModel("TEST", date);
		ImportantTweetModel important = new ImportantTweetModel("TEST", date);
		
		assertFalse("Important and normal tweets are different", normal.equals(important));
		assertFalse("Important and normal tweets are diff", important.equals(normal));
	}

}
