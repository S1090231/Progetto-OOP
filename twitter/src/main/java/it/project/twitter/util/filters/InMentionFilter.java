package it.project.twitter.util.filters;

import it.project.twitter.model.Tweet;

public class InMentionFilter {
	public InMentionFilter(Object params) {
		super();
	}

	public boolean filter(Tweet tweet) {
		for (int i = 0; i < tweet.getEntity().size(); i++) {
			for (int j = 0; j < tweet.getEntity().get(i).getMentions().size(); j++)
				if (!(tweet.getEntity().get(i).getMentions().get(j).equals(null)))
					return true;
		}
		return false;
	}
}
