package swing;

import java.util.Random;

public class apples {
	
	
	public static void main(String args[]){
		
		Random dice = new Random();
		int number;
		int counter;
		
		for(counter = 1; counter <= 10; counter++){
			number = dice.nextInt(6);
			System.out.println(number);
		}
		
	}
	
	
}
