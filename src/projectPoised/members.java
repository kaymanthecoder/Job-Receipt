package projectPoised;

public class members {
	
	// Attributes
	//String job; (removed)
	String name;
	String telephoneNumber;
	String email;
	String address;
	
	//Methods
	public members(String name, String telephoneNumber, String email, String address) {
		//this.job = job; (removed)
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
		this.address = address;
	}
	
	void changecontact(String newValue) {//this is the modification of contacts takes place
		telephoneNumber = newValue;
	   }
	
	public String toString() {//these will be printed along side the answers
		//String output = "Job: " + job; (removed)
		String output = "\nName: " + name;
		output += "\nTelephone number: " + telephoneNumber;
		output += "\nEmail: " + email;
		output += "\nAddress: " + address;
		
		return output;
	}


}
