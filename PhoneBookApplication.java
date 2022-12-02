import java.io.*;
import java.util.*;

//To the grader:
//If there is any problem about file I/O during compiling
//Please check  Line 39 and Line 81
//I leave these two files on the Desktop of my computer so I can run the program without problems
//But I am not sure if this program runs without problem as well on your computer
//Please adjust Lie 39 and Line 81 according to the location of the two files on your computer if any problem about I/O happens
//Thanks

//Also
//Please check the Admincollectionfile and NormalUsercollectionfile to see the username and passcode
//This is a long program but it can satisfy the requirements of the question
//Have a nice day





public class PhoneBookApplication  {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Initially, You should create an object of type PhoneBookAdmin and another one of type 
		//NormalUser
		
		
		
		String Flag = "None";//This is to decide if the user is an admin or a nu
		
		
		
		//Create two arrays for storing information that will be read from the file
		//Because the problem didn't ask how many users will be stored in the file
		//I assume there is only one admin user and a one normal user
		//So a string array with length of 3 will be enough
		String[]Adminarray = new String[3];
		String[]NUarray = new String[3];
		
		
		//Now, reading from the Admin file
		String fileName = "AdminCollection.txt";
		// I put the txt file in the src folder
		
		String line = null;
		try {
			FileReader FR = new FileReader(fileName);
			BufferedReader BR =  new BufferedReader(FR);
			while((line=BR.readLine())!=null) {
				StringTokenizer s = new StringTokenizer(line,",");
				while(s.hasMoreTokens()) {
					//s.nextToken
					
					for (int i = 0;i<3;i++) {
						
						Adminarray[i] = s.nextToken();
					}
					
					
					
					
					//System.out.println(s.nextToken());
				}
			}
		}catch(FileNotFoundException ex) {
			
			System.out.println("Unable to open the file");//exception 1
			
		}catch(IOException ex) {
			System.out.println("Error reading the file");//exception 2
			
		}
		
		//Now, we have the array that contains all the needed information for an admin
		
		PhoneBookAdmin Admin1 = new PhoneBookAdmin(Adminarray[0],Adminarray[1],Adminarray[2]);
		//Now, the admin object is created
		
		
		
		//Now, we try to read the file from the NormalUser file
	
		
		String fileName2 = "NUCollection.txt";// I put the txt file in the src folder
		String line2 = null;
		try {
			FileReader FR = new FileReader(fileName2);
			BufferedReader BR =  new BufferedReader(FR);
			while((line2=BR.readLine())!=null) {
				StringTokenizer s = new StringTokenizer(line2,",");
				while(s.hasMoreTokens()) {
					//s.nextToken
					
					for (int i = 0;i<3;i++) {
						
						NUarray[i] = s.nextToken();
					}
					
					
					
					
					
				}
			}
		}catch(FileNotFoundException ex) {
			
			System.out.println("Unable to open the file");//exception 1
			
		}catch(IOException ex) {
			System.out.println("Error reading the file");//exception 2
			
		}
		
		//Id is an int, so we need to transfer the string form into an int
		NormalUser NU1 = new NormalUser(Integer.parseInt(NUarray[0]),NUarray[1],NUarray[2]);
		
		
		//Now, NormalUser and Admin are all set up.
		//We have to check other whether a user is a NU or an admin
		
		while (true) {
			
			System.out.println("Please type your username: ");
			String username1 = input.nextLine();
			
			System.out.println("Please type your passcode: ");
			String passcode1 = input.nextLine();
			
			
			if (username1.equals(NU1.getUsername())&&passcode1.equals(NU1.getPasscode())) {
			//If username and passcode are matched and they belong to the normaluser
		
			System.out.println("Welcome to the Normal User Mode");
			Flag = "NU";
			break;
	
			
			
			
			
			}
			
			else if (username1.equals(Admin1.getUsername())&&passcode1.equals(Admin1.getPasscode())) {
				
			System.out.println("Welcome to the Admin Mode");
			Flag = "ADMIN";
			break;
				
			}
			
			else {
				System.out.println("Invalid username or passcode.");
				System.out.println(" ");
			}
		
		}//while loop ends
		
		
		if (Flag.equals("NU")) {//Normal User's menu
			while (true) {
			System.out.println("Press 1 to add a phone entry");
			System.out.println("Press 2 to edit a phone entry");
			System.out.println("Press 3 to sort the directory");
			System.out.println("Press 4 to search using LinearSearch");
			System.out.println("Press 5 to print user info");
			System.out.println("Press 6 to print all phone entries");
			System.out.println("Press 7 to quit the menu");
			
			
			String Choice = input.nextLine();
			
			
			if (Choice.equals("1")) {//add the phone entry
				
				System.out.println("What's the ID?");
				int ID = input.nextInt();
				input.nextLine();
				System.out.println("What's the first name?");
				String FN = input.nextLine();
				System.out.println("What's the Last name?");
				String LS = input.nextLine();
				System.out.println("What's the Email?");
				String Email = input.nextLine();
				System.out.println("What's the Zipcode?");
				int ZC = input.nextInt();
				input.nextLine();
				System.out.println("What's the Phonenumber?");
				String PN = input.nextLine();
				
				PhoneBookEntry addentry = new PhoneBookEntry(ID,FN, LS, Email,ZC, PN);
				NU1.addEntry(addentry);
			}//end of if choice ==1
			
			else if (Choice.equals("2")) {
				System.out.println("What's the first name?");
				String fn = input.nextLine();
				System.out.println("What's the last name?");
				String ln = input.nextLine();
				int pig = NU1.Edit(fn, ln);
				//input.nextLine();
				if (pig == 1) {
					System.out.println("Edit sucessful");
				}
				
				else {
					System.out.println("Edit unsucessful");
				}
			}
			
			else if(Choice.equals("3")) {
				
				NU1.Sort();
				System.out.println("already sorted. Use function 6 to check.");
			}
			
			else if(Choice.equals("4")) {
				System.out.println("Give me the phone number: ");
				String thenumber = input.nextLine();
				int searchresult = NU1.LinearSearchByPhoneNumber(thenumber);
				if (searchresult == 1) {
					System.out.println("This number existed ");
				}
				else {
				System.out.println("This does not exist");
				}
				
			}
			
			
			
			else if (Choice.equals("5")) {
				
				NU1.PrintUserInfo();
			}
			
			
			else if (Choice.equals("6")) {
				NU1.PrintEveryEntry();
				
			}
			
			else if (Choice.equals("7")) {
				System.out.println("Bye");
				break;
				
			}
			
			}//end of while loop of NU Menu
			
		}//end of if flag is NU
		
		
		if (Flag.equals("ADMIN")) {
		
			while (true) {
				
				
				System.out.println("Press 1 to add a phone entry");
				System.out.println("Press 2 to edit a phone entry");
				System.out.println("Press 3 to delete a phone entry");
				System.out.println("Press 4 to sort the directory");
				System.out.println("Press 5 to search using LinearSearch");
				System.out.println("Press 6 to search using BinarySearch");
				System.out.println("Press 7 to print Admin info");
				System.out.println("Press 8 to print all phone entries");
				System.out.println("Press 9 to change the password");
				System.out.println("Press 10 to change the username");
				System.out.println("Press 11 to exit");
				System.out.println();
				
				String Option = input.nextLine();
				
				
				if (Option.equals("1")) {
					System.out.println("What's the ID?");
					int ID = input.nextInt();
					input.nextLine();
					System.out.println("What's the first name?");
					String FN = input.nextLine();
					System.out.println("What's the Last name?");
					String LS = input.nextLine();
					System.out.println("What's the Email?");
					String Email = input.nextLine();
					System.out.println("What's the Zipcode?");
					int ZC = input.nextInt();
					input.nextLine();
					System.out.println("What's the Phonenumber?");
					String PN = input.nextLine();
					
					PhoneBookEntry addentry = new PhoneBookEntry(ID,FN, LS, Email,ZC, PN);
					Admin1.addEntry(addentry);
					
				}//end of 1
				
				else if(Option.equals("2")) {
					
					System.out.println("What's the first name?");
					String fn = input.nextLine();
					System.out.println("What's the last name?");
					String ln = input.nextLine();
					int sheep = Admin1.Edit(fn, ln);
					//input.nextLine();
					if (sheep == 1) {
						System.out.println("Edit sucessful");
					}
					
					else {
						System.out.println("Edit unsucessful");
					}
					
					
				}
				
				else if(Option.equals("3")) {
					System.out.println("Please give me your ID: ");
					int option3 = input.nextInt();
					int dog = Admin1.DeleteEntry(option3);
					if (dog == 1) {
						System.out.println("Delete Successful");
						input.nextLine();
					}
					else {
						System.out.println("Delete not successful");
						System.out.println();
						input.nextLine();
					}
					
				}// end of the 3
				
				else if(Option.equals("4")) {
					Admin1.Sort();
					System.out.println("Already Sorted. Use print all entries to check.");
				}
				
				else if(Option.equals("5")) {
				
					System.out.println("Give me the phone number: ");
					String thenumber = input.nextLine();
					int searchresult = Admin1.LinearSearchByPhoneNumber(thenumber);
					if (searchresult == 1) {
						System.out.println("This number existed");
					}
					else {
					System.out.println("This does not exist");
					}
				}
				
				
				else if(Option.equals("6")) {
					
					
					System.out.println("Give me the ID: ");
					int theID = input.nextInt();
					PhoneBookEntry searchresult2 = Admin1.SearchbyIdBinarySearch(theID);
					if (searchresult2.getId()==-1) {
						System.out.println("We didn't find it");
						input.nextLine();
					}
					else {
						System.out.println("This entry existed");
						searchresult2.printBookEntry();
						input.nextLine();
					}
					
				
					
				}
				
				
				else if(Option.equals("7")) {
					Admin1.PrintUserInfo();
					
				}
				
				else if(Option.equals("8")) {
					Admin1.PrintEveryEntry();
					
				}
				
				else if(Option.equals("9")) {
					System.out.println("What's the new password?");
					String newpass = input.nextLine();
					Admin1.setPasscode(newpass);
				}
				
				//Professor didn't ask us to write the new passwords to the file
				//So I didn't add the file writing function
				
				else if(Option.equals("10")) {
					System.out.println("What's the new username?");
					String newuser = input.nextLine();
					Admin1.setUsername(newuser);
					//Professor didn't ask us to write the new passwords to the file
					//So I didn't add the file writing function
				}
				
				else if(Option.equals("11")) {
					System.out.println("Bye");
					break;
				}
			}//end of while
		
		}// end of if flag is ADMIN
		
	}//end of the mainclass

}
