package it.project.twitter.model;

import java.util.ArrayList;

public class Entity{
	
	private ArrayList<UserMention> mentions = new ArrayList<UserMention>();

	public ArrayList<UserMention> getMentions() {
		return mentions;
	}

	public void setMentions(UserMention new_mention) {
		mentions.add(new_mention);
	}
}
	
	