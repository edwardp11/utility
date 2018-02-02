import java.util.Scanner;


public class numChar {
	int number, n, c, total;
	String numString;
	Scanner scan = new Scanner (System.in);

	
	public numChar() {
		number = 0;

}
	public void powers (){
		System.out.println("enter a number: ");
		number=scan.nextInt();
		System.out.println("Squared: " + number*number);
		System.out.println("Cubed: " + number*number*number);
		System.out.println("4th power: " + number*number*number*number);
	}
	
	public void numConvert(){
	
	System.out.println("enter a number: ");
	number = scan.nextInt();
	numString = Integer.toString(number);
	int total = 0;
	
	c = numString.length();
	
	for (int n=0;n<c;n++){
		char num = numString.charAt(n);
		total = total + Character.getNumericValue(num);
	}
	System.out.println("The total of the digits is" + total);
	}
	
	public void numCompare(){
		System.out.println("enter number a: ");
		int a=scan.nextInt();
		System.out.println("enter number b: ");
		int b=scan.nextInt();
		System.out.println("enter number c: ");
		int c=scan.nextInt();
		
		if (a>b && a>c)
			System.out.println(a + " is the greatest");
		if (b>a && b>c)
			System.out.println(b + " is the greatest");
		if (c>b && c>a)
			System.out.println(c + " is the greatest");
	}
	
	public void numID(){
		
		System.out.println("enter a number: ");
		float numberF = scan.nextFloat();
		if (Math.abs(numberF) == 0)
			System.out.println("is 0");
		else if (numberF<0)
			System.out.println("is negative");
			else
				System.out.println("is positive");
		if (Math.abs(numberF)<1)
			System.out.print (" and is small");
		if (Math.abs(numberF)>1000000)
          System.out.print (" and is large");
		
			
	}
		
	
	

}