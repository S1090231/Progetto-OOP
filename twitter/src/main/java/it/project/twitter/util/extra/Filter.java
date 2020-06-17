package it.project.twitter.util.extra;

import it.project.twitter.model.Tweet;

public interface Filter {
	
	public boolean filter(Tweet tweet);
}
