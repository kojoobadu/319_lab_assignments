package JavaTutorials;

public class Arrays {
	
	
	
	public static void main (String args[]){
		
		int numberArray[] = new int[10];
		int numberArray2[] = {2,4,6,8,10};
		
		System.out.println("Index\tValue");
		
		for(int i = 0; i < numberArray2.length; i++){
			System.out.println(i + "\t" + numberArray2[i]);
		}
	}
	

}