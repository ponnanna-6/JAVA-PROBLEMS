package basics;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int temp;
		System.out.println("a= "+a+"b= "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("a= "+a+"b= "+b);
		
		
		

	}

}
