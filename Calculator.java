package basics;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a: ");
		float a=input.nextInt();
        System.out.println("a= "+a);  
        System.out.println("Enter b: ");          //Taking input
		float b=input.nextInt();
		System.out.println("b= "+b);
		//addition
		float sum;
		sum =a+b;
		System.out.println("sum = "+sum);
		
		//subratction
		float sub;
		sub=a-b;
		System.out.println("difference = "+sub);
		
		//multiplication
		float multiply;
		multiply=a*b;
		System.out.println("product = "+multiply);
		
		//division
		float quotient,remainder;
		quotient=a/b; //for quotient
		remainder=a%b;//for remainder
		System.out.println("Division:");
		System.out.println("answer for division = "+quotient);
		System.out.println("Remainder = "+remainder);
		 
	}

}
