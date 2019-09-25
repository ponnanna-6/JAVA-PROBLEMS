package basics;

import java.util.Scanner;

public class SquareCube {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		float a=input.nextInt();
		System.out.println("The square of "+a+" is :"+a*a);
		System.out.println("The cube of "+a+" is :"+a*a*a);

	}

}
