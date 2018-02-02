import java.util.Scanner;

public class bmi {
	Scanner scan = new Scanner(System.in);
	
	private double lbs = 0;
	private double inch = 0;
	
	
	public void bmiCalc() {
		System.out.println("Enter weight in pounds: ");
		lbs = scan.nextDouble();
		System.out.println("Enter height in inches: ");
	    inch = scan.nextDouble();
	    
	    double kg = lbs *0.453592;
	    double cm = inch * 2.54;
	    double meter = cm*0.01;
	    double answer = kg/(meter * meter);
	    System.out.println("BMI is " + answer);
	    
	    	}

}
