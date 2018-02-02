import java.util.Scanner;

public class speedCalc {
	
	
	double metersM=0,mps=0,meters=0,kph=0,milesM=0;
	int hours, minutes,totalHours, totalSecs=0,seconds=0;
	


public void speed(){
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter meters travelled: ");
	meters=scan.nextDouble();
	System.out.println("Enter hours: ");
	hours=scan.nextInt();
	System.out.println("Enter minutes: ");
	minutes=scan.nextInt();
	System.out.println("Enter seconds: ");
	seconds=scan.nextInt();
	
	totalSecs=seconds + (60*minutes) + (3600*hours);
	totalHours=hours+(minutes/60)+(seconds/3600);
	System.out.println("Meters per second: " + meters/totalSecs);
	System.out.println("KM per hour: " + (meters*.0010)/totalHours);
	System.out.println("Miles per hour: " + (meters/1609)/totalHours);
	
	
	
	
}
}