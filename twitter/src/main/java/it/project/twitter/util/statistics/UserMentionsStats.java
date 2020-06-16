package it.project.twitter.util.statistics;

import java.util.ArrayList;

import it.project.twitter.model.Tweet;
import it.project.twitter.service.JSONParse;

public class UserMentionsStats {
   public int[] countUserMentions() {
        
	   ArrayList<Tweet> dataset = JSONParse.parse();
		int c=0;
		int numUserMentions[] = new int[100];
		for(int i=0; i<dataset.size();i++) {
			    c=dataset.get(i).getUserMentions().size();
				numUserMentions[i]=c;
		}		
		return numUserMentions;
   }
 }
