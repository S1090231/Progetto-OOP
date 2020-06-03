package it.project.twitter.model;

public class UserMention {
	private String ScreenName;
	private String name;
	private int Id_usermention;
	
	
	public UserMention() {
		super();
	}
	
	public String getScreenName() {
		return ScreenName;
	}
	
	public void setScreenName(String screenName) {
		ScreenName = screenName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public int getId_usermention() {
		return Id_usermention;
	}

	public void setId_usermention(int Id_usermention) {
		this.Id_usermention = Id_usermention;
	}
	
	

}
