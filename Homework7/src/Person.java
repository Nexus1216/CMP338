import java.util.Comparator;


public class Person implements Comparable<Person> {
	private String name = "";
	private String number = "";
	
	public Person(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public boolean equals(Object obj){
		boolean isEqual = false;
		
		Person otherPerson = (Person) obj;
		
		if(this.name == otherPerson.getName() && this.number == otherPerson.getNumber()){
			isEqual = true;
		}
		return isEqual;
	}
	
	public String toString(){
		return "\nUser ID: " + name + "\nPhone Number: " + number + "\n";
	}
	
	 public static class OrderByName implements Comparator<Person> {

         @Override
         public int compare(Person o1, Person o2) {
             return o1.name.compareTo(o2.name);
         }
     }


	@Override
	public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
