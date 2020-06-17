package it.project.twitter.model;

public class UserMention {
	private String ScreenName;
	private String name;
	private long Id_usermention;
	
	
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
    public long getId_usermention() {
		return Id_usermention;
	}

	public void setId_usermention(long Id_usermention) {
		this.Id_usermention = Id_usermention;
	}
	
	

}
