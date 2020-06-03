package it.project.twitter.model;

import java.util.ArrayList;

public class Tweet {
     private String id = "";
     private String idAuthor = "";
     private String dataCreation = "";
     private String lang = "";
     private String source = "";
     private String text = "";
     private ArrayList<String> userMentions = new ArrayList<String>();
     
	public String getId() {
		return id;
	}
	public void setId(String new_id) {
		this.id = new_id;
	}
	public String getIdAuthor() {
		return idAuthor;
	}
	public void setIdAuthor(String new_idAuthor) {
		this.idAuthor = new_idAuthor;
	}
	public String getDataCreation() {
		return dataCreation;
	}
	public void setDataCreation(String new_dataCreation) {
		this.dataCreation = new_dataCreation;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String new_lang) {
		this.lang = new_lang;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String new_source) {
		this.source = new_source;
	}
	public String getText() {
		return text;
	}
	public void setText(String new_text) {
		this.text = new_text;
	}
	public ArrayList<String> getUserMentions() {
		return userMentions;
	}
	
	public void setUserMentions(String u) {
		{
			if(!(userMentions.contains(u)))
				   userMentions.add(u);
		}
	}
     
     
}
