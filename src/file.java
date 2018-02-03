import java.util.Scanner;
import java.text.SimpleDateFormat;
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
		public void pathExist(){
			System.out.println("Enter path: ");
			Scanner sc = new Scanner (System.in);
			SimpleDateFormat timeF = new SimpleDateFormat();
			
			if (folder.exists()){
				System.out.println("Exists");
				System.out.println("Last modified: " + timeF.format(folder.lastModified()));
				if (folder.canWrite())
					System.out.println("Can write");
					else
					System.out.println("Can not write");
				if (folder.canRead())
					System.out.println("Can read");
				else 
					System.out.println("Can not read");
				}
			
			else
				System.out.println("Does not exist");
			
		}

	
}


