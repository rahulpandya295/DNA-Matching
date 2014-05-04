import java.io.*;
import java.util.*;

public class Input{
	
	public static void main(String[] args) throws IOException {
		
		String DNA1, DNA2;
		DNA1="";
		DNA2="";
		int choice;
		Scanner input;
		input =new Scanner(System.in);
		System.out.println("Select Choice");
		System.out.println("1. Test Input");
		System.out.println("2. File Input");
		choice=input.nextInt();
		input.nextLine();
		if(choice==1){
			System.out.println("Enter DNA1: ");
			DNA1 = input.nextLine();
			System.out.println("Enter DNA2");
			DNA2 = input.nextLine();
			input.close();
		}
		else if(choice==2){
			input= new Scanner(new File("DNA1.DNA"));          
	        DNA1=input.nextLine();
	        input = new Scanner(new File("DNA5.DNA"));          
	        DNA2=input.nextLine();
	        input.close();
		}
		else
			System.out.println("Wrong Choice!! Rerun..");
		
		System.out.println("DNA1 is: " + DNA1);
		System.out.println("DNA2 is: " + DNA2);
		
		CostMatrix costmatrix =new CostMatrix();
		costmatrix.FillMatrix(DNA1, DNA2);
	}
}
