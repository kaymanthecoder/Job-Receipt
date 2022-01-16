package projectPoised;

public class project {
	
	//Attributes
	String projectnumber;
	String projectname;
	String typeOfBuilding;
	String address;
	String emfNumber;
	double feeCharged; //changed to double
	double amountPaid; //changed to double, handling with monetary values
	String deadline;
	
	members Steven; //Architect
	members Bob; //Constructor
	members Burns; //Customer
	   
	//Methods
	public project(String projectnumber, String projectname, String typeOfBuilding, String address, String emfNumber, int feeCharged, int amountPaid, String deadline){
		this.projectnumber = projectnumber;
		this.projectname = projectname;
		this.typeOfBuilding = typeOfBuilding;
		this.address = address;
		this.emfNumber = emfNumber;
		this.feeCharged = feeCharged;
		this.amountPaid = amountPaid;
		this.deadline = deadline;
	}
	
	void changedeadline(String newValue) {//this is the modification of the deadline takes place
	      deadline = newValue;
	   }
	
	void changeamount(double y1) {//this is the modification of the amount takes place
	      amountPaid += y1; //changed "=" to "+=", should be increased not reassigned
	   }
	
	public String toString() {//these will be printed along side the answers
		String output = "Project number: " + projectnumber;
		output += "\nProject name: " + projectname;
		output += "\nType of building: " + typeOfBuilding;
		output += "\nAddress: " + address;
		output += "\nEMF number: " + emfNumber;
		output += "\nFee charged: $" + feeCharged;
		output += "\nAmount paid: $" + amountPaid;
		output += "\nDeadline: " + deadline;
		
		return output;
	}
}
