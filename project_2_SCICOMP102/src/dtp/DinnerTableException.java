package dtp;

import java.util.ArrayList;

public class DinnerTableException extends Exception{
	
	private int numberSinglesLooking = 0;
	
	public DinnerTableException() { // Defines the no arg constructor for the Dinner Table Exception.
		super();
	}
	
	public DinnerTableException(ArrayList<Person> guests) { // Defines the Dinner Table Exception constructor that takes an Array List of People as input.
		
		super();
		
		for( int i = 0 ; i < guests.size() ; i++ ) { // This loop runs through every entry in the array list of guests.
			
			if( guests.get(i).getClass().equals(SinglePerson.class) ) { // This if statement checks if a specific guest is single or in a relationship.
				
				if ( ((SinglePerson)guests.get(i)).getIsLooking().equals('y') ){ // This if statement checks if a single person is looking for a new partner.
					
					numberSinglesLooking = numberSinglesLooking + 1; // Increasing the number of singles looking.
					
				}
				
			}
			
		}
		
		System.out.print("Problems with Dinner Table. "); 
		
	}

	public String getNumberSinglesLooking() { // Defines method that returns a string stating the number of singles looking for a new partner.
		return "Number of Singles Looking = " + numberSinglesLooking;
	}

	public void setNumberSinglesLooking(int numberSinglesLooking) { // Defines method that sets the number of singles looking. 
		this.numberSinglesLooking = numberSinglesLooking;
	}
	
	

}
