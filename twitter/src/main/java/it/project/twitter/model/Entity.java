package it.project.twitter.model;

import java.util.ArrayList;

public class Entity{
	
	private ArrayList<UserMention> mentions = new ArrayList<UserMention>();

	public ArrayList<UserMention> getMentions() {
		return mentions;
	}

	public void setMentions(ArrayList<UserMention> mentions) {
		this.mentions = mentions;
	}
}
	
	