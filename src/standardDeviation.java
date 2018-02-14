import java.util.Scanner;
public class standardDeviation {
	private int counter;
	private float[] numList= new float[100];
	private int arrayLength=0;
	 private float answer = 0;
	
	
	public standardDeviation(){
		int counter=0;
	}
	public void push(float num,int counter)
	{
	numList[counter]=num;
	arrayLength=counter;
	}
	
	public float get(int counter)
	{
	return  numList[this.counter];
	}
	
	private void arrayAddition()
	{
    
	    for (int c=0;c<arrayLength;c++)
	    {
        answer += numList[c];
     	}
	
	 answer=answer/arrayLength;

    }


public void fillArray()
{

Scanner sc = new Scanner(System.in);
int c = 0;
float choice=1;


while (choice!=0)
{
System.out.println("Enter list of numbers between 1-100, enter 0 to end");
choice = sc.nextInt();
push(choice,c);
if (choice!=0) c++;

}
arrayLength = c;

}

public float sDeviation(){

float response=0,difference=0;
arrayAddition();

for (int c=0;c<arrayLength;c++)

{
	 difference += (float)Math.pow(numList[c]-answer,2);



}
System.out.println("difference: " + difference );

float varience = difference/(arrayLength);
System.out.println("varience: " + varience );
response = (float)Math.sqrt(varience);

 

return response;
}
}