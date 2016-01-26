package swing;

public class Final {
	private int sum;
	private final int NUMBER;
	
	public Final(int x){
		NUMBER  = x;
	}
	
	public void add(){
		sum+= NUMBER;
	}
	
	public String toString(){
		return String.format("The sum is %d\n", sum);
	}
}
