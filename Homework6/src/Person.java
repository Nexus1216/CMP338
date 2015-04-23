
public class Person extends KeyedItem<String>{
	
	private String name; // Will be used as the Search Key.
	private String phoneNumber; // Format xxx-xxx-xxxx, where every x is in the range 0-9.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Person(String name, String number){
		super(name);
		this.name = name;
		this.phoneNumber = number;
	}
	
	public boolean equals(Object obj){
		boolean isEqual = false;
		
		Person otherPerson = (Person) obj;
		
		if(this.name == otherPerson.getName() && this.phoneNumber == otherPerson.getPhoneNumber()){
			isEqual = true;
		}
		return isEqual;
	}
	
	public String toString(){
		return "\nUser ID: " + name + "\nPhone Number: " + phoneNumber;
	}

}
