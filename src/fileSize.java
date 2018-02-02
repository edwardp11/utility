import java.util.Scanner;
import java.io.File;

public class fileSize {
	
	public void findSize(){
		String filePath=new String(" ");
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter file path: ");
		filePath=scan.nextLine();
		
		System.out.println(new File(filePath).length() + "bytes");
		
		
	}
	
	

}
