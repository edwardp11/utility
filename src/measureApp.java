import java.util.Scanner;

public class measureApp {
	private double inchConstant = 0.0254;
	Scanner sc = new Scanner (System.in);
    double inches, meters;
	
	public measureApp() {
		 meters = 0;
		 inches = 0;
	}
	
	public void measure(){
		System.out.println("Enter inches: ");
		inches = sc.nextDouble();
		meters=inchConstant*inches;
		System.out.println(meters + " meters");
		
		
		
		
	}

}
