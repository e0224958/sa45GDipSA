
public class Person {
	private String surname;
	private String firstName;
	private String lastName;
	
	public Person(String sName, String fName, String lasName) {
		this.surname = sName;
		this.firstName = fName;
		this.lastName = lasName;		
	}
	

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		if(this.lastName != null) {
			return surname+" "+firstName+" "+lastName;
		}
		else {
			return surname+" "+firstName;
		}
	}
	
	public void Show() {
		System.out.println(this.toString());		
	}
	
	
}