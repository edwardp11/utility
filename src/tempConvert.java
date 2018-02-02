import java.util.Scanner;

public class tempConvert {
	Scanner sc = new Scanner (System.in);
	double temp;
	static int choice;
	
	public tempConvert () {
		choice = 0;
	}
		
	public void temp(){
	    Scanner scan = new Scanner (System.in);
		
		while (choice !=3){
		System.out.println (" 1 - Celsius to Fahrenheit or 2 - Fahrenheit to Celsius or 3-Quit");
		choice = scan.nextInt();
		getTemp();
		
		
		switch (choice){
		
		case 1 :
			temp= temp * 9/5 + 32;
			break;
		case 2:
			temp = (temp - 32)/(9/5);
			break;
		case 3:
			System.out.println("quiting");
			break;
			default:
				System.out.println("error");
		
				
		}
		System.out.println(temp + "degrees");
		}
	}
	

	private void getTemp(){
		System.out.println("Enter temperature: ");
		temp= sc.nextDouble();
		
	}
	

}
