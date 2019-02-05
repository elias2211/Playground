package hairSalon;

import java.io.IOException;
import java.util.Scanner;

public class WriteData {

	public static void main(String[] args) throws IOException{
		java.io.File file = new java.io.File("scores.txt");
 	/*	if(file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}  */
		
		//Create a file
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		//Write formatted output to the file
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);
		
		//Close the file
		output.close();  
		
		Scanner input = new Scanner(file);
		
		while(input.hasNext()) {
			String firstName = input.next();
			String mi = input.next();
			String lastName = input.next();
			int score = input.nextInt();
			System.out.println(
					firstName + " " + mi + " " + lastName + " " + score);
		}
		
		input.close();
	}

}
