package basics;

import java.util.Scanner;

public class LargerNum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		float a,b;
		System.out.println("Enter 'a' ");
		a=input.nextInt();
        System.out.println("Enter 'b' ");
        b=input.nextInt();
        if(a>b) {
        	System.out.println("'a' is greater than 'b' ");
        }
        if(b>a) {
        	System.out.println("'b' is greater than 'a' ");
        }
	}

}
