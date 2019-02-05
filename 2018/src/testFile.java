import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class testFile {

	public static void main(String[] args) {
		File input = new File("eliaswow.txt");
		
		try {
			PrintWriter output = new PrintWriter(input);
			
			output.println("Elias Feredegn 32");
			output.println("Hana Haile 32");
			
			output.close();
		}
		
		catch(Exception e) {
			System.out.println("Writting to file error has occured!");
		}
		
		try {
		Scanner read = new Scanner(input);
		String firstLine = null;
		String secondLine = null;
		while(read.hasNext()) {
			 firstLine = read.nextLine();
			 secondLine = read.nextLine();
		}
		
		System.out.println(firstLine);
		System.out.println(secondLine);
		
		read.close();
		
		}
		
		catch(Exception e){
			System.out.println("Reading from file error has occured.");
		}

	}

}
