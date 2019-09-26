package basics;

import java.util.Scanner;

public class PrintFSI {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        //taking input
		System.out.println("Enter the float,String and integer variables respectively: ");
		float number=input.nextFloat();
		//String line=input.nextLine();
		int singlenum=input.nextInt();
		System.out.println("The Float,String and integer variables are: "+number+singlenum+" respectively.");
		
		
	}

}
