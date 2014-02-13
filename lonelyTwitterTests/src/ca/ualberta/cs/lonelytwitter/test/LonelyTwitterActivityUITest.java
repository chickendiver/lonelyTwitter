package ca.ualberta.cs.lonelytwitter.test;

import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;

/*
 * generate this class with new.. JUnit Test Case
 * set superclass to ActivityInstrumentationTestCase2
 */
@SuppressLint("NewApi")
public class LonelyTwitterActivityUITest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	Instrumentation instrumentation;
	Activity activity;
	EditText textInput;
	
	public LonelyTwitterActivityUITest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		instrumentation = getInstrumentation();
		activity = getActivity();

		textInput = ((EditText) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.body));
	}
	
	public void testMakeTweet() throws Throwable{
		
		runTestOnUiThread(new Runnable(){
			@Override
			public void run(){
				makeTweet("TDD 4 LYFE #YOLO");
				fail("Failure");
			}
		});
	}
	
	public void testListViewContents() throws Throwable{
		
		runTestOnUiThread(new Runnable(){
			@Override
			public void run(){
				
				int before = 0;
				int after = 0;
				LonelyTwitterActivity activity = getActivity();
				
				ListView testListView = activity.getList();
				before = testListView.getCount();
				
				makeTweet("TEST TEXT");
				
				after = testListView.getCount();
				
				assertEquals("Size of list should increase by 1", before +1, after);
				
				LonelyTweetModel testTweet = (LonelyTweetModel) testListView.getItemAtPosition(testListView.getCount()-1);
				
				assertTrue("Tweet should be an instance of NormalTweetModel", testTweet instanceof NormalTweetModel);
				
				assertEquals("testTweet's text should be equal to 'TEST TEXT'", testTweet.getText(), "TEST TEXT");
			
			}
		});
		
		
	}
	
	public void testEditTextClearing() throws Throwable{
		
		runTestOnUiThread(new Runnable(){
			@Override
			public void run(){
				
				LonelyTwitterActivity activity = getActivity();
				
				makeTweet("TEST TEXT");
				
				
				EditText editText = (EditText) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.body);
				
				assertEquals("editText field should be blank", editText.getText().toString(), "");
			
			}
		});
	}
	
	
	
	/*
	 * fills in the input text field and clicks the 'save'
	 * button for the activity under test
	 */
	private void makeTweet(String text) {
		assertNotNull(activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.save));
		textInput.setText(text);
		((Button) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.save)).performClick();
	}
}
