import java.util.Scanner;
public class addArrayContents {
	
	private int counter;
	private int[] numList= new int[100];
	private int arrayLength=0;

	public addArrayContents()
	{

	int counter=0;
	
	}

	public void push(int num,int counter)
	{
	numList[counter]=num;
	arrayLength=counter;
	
		//System.out.println("num" + num + " counter" +counter);
		//System.out.println("numlist " + numList[counter] + arrayLength );
	
	}

	public int get(int counter)
	{
	return  numList[this.counter];
	}

	public int arrayAddition()
	{
    int answer = 0;
	for (int c=0;c<arrayLength;c++)
	{
    answer += numList[c];
   // System.out.println("answer " + answer);
	}
	//System.out.println("array length: " + arrayLength);
	return answer;
	}

	public void fillArray()
	{

	Scanner sc = new Scanner(System.in);
	int c = 0;
	int choice=1;
	

	while (choice!=0)
	{
	System.out.println("Enter list of numbers between 1-50, enter 0 to end");
	choice = sc.nextInt();
	push(choice,c);
	c++;

	}
	arrayLength = c;
	
	}

	

}
