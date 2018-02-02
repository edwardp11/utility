import java.util.Scanner;

public class timeCount {
	int minute,year,day;
	
	public timeCount (){
		  minute = 0;
		  year = 0;
		  day = 0;
		
	}
	
	public void minuteToYear (){
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Enter number of minutes: ");
		minute = scan.nextInt();
		day = (minute/60)/24;
		year=day/365;
		day =day%365;
		
		System.out.printf("Years: %s",year);
		System.out.printf("\nDayss: %s",day);
		
	}

}
