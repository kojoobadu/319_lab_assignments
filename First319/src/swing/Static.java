package swing;

public class Static {
	private String first;
	private String last;
	private static int members = 0;	
	
	public Static(String fn, String ln){
		first = fn;
		last = ln;
		members ++;
		System.out.printf("Constructor for %s %s, members in the club: %d\n"
				, first, last, members);
	}
	
	public String getFirst(){
		return first;
	}
	
	public String getLast(){
		return last;
	}
	
	public int getMembers(){
		return members;
	}

}
