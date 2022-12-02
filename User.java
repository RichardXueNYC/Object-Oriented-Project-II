
public class User {

	//OLD
	
	 String username;
	 String passcode;
	
	User(){};//A default constructor
	
	//A constructor that accepts an username and a passcode
	User(String a, String b){
		username = a;
		passcode = b;
		
	}
	//All the getters and setters
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasscode() {
		return passcode;
	}
	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}
	
	// Also, a method for printing username and passcode
	
	public void PrintUserInfo() {
		
		System.out.println("Username: "+ username);
		System.out.println("Password: "+ passcode);
	}
	
	
	
}
