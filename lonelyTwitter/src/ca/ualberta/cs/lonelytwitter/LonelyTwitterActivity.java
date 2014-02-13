package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class LonelyTwitterActivity extends Activity {

<<<<<<< HEAD:lonelyTwitter/src/ca/ualberta/cs/lonelytwitter/LonelyTwitterActivity.java
	private static final String FILENAME = "file.json";
=======
	private static final String FILENAME = "file3.sav"; // The final keyword makes the attribute a constant. Can use underscores, not camlCase
>>>>>>> 613cf932a77ca821eef79646e48b20398be07a90:src/ca/ualberta/cs/lonelytwitter/LonelyTwitterActivity.java
	private EditText bodyText;
	private ListView oldTweetsList;
	private ArrayList<NormalTweetModel> tweets;
	private ArrayAdapter<NormalTweetModel> adapter;
	
	protected List<String> tweets = new ArrayList<String>();
	protected ArrayAdapter<String> adapter;
	
	protected List<normalTweetModel> tweetList = new ArrayList<normalTweetModel>();
	
	protected Gson gson = new Gson();
	
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();
<<<<<<< HEAD:lonelyTwitter/src/ca/ualberta/cs/lonelytwitter/LonelyTwitterActivity.java
				NormalTweetModel tweet = new NormalTweetModel(text);
				saveInFile(tweet);
				tweets.add(tweet);
				clearField();
				adapter.notifyDataSetChanged();
			}
		});
		
		Button clearButton = (Button) findViewById(R.id.clear);
		clearButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				clearField();
=======
				saveInFile(text, new Date(System.currentTimeMillis()));
				//tweets = loadFromFile();
>>>>>>> 613cf932a77ca821eef79646e48b20398be07a90:src/ca/ualberta/cs/lonelytwitter/LonelyTwitterActivity.java
				adapter.notifyDataSetChanged();
			}
		});
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
<<<<<<< HEAD:lonelyTwitter/src/ca/ualberta/cs/lonelytwitter/LonelyTwitterActivity.java
		tweets = loadFromFile();
		adapter = new ArrayAdapter<NormalTweetModel>(this,
=======
		this.tweets = loadFromFile();
		this.adapter = new ArrayAdapter<String>(this,
>>>>>>> 613cf932a77ca821eef79646e48b20398be07a90:src/ca/ualberta/cs/lonelytwitter/LonelyTwitterActivity.java
				R.layout.list_item, tweets);
		oldTweetsList.setAdapter(adapter);
		
	}
	
	public ListView getList(){
		return oldTweetsList;
	}
	
	private void clearField(){
		bodyText.setText("");
	}

<<<<<<< HEAD:lonelyTwitter/src/ca/ualberta/cs/lonelytwitter/LonelyTwitterActivity.java
	private ArrayList<NormalTweetModel> loadFromFile() {
		ArrayList<NormalTweetModel> tweets = new ArrayList<NormalTweetModel>();
=======
	private ArrayList<String> loadFromFile() {
		ArrayList<String> tweets = new ArrayList<String>();
>>>>>>> 613cf932a77ca821eef79646e48b20398be07a90:src/ca/ualberta/cs/lonelytwitter/LonelyTwitterActivity.java
		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			String line = in.readLine();
			while (line != null) {
				tweets.add(NormalTweetModel.fromJSON(line));
				line = in.readLine();
				//gson.fromJson(fis, normalTweetModel.class);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
<<<<<<< HEAD:lonelyTwitter/src/ca/ualberta/cs/lonelytwitter/LonelyTwitterActivity.java
		return tweets;
=======
		return tweets;//.toArray(new String[tweets.size()]);
>>>>>>> 613cf932a77ca821eef79646e48b20398be07a90:src/ca/ualberta/cs/lonelytwitter/LonelyTwitterActivity.java
	}
	
	private void saveInFile(NormalTweetModel tweet) {
		try {
			FileOutputStream fos = openFileOutput(FILENAME,
					Context.MODE_APPEND);
<<<<<<< HEAD:lonelyTwitter/src/ca/ualberta/cs/lonelytwitter/LonelyTwitterActivity.java
			fos.write((tweet.toJSON() + "\n").getBytes());
=======
			normalTweetModel tweet = new normalTweetModel(text);
			String jsonTweet = gson.toJson(tweet);
			
			fos.write(new String(jsonTweet)
			.getBytes());
			
>>>>>>> 613cf932a77ca821eef79646e48b20398be07a90:src/ca/ualberta/cs/lonelytwitter/LonelyTwitterActivity.java
			fos.close();
			tweets.add(new String(date.toString() + " | " + text + "\n"));
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}