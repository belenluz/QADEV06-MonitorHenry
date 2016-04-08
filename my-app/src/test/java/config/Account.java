package config;

public class Account {
	private String url = "https://172.20.208.66:4040/";
	private String name = "Lucero";
	private String passwordRoomManager = "Control123";
	private String passwordExchange = "Control123!";
	private String domain = "qdv06lrc04001.cba.edu";
	
	public String getUrl(){
		return url;
	}
	public String getName(){
		return name;
	}
	public String getPasswordRoomManager(){
		return passwordRoomManager;
	}
	public String getPasswordExchange(){
		return passwordExchange;
	}
	public String getDomain(){
		return domain;
	}
}
