//HW7 Q1 Part2
//Richard Xue


public class PhoneBook {

	//The main method
	public static void main(String[] args) {
		
		//The three objects are created.
		//This Obj1 is John Smith.
		PhoneBookEntry Obj1 = new PhoneBookEntry(5,"John","Smith","jsmith@gmail.edu",20037, "2023334444");
		//This Obj2 is James.
		PhoneBookEntry Obj2 = new PhoneBookEntry("James","202344344");
		//This Obj3 is Sarah.
		PhoneBookEntry Obj3 = new PhoneBookEntry("Sarah");
		
		//This is to test the default value of an auto constuctor
		//PhoneBookEntry Obj5 = new PhoneBookEntry();
		
	
		/*
		Obj1.printBookEntry();	
		Obj2.printBookEntry();	
		*/
		
		
		//1. Change the phone number of John Smith to 202555555
		Obj1.setPhoneNumber("202555555");
		//2. Print the attributes of John Smith using the method PrintBookEntry().
		Obj1.printBookEntry();
		//3. Assign the ZipCode of John Smith to James’s
		//We first get the ZipCode of John Smith
		int theZipCode = Obj1.getZipCode();
		//Then, we assign this ZipCode to James
		Obj2.setZipCode(theZipCode);
		
		
		//Obj5.printBookEntry();
		
		
		
	}

}
