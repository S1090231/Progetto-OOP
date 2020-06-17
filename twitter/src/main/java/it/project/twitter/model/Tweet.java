package it.project.twitter.model;

import java.util.ArrayList;

public class Tweet {
     private long id ;
     private String idAuthor = "";
     private String dataCreation;
     private String lang = "";
     private String source = "";
     private String text = "";
     private ArrayList<Entity> entity = new ArrayList<Entity>();
     

	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getIdAuthor() {
		return idAuthor;
	}



	public void setIdAuthor(String idAuthor) {
		this.idAuthor = idAuthor;
	}



	public String getDataCreation() {
		return dataCreation;
	}



	public void setDataCreation(String dataCreation) {
		this.dataCreation = dataCreation;
	}



	public String getLang() {
		return lang;
	}



	public void setLang(String lang) {
		this.lang = lang;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public ArrayList<Entity> getEntity() {
		return this.entity;
	}



	public void setEntity(ArrayList<Entity> entity) {
		this.entity = entity;
	}




     
}
