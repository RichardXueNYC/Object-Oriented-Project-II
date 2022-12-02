
public interface AdminInterface {

	public int addEntry(PhoneBookEntry entry);
	public int Edit(String firstName, String lastName);
	public int DeleteEntry(int id);
	public void Sort();
	public int LinearSearchByPhoneNumber(String PhoneNumber);
	public PhoneBookEntry SearchbyIdBinarySearch(int id);
	public void PrintUserInfo();//print admin info
	//public void setPasscode(String passcode);//change password
	//public void setUsername(String username); //change username
	
	
	
	
}
