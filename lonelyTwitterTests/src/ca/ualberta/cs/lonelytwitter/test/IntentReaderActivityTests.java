package ca.ualberta.cs.lonelytwitter.test;
import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;

import android.test.ViewAsserts;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;


@SuppressLint("NewApi")
public class IntentReaderActivityTests extends
		ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public IntentReaderActivityTests() {
		super(IntentReaderActivity.class);
	}
	
	public void testSendText(){
		Intent intent = new Intent();
		String text = "hello";
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		
		setActivityIntent(intent);
		IntentReaderActivity activity = getActivity();
		
		assertEquals("IntentReaderActivity should get text from intent", text, activity.getText());
	}
	
	public void testDoubleText(){
		Intent intent = new Intent();
		String text = "hello";
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.DOUBLE);
		
		setActivityIntent(intent);
		IntentReaderActivity activity = getActivity();
		assertEquals("IntentReaderActivity should get text from intent", "hellohello", activity.getText());
				
	}
	
	public void testDisplayText(){
		Intent intent = new Intent();
		String text = "hello";
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		
		setActivityIntent(intent);
		IntentReaderActivity activity = getActivity();
		
		TextView textView = (TextView) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.intentText);
		
		assertEquals("text should be displayed", text, textView.getText().toString());
	}
	
	public void testReverseText(){
		Intent intent = new Intent();
		String text = "hello";
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.REVERSE);
		
		setActivityIntent(intent);
		IntentReaderActivity activity = getActivity();
		
		assertEquals("Reverse text should be displayed", "olleh", activity.getText());
	}
	
	public void testDefaultMessage(){
		Intent intent = new Intent();
		String defaultText = "No string given";
		setActivityIntent(intent);
		IntentReaderActivity activity = getActivity();
		
		TextView textView = (TextView) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.intentText);
		
		assertEquals("Default text should be displayed", defaultText, textView.getText().toString());
	}
	
	public void testOnScreen(){
		Intent intent = new Intent();
		setActivityIntent(intent);
		IntentReaderActivity activity = getActivity();
		
		TextView textView = (TextView) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.intentText);
		
		ViewAsserts.assertOnScreen(activity.getWindow().getDecorView(), textView);
	}
	
}
