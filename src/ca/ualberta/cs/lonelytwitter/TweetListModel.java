package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {
	private ArrayList<lonelyTweetModel> list; //Must specify the type of what's in the ArrayList within the <> after you specify ArrayList (shown)

	public ArrayList<lonelyTweetModel> getList() { // If you want your ArrayList to store anything, specify "Object" as the type. Everything is a subclass of Object
		return list;
	}

	public void setList(ArrayList<lonelyTweetModel> list) {
		this.list = list;
	}
	
}
