
public class PhoneBookAdmin extends User implements AdminInterface{

	String emailAddress;
	PhoneBookDirectory Admin = new PhoneBookDirectory();
	
	
	public PhoneBookAdmin() {
		// a default constructor
	}
	
	public PhoneBookAdmin(String a, String b, String c) {
		username = a;
		passcode = b;
		emailAddress = c;
		
	} // a constructor that accepts all info

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}//getter and setters as always
	
	
	//Now, override the print method in user
	
public void PrintUserInfo() {
		
		System.out.println("Username: "+ username);
		System.out.println("Password: "+ passcode);
		System.out.println("Email: "+ emailAddress);
	}
	
	//Add a phone entry
	public int addEntry(PhoneBookEntry entry) {
		int a = Admin.addEntry(entry);
		return a;
		
	}
	
	//Edit a phone entry of a given first name and last name
	public int Edit(String firstName, String lastName) {
		int a = Admin.Edit(firstName, lastName);
		return a;
		
	}
	
	//Delete
	public int DeleteEntry(int id) {
		
		int a = Admin.DeleteEntry(id);
		return a;
	}
	
	
	//Sort
	public void Sort() {
		Admin.Sort();
		
	}
	
	//Linear Search
	public int LinearSearchByPhoneNumber(String PhoneNumber) {
		int a = Admin.LinearSearchByPhoneNumber(PhoneNumber);
		return a;
		
	}
	
	//Binary Search
	public PhoneBookEntry SearchbyIdBinarySearch(int id) {
		PhoneBookEntry a = Admin.SearchbyIdBinarySearch(id);
		return a;
	}
	
	
	
	public void PrintEveryEntry() {
		Admin.printAllEntries();
		
	}//Look this method. This method helps Normal user print every entry in the array
	

}
