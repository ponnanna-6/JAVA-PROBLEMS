package basics;

import java.util.Scanner;

public class MarksSheet {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the marks of the student:");
		
		//physics
		System.out.println("Physics= ");
		float physics=input.nextInt();
		
		//chemistry
		System.out.println("Chemistry= ");
		float chemistry=input.nextFloat();
		
		//maths
		System.out.println("Maths= ");
		float maths=input.nextFloat();
		
		//computer science
		System.out.println("Computer Science= ");
		float ComputerScience=input.nextFloat();
		
		//English
		System.out.println("English= ");
		float english=input.nextFloat();
		
		//kannada
		System.out.println("Kannada= ");
		float kannada=input.nextFloat();
	
		//total
		float total;
		total=physics+chemistry+maths+ComputerScience+english+kannada;
		System.out.println("Total= " +total);
		
		//average
		float average;
		average=total/6;
		System.out.println("Average= "+average);
		

	}

}
