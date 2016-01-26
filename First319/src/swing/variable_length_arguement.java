package swing;

public class variable_length_arguement {
	
	public static void main (String args[]){
		System.out.println(average(45,56,43,64,34,46,32));
	}
	
	public static int average(int...numbers){
		int total = 0;
		for(int x: numbers)
			total += x; 
		return total/numbers.length;
	}

}
