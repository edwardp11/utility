import java.util.Scanner;
import java.io.File;

public class file {
	File folder;
	
	public file() {
		Scanner sc= new Scanner (System.in);
		System.out.println ("Enter file path");
		String path = sc.nextLine();
		folder = new File(path);
	}
		
	public void fileContents(){
		String[] filelist = folder.list();
		for(String name:filelist){
			System.out.println(name);
	}

	
}

}
