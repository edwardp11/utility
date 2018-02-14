import java.util.Scanner;
public class addArrayContents {
	
	private int counter;
	private int[] numList= new int[100];
	private int arrayLength=0;
	private int nToTen=0, nToTwenty=0, nToThirty=0,nToForty=0, nToFifty=0;
	

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
    //catagorize number in array
	numInArray(numList[c]);	
	
	
	
	
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
	
	public void numInArray(int num)
	{
		
		switch (num){
		case 0: 
			break;
			
		case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
			nToTen++;
			
			break;
		case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: 
			nToTwenty++;
			break;
		case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30: 
			nToThirty++;
			break;
		case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: 
			nToForty++;
			break;
		case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: case 50: 
			nToFifty++;
			break;
			default:
				System.out.println("Fail");
				
		}
		
	}
	//prints asterisk
	public void printAsterisk(int num){
	
			for (int a=0; a<num;a++)
			System.out.print("*");
			
	}		
		public void displayArray(){
			System.out.print("0-10:  ");
			printAsterisk(nToTen);
			
			System.out.println(" ");
			System.out.println("*");
			System.out.print("0-20:  ");
			printAsterisk(nToTwenty);
			System.out.println(" ");
			System.out.println("*");
			System.out.print("0-30:  ");
			printAsterisk(nToThirty);
			System.out.println(" ");
			System.out.println("*");
			System.out.print("0-40:  ");
			printAsterisk(nToForty);
			System.out.println(" ");
			System.out.println("*");
			System.out.print("0-50:  ");
			printAsterisk(nToFifty);
			System.out.println(" ");
			System.out.println("*");
		}
		
	}

	


