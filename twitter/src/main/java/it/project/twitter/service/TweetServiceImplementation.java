package it.project.twitter.service;

import java.security.KeyStore.TrustedCertificateEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import it.project.twitter.model.Metadata;
import it.project.twitter.model.Tweet;

public class TweetServiceImplementation implements TweetService {
	
	private static Map<Integer,Tweet> alltweets = new HashMap<>();
	private static Map<String, Metadata> Metadata = new HashMap<>();
	
  

	@Override
	public Collection<Metadata> getMetada() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Tweet> getTweet() {
		// TODO Auto-generated method stub
		return null;
	}

}
