package dtp;

public class SinglePerson extends Person{
	
	protected char isLooking;
	
	public SinglePerson(String name, int age, char sex, char relationshipStatus, char isLooking) { // Defines the constructor to create a single person
		// with a given name, age, sex, relationship status, and "is looking for a new partner" status.
		super(name, age, sex, relationshipStatus);
		this.isLooking = isLooking;
	}
	
	// Below are the getters and setter for the isLooking variable.
	public Character getIsLooking() {
		return isLooking;
	}

	public void setIsLooking(char isLooking) {
		this.isLooking = isLooking;
	}

	public String toString() { // Defines the toString method so that the information of a single person can be printed out. 
		return "Name: " + name + " ; Age: " + age + " ; Sex: " + sex + " ; Relationship Status: " + relationshipStatus + " ; Is Looking: " + isLooking + " .";
	}

}
