package dtp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestDinnerTable {
	
public static void main(String[] args) {
	boolean continueLoop = true;
	
	while(continueLoop == true) { // Starts a while loop that will run the program until the user decides to terminate it.
		
		System.out.println("Would you like to enter the name of a guest data file? (Respond with y or n) ");
		Scanner userInputYesNo = new Scanner(System.in);
		String yesNoResponse = userInputYesNo.next(); // Creates a scanner object of the user's yes/no response to the on screen prompt.
		
		if( ((Character)yesNoResponse.charAt(0)).equals('n') ) { // If the user does not want to enter a name for a guest data file, then the program ends.
			System.out.print("Goodbye!");
			continueLoop = false;
		}
		
		else if ( ((Character)yesNoResponse.charAt(0)).equals('y') ) { // If the user does want to enter the name for a guest data file, then the rest
			// of the program runs. 
			
			System.out.println("Please enter the name of the guest data file: ");
			Scanner userInputFileName = new Scanner(System.in);
			String fileName = userInputFileName.next(); // Creates a scanner object of the file name that the user inputs. 
			File file = new File(fileName);	// Creates a file object of the file with the file name given by the user
			
				try {
					ArrayList<Person> guests = new ArrayList<>(); // Creates a blank array list of Person objects  that will be filled below.
					Scanner listInput = new Scanner(file); // Creates a new scanner object of the guest list file.
							
					while ( listInput.hasNextLine() == true ) { // Runs a while loop that loops through every line of the guest data file as long as there
						// is a next line.
						
						String name = listInput.next(); // The first entry of every line is assigned to be a person's name 
						int age = Integer.parseInt(listInput.next()); // The second entry is assigned to be the person's age.
						char sex = listInput.next().charAt(0); // The third entry is assigned to be the person's sex.
						Character relationshipStatus = listInput.next().charAt(0); // The fourth entry of every line is assigned to be the person's 
						// relationship status. 
						
						String temp = listInput.next(); // The fifth entry of every line as assigned to be a string named temporary.
						char isLooking = 0;
						String partnerName = null;
						if( relationshipStatus.equals('s') == true ){ // If the person's relationship status is single, the the temporary string is 
							// assigned to be their "is looking for a new partner" status.
							isLooking = temp.charAt(0);
						}
						else { // If the person is in a relationship, then the temporary string is assigned to be the person's partner's name.
							partnerName = temp;
						}
						
						if ( relationshipStatus.equals('s') == true ) { // If the person's relationship status is single, the a new Single Person object is
							// created and added to the guests array list.
							SinglePerson newSinglePerson = new SinglePerson(name, age, sex, relationshipStatus, isLooking);
							guests.add(newSinglePerson);
						}
						else { // If the person's relationship status is not single, then a new In Relationship Person object is created and added to the 
							// guests array list.
							InRelationshipPerson newInRelationshipPerson = new InRelationshipPerson(name, age, sex, relationshipStatus, partnerName);
							guests.add(newInRelationshipPerson);
						}
						
					}
					
					DinnerTable dinnerTable = new DinnerTable(guests); // A dinner table object is created from the guests array list.
					
					System.out.println("The guests are: "); // The information of the guests at the dinner table is printed out.
					dinnerTable.displayDinnerTable(guests);
						
				} 
				catch( FileNotFoundException ex0 ) {
					System.out.println("File with specified name not found.");
				}
				
				catch( DinnerTableException ex1 ) { // Catches a Dinner Table Exception if there are less than 2 singles looking for a new partner.
					System.out.println( "\n" + ex1.getNumberSinglesLooking() );
				}
				
		}
		
		else { // Displays an error message if the user did not input a 'y' or 'n'.
			System.out.println("Invalid input. Please enter y or n. ");
		}
		
		}

	}

}

// guests0.txt
// guests1.txt
// guests2.txt
