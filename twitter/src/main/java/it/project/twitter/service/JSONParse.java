package it.project.twitter.service;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import it.project.twitter.db_connection.DbClass;
import it.project.twitter.model.Entity;
import it.project.twitter.model.Tweet;
import it.project.twitter.model.UserMention;

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
				
				Entity en = new Entity();
				JSONObject entity = (JSONObject) tweetObject.get("entities");
				
				UserMention usrMntn;
				JSONArray UserMentions = (JSONArray) entity.get("user_mentions");
					
				for(int j=0; j<UserMentions.size(); j++) {					
					usrMntn = new UserMention();
					JSONObject tweetObject2 = (JSONObject) UserMentions.get(j);
					usrMntn.setScreenName((String) tweetObject2.get("ScreenName"));
					usrMntn.setName((String) tweetObject2.get("name"));
					usrMntn.setId_usermention((long) tweetObject2.get("Id_usermention"));
					en.setMentions(usrMntn);
				}
				
				ListaTweets.add(tweet);
			}
			
			return ListaTweets;
		}

	

}
