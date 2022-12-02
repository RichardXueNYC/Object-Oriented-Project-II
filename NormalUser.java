
public class NormalUser extends User implements NormalUserInterface{
	
	int Id;
	PhoneBookDirectory NU = new PhoneBookDirectory();
	
	
	
	public NormalUser() {
		// TODO Auto-generated constructor stub
	}
	
	public NormalUser(int a, String b, String c) {
		Id = a;
		username = b;
		passcode = c;
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	//getter and setter for Id
	
	
	public int addEntry(PhoneBookEntry entry) {
		int a = NU.addEntry(entry);
		return a;
	}
	
	public int Edit(String firstName, String lastName) {
		int a = NU.Edit(firstName, lastName);
		return a;
	}
	
	public void Sort() {
		NU.Sort();
	}
	
	public int LinearSearchByPhoneNumber(String PhoneNumber) {
		int a = NU.LinearSearchByPhoneNumber(PhoneNumber);
		return a;
	}
	
	public void PrintUserInfo() {
		System.out.println("Username: "+ username);
		System.out.println("Password: "+ passcode);
		System.out.println("Id: "+ Id);
		
	}
	
	public void PrintEveryEntry() {
		NU.printAllEntries();
		
	}//Look this method. This method helps Normal user print every entry in the array
	
	
	

}
