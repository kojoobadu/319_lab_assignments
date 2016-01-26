package swing;

public class Multidimensional_arrays {
	
	public static void main(String args[]){
		int arr1[][] = {{1,2,3,4},{5,6,7,8}};
		int arr2[][] = {{9,10,11,12},{45},{3,6,7,5}};
		
		System.out.println("This is the first Array");
		display(arr1);
		System.out.println("This is the second Array");
		display(arr2);
	}
	
	public static void display(int x[][]){
		for(int row = 0; row < x.length; row++){
			for(int column = 0; column < x[row].length; column++){
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();
		}
	}

}
