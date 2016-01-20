package JavaTutorials;

import java.util.Scanner;

public class Quadratic_equation {
	
public static void main( String args[]){
		
		double a = 0;
		double b = 0;
		double c = 0;
		double discriminant1 = 0.0;
		double discriminant2 = 0.0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a double value for a :");
		a = input.nextDouble();
		
		System.out.println("Enter a double value for b :");
		b = input.nextDouble();
		
		System.out.println("Enter a double value for c :");
		c = input.nextDouble();
		
		input.close();
		
		discriminant1 = (-b + Math.sqrt((b*b) - (4*a*c))) / (2*a);
		
		discriminant2 = (-b - Math.sqrt((b*b) - (4*a*c))) / (2*a);
		
		System.out.println("The discriminants of the quadratic equation are " 
				+ discriminant1 + " and " + discriminant2);
		
	}

}
