package dtp;

public class InRelationshipPerson extends Person {
	
	protected String partnerName;
	
	public InRelationshipPerson(String name, int age, char sex, char relationshipStatus, String partnerName) { // Defines constructor to create a person 
		// that is in a relationship given their name, age, sex, relationship status and the name of their partner.
		super(name, age, sex, relationshipStatus);
		this.partnerName = partnerName;
	}
	
	// Below are the getters and setters for the partner name variable.
	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	
	public String toString() { // Defines the toString method so that the information of a person in a relationship can be printed out. 
		return "Name: " + name + " ; Age: " + age + " ; Sex: " + sex + " ; Relationship Status: " + relationshipStatus + " ; Partner: " + partnerName + " .";
	}

	
	

}
