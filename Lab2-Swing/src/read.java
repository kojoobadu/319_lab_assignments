import java.io.File;
import java.util.Scanner;

public class read {
	
	public static void main (String arg[]){
		String comp[] = new String[100];
		int i = 0;
		File file = new File("companies.txt");
		try{
			Scanner sc = new Scanner(file);
			while(sc.hasNext()){
				comp[i] = sc.next();
				System.out.println(comp[i]);
				i++;
			}
			sc.close();
		}
		
		catch(Exception e){
			System.out.println("file not found");
		}
	}

}