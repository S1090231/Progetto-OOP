package it.project.twitter.service;

import java.util.Collection;

import it.project.twitter.model.Metadata;
import it.project.twitter.model.Tweet;

public interface TweetService {

	public abstract Collection<Metadata> getMetada();
    public abstract Collection<Tweet> getTweet();

}
