import java.util.Scanner;

public class phoneList {
	private phone[] numberList;
	private int counter;
	
	
	public phoneList ()
	{
		numberList = new phone[100];
		counter=0;
	}
	
	public void addNumber ()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String fName = sc.nextLine();
		System.out.println("Enter last name: ");
		String lName = sc.nextLine();
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		
		numberList[counter]=new phone(fName,lName,number);
		counter++;
    }
   public  void outPut()
   {
	   int count= 0;
	   
	   for (count=0;count<counter;count++)
	   {
		  System.out.println (numberList[count].getPhone());
	   }
	 
   }
	   
}
