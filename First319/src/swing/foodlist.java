package swing;

public class foodlist {
	
	private InheritanceFood[] thelist = new InheritanceFood[5];
	private int i = 0;
	
	public void addFood(InheritanceFood f){
		 	if(i < thelist.length){
		 		thelist[i] = f;
		 		System.out.println("Food added at index "+i);
		 		i++;
		 	}
	}

}
