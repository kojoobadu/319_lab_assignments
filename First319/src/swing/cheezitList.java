package swing;

public class cheezitList {
	
	private cheezit[] thelist = new cheezit[5];
	private int i = 0;
	
	public void add(cheezit c){
		if(i < thelist.length){
			thelist[i] = c;
			System.out.println("Cheezit added at index "+i);
			i++;
		}
	}

}
