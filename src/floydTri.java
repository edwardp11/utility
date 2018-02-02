import java.util.Scanner;

public class floydTri {

	
	public void tri() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();
		for (int i =0; i<=row; i++){
			for (int n=0;n<=i;n++){
				if (n%2==0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println("");
		}
	}
}
