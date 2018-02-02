import java.util.Scanner;

public class earthdistance {
	Double long1,lat1,long2,lat2,answer;
	Double radius=6371.01;
	
	public earthdistance() {
	long1=0.0;
	}
	
	public void findDistance() {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter longitude of first point: ");
		long1=scan.nextDouble();
		System.out.println("Enter latitude of first point: ");
		lat1=scan.nextDouble();
		System.out.println("Enter longitude of second point: ");
		long2=scan.nextDouble();
		System.out.println("Enter latitude of second point: ");
		lat2=scan.nextDouble();
		
		lat1=Math.toRadians(lat1);
		lat2=Math.toRadians(lat2);
		long1=Math.toRadians(long1);
		long2=Math.toRadians(long2);
		
		answer=radius*Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(long1-long2));
		System.out.println("Distance is " + answer + " km");
		
		
	}

}
