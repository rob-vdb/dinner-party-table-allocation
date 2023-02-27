package dtp;

public class Person {
	
	protected String name;
	protected int age;
	protected char sex;
	protected char relationshipStatus;
	
	public Person() { // Defines the no arg constructor for the Person class.
	}
	
	public Person(String name, int age, char sex, char relationshipStatus) { // Defines the constructor to create a Person when given their name, age, sex
		// and relationship status.
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.relationshipStatus = relationshipStatus;
	}
	
	// Below are the getters and setters for name, age, sex and relationship status. 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public char getRelationshipStatus() {
		return relationshipStatus;
	}

	public void setRelationshipStatus(char relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}
	
	public String toString() { // Defines the toString method so that the information of a person can be printed out. 
		return "Name: " + name + " ; Age: " + age + " ; Sex: " + sex + " ; Relationship Status: " + relationshipStatus + ".";
	}
	
	

}
