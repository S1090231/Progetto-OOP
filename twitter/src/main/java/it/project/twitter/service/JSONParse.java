package it.project.twitter.service;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import it.project.twitter.db_connection.DbClass;
import it.project.twitter.model.Tweet;

public class JSONParse {
	
		public static ArrayList<Tweet> parse() {	
				
			JSONArray timeline = DbClass.JSONdownload();
		    ArrayList<Tweet> ListaTweets = new ArrayList<Tweet>();
			for(int i = 0; i < timeline.size(); i++) {
				Tweet tweet = new Tweet();
				
				JSONObject tweetObject = (JSONObject) timeline.get(i);
				tweet.setDataCreation((String) tweetObject.get("dataCreation"));
				tweet.setId((long) tweetObject.get("id"));
				tweet.setText((String) tweetObject.get("text"));
				tweet.setLang((String) tweetObject.get("lang"));
                
				
				ListaTweets.add(tweet);
			}
			
			return ListaTweets;
		}

	

}
