package projectPoised;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;
public class Poised {

	public static void main(String[] args) {
		project House = new project("1234-5678-9101", "Let's build a house", "House", "1800 Conway Vickers RD \n\t      Amrose \n\t      GA 31512 \n\t      United States", "0.5 mG", 1_000_000, 500_000, "15 December 2020");
		
		members Steven = new members("Steven Universe", "+1 343-553-3323", "itsmeSteven@gmail.com", "4498 Conway Vickers RD \n\t      Amrose \n\t      GA 31512 \n\t      United States");
		members Bob = new members("Bob the Builder", "+1 464-266-9555", "icanfixanything@gmail.com", "270 Silver brook Trail \n\t      Amrose \n\t      GA 31512 \n\t      United States");
		members Burns  = new members("Montgomery Burns", "+1 555-444-1389", "richestmaninSpringfield@gmail.com", "329 Saint Peterson Ave \n\t      Douglas \n\t      GA 31533 \n\t      United States");
		//These are the default version of the project
		Scanner getcode = new Scanner(System.in); 
		System.out.println("Here are the details about the project!\n");
		System.out.println(House + "\n");
		System.out.println(Steven + "\n");
		System.out.println(Bob + "\n");
		System.out.println(Burns + "\n");
		
		//The if statements below allows you to modify the project
		
		System.out.println("Which of the following would you like to change?\nPress the number that is shown below: ");
		System.out.println("Change nothing [0]");
		System.out.println("The deadline [1]");
		System.out.println("The total amount of the fee paid to date [2]");
		System.out.println("Contractor's contact details [3]");
		int userChoice = getcode.nextInt();
	  
	    if(userChoice == 1) {
	    	System.out.println("Type in the new deadline: ");
	    	getcode.nextLine();//This was added because scanner would skip this question
	        String newDeadline = getcode.nextLine();
	        House.changedeadline(newDeadline);//this will change the value of the deadline in House
	    }
	    else if(userChoice == 2) {//This is the only option that works just fine
	    	System.out.println("Type in the new amount: ");
	        double newAmount = getcode.nextInt();
	        House.changeamount(newAmount);//this will change the value of the amount in House
	    }
	    else if (userChoice == 3) {//When I press option 3, it doesnt even give me a chance to even type in an input
	    	System.out.println("Type in the new contact number: ");
	        String newNumber = getcode.next();
	        Bob.changecontact(newNumber);//this will change the value of the number in Bob
	    }
	    else if(userChoice == 0){
	    	System.out.println("Nothing has been changed");
	    }
	    else {
	    	System.out.println("You have entered the incorrect input. Please try again!");
	    }
	    	
	  //These are the modified version of the project
	    System.out.println("\nYou have completed modifying the project\nHere are the NEW details about the project!\n");
		System.out.println(House + "\n");
		System.out.println(Steven + "\n");
		System.out.println(Bob + "\n");
		System.out.println(Burns + "\n");
		
		System.out.println("\nHere is the client's invoice");//This was added
		System.out.println("Name: " + Burns.name);
		System.out.println("Number: " + Burns.telephoneNumber);
		System.out.println("Total amount: $" + House.feeCharged);
		System.out.println("Total amount paid: -$" + House.amountPaid);
		double needToBePaid = House.feeCharged - House.amountPaid;
		System.out.println("Amount that still needs to be paid: $" + needToBePaid);
		
		SimpleDateFormat toDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println("This project is FINALISED!");
		System.out.println("Completed at: " + toDate.format(date));
		
//===================FILE OUTPUT===========================
		
		// create a new formatter
				try {
				Formatter f = new Formatter("Completed project.txt");
			
				// print the formatted strings to the file
				f.format("%s %s",("You have completed modifying the project\nHere are the NEW details about the project!\n"), "\r\n");
				f.format("%s %s",(House + "\n"), "\r\n");
				f.format("%s %s",(Steven + "\n"), "\r\n");
				f.format("%s %s",(Bob + "\n"), "\r\n");
				f.format("%s %s",(Burns + "\n"), "\r\n");
				f.format("%s %s",("\nHere is the client's invoice"), "\r\n");
				f.format("%s %s",("Name: " + Burns.name), "\r\n");
				f.format("%s %s",("Number: " + Burns.telephoneNumber), "\r\n");
				f.format("%s %s",("Total amount: $" + House.feeCharged), "\r\n");
				f.format("%s %s",("Total amount paid: -$" + House.amountPaid), "\r\n");
				f.format("%s %s",("Amount that still needs to be paid: $" + needToBePaid), "\r\n");
				f.format("%s %s",("This project is FINALISED!"), "\r\n");
				f.format("%s",("Completed at: " + toDate.format(date)));
				f.close();    
				} 

				catch (Exception e) {
					System.out.println("Error");
				}
	}
}
