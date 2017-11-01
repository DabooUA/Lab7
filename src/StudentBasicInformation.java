import java.util.Scanner;
//import java.util.Arrays;
/**
 * @author Serhiy Bardysh
 * This program needs more work. Need to add Exceptions to it. 
 */
public class StudentBasicInformation {

		public static void main(String[] args) {
			
			Scanner scnr = new Scanner(System.in);
			
			
			String[] studentName = new String[12];
			
			studentName[0] = "Jenna Price";
			studentName[1] = "Serhiy Bardysh";
			studentName[2] = "Michael Chan";
			studentName[3] = "Yasmin Rodriguez";
			studentName[4] = "Pratima Kaza";
			studentName[5] = "Samuel Bernardy";
			studentName[6] = "Marcus Perez";
			studentName[7] = "Tim Johnson";
			studentName[8] = "Siddique Khatri";
			studentName[9] = "Joe Garza";
			studentName[10] = "Alex Cyr";
			studentName[11] = "Matthew Davis";
			
			
			String[] studentHome = new String [12];
			
			studentHome[0] = "Lander, WY";
			studentHome[1] = "Nashville, TN";
			studentHome[2] = "Rochester, MI";
			studentHome[3] = "Ann Arbor, MI";
			studentHome[4] = "Edingburg, TX";
			studentHome[5] = "Livonia, MI";
			studentHome[6] = "Adrian, MI";
			studentHome[7] = "Los Angeles, CA";
			studentHome[8] = "Troy, MI";
			studentHome[9] = "Inkster, MI";
			studentHome[10] = "Farmington, MI";
			studentHome[11] = "Saint Clair Shores, Mi";
			
			String[] studentFood = new String [12];
			
			studentFood[0] = "Thai";
			studentFood[1] = "Ukrainia";
			studentFood[2] = "Sushi";
			studentFood[3] = "Indian";
			studentFood[4] = "Indian";
			studentFood[5] = "Human Flesh";
			studentFood[6] = "Fruit";
			studentFood[7] = "Ethnic";
			studentFood[8] = "Thai";
			studentFood[9] = "Mexican";
			studentFood[10] = "Cheeseburger";
			studentFood[11] = "Hibachi";
			
			String userInput;
			String choice = "y";
										
				System.out.print("Welcome to our Java class. ");
				while (choice.equalsIgnoreCase("y")) {
				System.out.print("Which student would you like to learn more about? (enter a number 1-12): ");
				int userNum = scnr.nextInt();
				
				scnr.nextLine(); //garbage line/ clr. scanner
				
				System.out.println("Student " + userNum + " is " + "(" +  studentName[userNum] + ")" + "." + " What would you like to know about " + studentName[userNum] + "? (enter \"hometown\" or \"favorite food\"): " );
				userInput = scnr.nextLine();
											
				if (userInput.equalsIgnoreCase("yes") || userInput.toLowerCase().contains("hometown")) {
					System.out.println(studentName[userNum] + " is from " + studentHome[userNum] + "." + "  Would you like to know more about " + studentName[userNum] + " ? (enter \"yes\" or \"no\"): ");
					userInput = scnr.nextLine();
				
				}
				if (userInput.equalsIgnoreCase("yes") || userInput.toLowerCase().contains("favorite food")) {
					System.out.println(studentName[userNum] + " favorite food is " + studentFood[userNum] + "." + "Would you like to know more " + studentName[userNum] + " ? (enter \"yes\" or \"no\"): ");
					userInput = scnr.nextLine();
				}
				 if (userInput.contains("no")) {
					 System.out.println("Thank you!!!!");
					 System.out.println();
				 }
			
				System.out.println("Would you like to inquer information about another student? (y/n): ");
				choice = scnr.nextLine();
				}
				System.out.println("Good day!!!!");
			
			scnr.close();
		}
	}


