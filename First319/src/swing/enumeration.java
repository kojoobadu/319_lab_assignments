package swing;

public enum enumeration {
	kojo("Good","22"),
	ojo("Better","21"),
	jo("Best","20"),
	java("first","5"),
	python("second","4"),
	php("third","3");
	
	
	private final String desc;
	private final String year;
	
	enumeration(String description, String age){
		desc = description;
		year = age;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getYear(){
		return year;
	}
	
}
