package it.project.twitter.service;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



import it.project.twitter.model.Metadata;
import it.project.twitter.model.Tweet;

public class TweetServiceImplementation implements TweetService {
	
	private static Map<Long,Tweet> alltweets = new HashMap<>();
	private static Map<String, Metadata> metadata = new HashMap<>();
	
	public TweetServiceImplementation() {
		super();
		try {
			ArrayList<Tweet> tmln = JSONParse.parse();
			for(int i=0; i<tmln.size(); i++) {
			Tweet tmln1 = tmln.get(i);
			alltweets.put(tmln1.getId(),tmln1);
			}
			
			ArrayList<Metadata> mt = MetadataArray.getArrayMetadata();
			for(int i=0; i<mt.size(); i++) {
			Metadata mt1 = mt.get(i);
			metadata.put(mt1.getAlias(), mt1);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public Collection<Metadata> getMetada() {
		return metadata.values();
	}

	@Override
	public Collection<Tweet> getTweet() {
		return alltweets.values();
	}

}
