//HW7 Q1 Part1
//Richard Xue



public class PhoneBookEntry {

	
	//All the required variables are defined
	
	private int Id = -1; //the default Id is -1
	private String FirstName = "default firstname";
	private String LastName = "default lastname";
	private String Email = "default@gmail.com";
	private int ZipCode = -123;
	private String PhoneNumber = "-12345";
	//I give every default entry's variable a default value
	
	//A method that prints information
	public void printBookEntry() {
		
		System.out.println("First Name: "+FirstName);
		System.out.println("Last Name: "+ LastName);
		System.out.println("Id: "+ Id);
		System.out.println("Email: "+ Email);
		System.out.println("ZipCode: "+ZipCode);
		System.out.println("PhoneNumber: "+PhoneNumber);
		System.out.println();
	}
	
	//A default constructor
	public PhoneBookEntry(){
		
	};
	//A constructor that takes all attributes
	public PhoneBookEntry(int a, String b, String c, String d, int e, String f){
		Id = a;
		FirstName = b;
		LastName = c;
		Email = d;
		ZipCode = e;
		PhoneNumber = f;	
	};
	
	//A constructor that only takes firstName and phoneNumber
	public PhoneBookEntry(String a, String b){
		FirstName = a;
		PhoneNumber = b;
	}
	
	//A constructor that only takes the firstName
	public PhoneBookEntry(String a) {
		FirstName = a;
	}
	
	
	
	//All getters and setters are ready
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getZipCode() {
		return ZipCode;
	}
	public void setZipCode(int zipCode) {
		ZipCode = zipCode;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	
	

}
