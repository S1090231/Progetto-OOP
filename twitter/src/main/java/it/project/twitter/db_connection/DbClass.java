package it.project.twitter.db_connection;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


import org.json.simple.JSONArray;
import org.json.simple.JSONValue;



public class DbClass {
	public static JSONArray JSONdownload() {
        String url = "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/user/1.1/statuses/user_timeline.json?count=100";
		String data = "";
		String line = "";
		try {
			
			URLConnection openConnection = new URL(url).openConnection();
			openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			InputStream in = openConnection.getInputStream();
			
			try {
				
				InputStreamReader inR = new InputStreamReader( in );
				BufferedReader buf = new BufferedReader( inR );
				  
				while ( ( line = buf.readLine() ) != null ) {
					data+= line;
				}
				
			}finally {
				in.close();
			} 
			
		}catch (IOException e) {	
				e.printStackTrace();	
		}catch (Exception e) {	
			e.printStackTrace();	
		}	
		
		JSONArray json_tweet = null;
		try {
			json_tweet = (JSONArray) JSONValue.parse(data);
			 return json_tweet;
		}catch(Exception e ) {
			e.printStackTrace();	
		}
		
		return json_tweet;
	}
	

	
	
}


