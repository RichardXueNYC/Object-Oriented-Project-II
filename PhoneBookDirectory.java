//HW7 Q2 Part1
//Richard Xue
import java.util.Scanner;



public class PhoneBookDirectory {
	 //Import the Scanner
	 Scanner input = new Scanner(System.in);
	
	
	
	  int size = 0; //We need a size to count 
	
	 PhoneBookEntry Obj5 = new PhoneBookEntry();//An empty Entry
	 public PhoneBookEntry [] myarray = {Obj5,Obj5,Obj5,Obj5,Obj5,Obj5};
	
	
	
	
	
	
	
	//This method adds an entry to the phonebook
	public  int addEntry(PhoneBookEntry entry) {
		
		//Decides if the entry's already full
		
		if (size >= 6) {
			return 0;
		}
		//If the entry is not full, keep processing
		else {
			
			
			//We need to add the entry in the first empty space in the array
			//So, we first go through the whole array to find out the first empty space
			
			for (int i =0; i<6; i++) {
				
				if (myarray[i].getId() == -1) {
					myarray[i] = entry;
					size ++;
					return 1;
				                               }
				
			                         }
			
			
		     }
		
		return 0;
		//????
		
		
	} //the method returns 1 if the object entry was successfully added or 0 otherwise (in 
	  //case the array is full)
	
	//This method prints all phonebook entries
	public void printAllEntries() {
		
		for (int i = 0; i<6; i++) {
			if (myarray[i].getId()!=-1) {
			myarray[i].printBookEntry();
			}
		}
	}
	
	//According to the question, the PhoneNumber here is String
	
	public int LinearSearchByPhoneNumber(String PhoneNumber) {
		
		for (int i = 0; i<6; i++) {
			
			if(myarray[i].getPhoneNumber().equals(PhoneNumber)){
				
				return 1;//Found this phone number
			                                                     }	
		                          }
		return 0;
	}
	
	
	public PhoneBookEntry SearchbyIdBinarySearch(int id) {
		
		PhoneBookEntry emptyentry = new PhoneBookEntry();
		
		for (int i = 0; i<6; i++) {
			if(myarray[i].getId() == id) {
				return myarray[i];
				
				
			                             }
			
	                             }
		
		return new PhoneBookEntry();//an empty entry
	}
	
	
	public int Edit(String firstName, String lastName) {
		
		
		for (int i =0;i<6;i++) {
			if (myarray[i].getFirstName().equals( firstName)&&myarray[i].getLastName().equals( lastName)) {
			
				System.out.println("What do you want to edit?");
				System.out.println("1. First Name");
				System.out.println("2. Last Name");
				System.out.println("3. Id");
				System.out.println("4. Email");
				System.out.println("5. ZipCode");
				System.out.println("6. PhoneNumber");
				
				String choice = input.nextLine();
				if (choice.equals("1")){
				System.out.println("What's the new first name?");
				String q = input.nextLine();
				myarray[i].setFirstName(q);
				return 1;	
				}
				else if (choice.equals("2")){
					System.out.println("What's the new last name?");
					myarray[i].setLastName(input.nextLine());
					return 1;	
					}
				else if (choice.equals("3")){
					System.out.println("What's the new Id?");
					myarray[i].setId(input.nextInt());
					return 1;	
					}
				else if (choice.equals("4")){
					System.out.println("What's the new Email?");
					myarray[i].setEmail(input.nextLine());
					return 1;	
					}
				else if (choice.equals("5")){
					System.out.println("What's the new ZipCode?");
					myarray[i].setZipCode(input.nextInt());
					return 1;	
					}
				else if (choice.equals("6")){
					System.out.println("What's the new Phone Number?");
					myarray[i].setPhoneNumber(input.nextLine());
					return 1;	
					}
	
				
				
				
			}//end of if
			
			
			
		}//for loop ends here
	
		
		return 0;
	}
	
	
	//This is the sorting method
	//Inspired from https://www.softwaretestinghelp.com/sort-arrays-in-java/
	//Provide the website link that helps me according to Professor Bari's instructions
	
	public void Sort() {
		PhoneBookEntry t = new PhoneBookEntry();
		
		
for (int i = 0; i< myarray.length; i++) {
	for (int j = i+1; j< myarray.length; j++) {
						
		if (myarray[i].getId()>myarray[j].getId()) {
			t = myarray[i];
			myarray[i] = myarray[j];
			myarray[j] = t;
		}
											  }
					
					
										}
				                                         }
				
				
				
			
			
			
	
	
	
	
	
	
	
	
	
	
	
	public int DeleteEntry(int id) {
		
		for (int i = 0; i<6; i++) {
			
			if (myarray[i].getId() == id) {
				myarray[i].setId(-1);
				myarray[i].setFirstName("default firstname");
				myarray[i].setLastName("default lastname");
				myarray[i].setEmail("default@gmail.com");
				myarray[i].setZipCode(-123);
				myarray[i].setPhoneNumber("-12345");
				return 1;
		
			                           }
			
			
		                            }
		return 0;	
		
	}
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
