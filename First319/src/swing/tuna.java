package swing;

public class tuna {
	private String girlName;
	
	
	public tuna(String name){
		girlName = name;
	}
	public void setName(String name){
		girlName = name;
	}
	
	public String getName(){
		return girlName;
	}
	
	public void saying(){
		System.out.printf("The girl's name is %s", getName());
	}
}