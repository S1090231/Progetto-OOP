package it.project.twitter.util.filters;

import it.project.twitter.model.Tweet;
import it.project.twitter.util.extra.ArrayStringFilter;
import it.project.twitter.util.extra.Filter;
public class MentionsContentFilter extends ArrayStringFilter implements Filter{
	
	
	public MentionsContentFilter(Object params) {
		super();
	}

	public boolean filter(Tweet tweet) {
		for(String p :param) {
			for(int i=0;i<tweet.getEntity().size();i++) {
				for(int j=0; j<tweet.getEntity().get(i).getMentions().size(); j++) {
					if(tweet.getEntity().get(i).getMentions().get(j).getScreenName().equals(p))
						return true;
				}
			}
		}
		return false;
}
}