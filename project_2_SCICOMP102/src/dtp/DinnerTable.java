package dtp;

import java.util.ArrayList;

public class DinnerTable {
	
	int numberSinglesLooking = 0;
	
	private ArrayList<Person> guests = new ArrayList<>(1);

	public DinnerTable() { // The no arg constructor for the Dinner Table class.
	}
	
	public DinnerTable(ArrayList<Person> guests) throws DinnerTableException{ // The Dinner Table constructor that takes an array list of people as input. 
		
		for( int i = 0 ; i < guests.size() ; i++ ) { // This loop runs through every entry in the array list of guests.
			
			if( guests.get(i).getClass().equals(SinglePerson.class) ) { // This if statement checks if a specific guest is single or in a relationship.
				
				if ( ((SinglePerson)guests.get(i)).getIsLooking().equals('y') ){ // This if statement checks if a single person is looking for a new partner.
					
					numberSinglesLooking = numberSinglesLooking + 1; // Increasing the number of singles looking.
					
				}
				
			}
			
		}
		
		if ( numberSinglesLooking <= 1 ) { // If the number of singles looking is less than or equal to 1, then a Dinner Table Exception is thrown as 
			// there are too few singles looking.
			throw new DinnerTableException(guests);
		}
		else {
			this.guests = guests;
		}
		
	}
	
	public void displayDinnerTable(ArrayList<Person> guests) { // Defines a method to display the information of the guests at a dinner table.
		for(int i = 0 ; i < guests.size() ; i++) {
			System.out.println(guests.get(i));
		}
	}

}
