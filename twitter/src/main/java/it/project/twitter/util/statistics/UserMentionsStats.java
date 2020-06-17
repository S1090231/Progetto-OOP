package it.project.twitter.util.statistics;

import java.util.ArrayList;

import it.project.twitter.model.Tweet;
import it.project.twitter.service.JSONParse;

public class UserMentionsStats {
   public int[] countUserMentions() {
        
	   ArrayList<Tweet> dataset = JSONParse.parse();
		int c=0;
		int numUserMention[] = new int[100];
		for(int i=0; i<dataset.size();i++) {
			for(int j=0; j<dataset.get(i).getEntity().size();j++) {
				c=dataset.get(i).getEntity().get(j).getMentions().size();
				numUserMention[i]=c;
			}
		}		
		return numUserMention;
   }
}
