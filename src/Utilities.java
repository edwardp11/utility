import java.util.Scanner;

public class Utilities {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int choice=0;
		versionTest version=new versionTest();
		fileSize sizefile=new fileSize();
		earthdistance distance=new earthdistance();
		tempConvert temp =new tempConvert();
		measureApp measure = new measureApp();
		numChar digit = new numChar();
		timeCount time = new timeCount();
		speedCalc speedT = new speedCalc();
		bmi bodyMass = new bmi();
		floydTri triangle=new floydTri();
		
		
		while (choice!= 9){
		System.out.println("\n1- Version ID");
		System.out.println("2- File Size");
		System.out.println("3- Distance on Earth (longitude/latitude");
		System.out.println("4- Temperature Conversion");
		System.out.println("5- Convert inch to meter");
		System.out.println("6- Sum the digits in a number");
		System.out.println("7- Calculate minutes into years/days");
		System.out.println("8- BMI calculator");
		System.out.println("10-Speed check");
		System.out.println("11-Squard, Cuber, 4th power");
		System.out.println("12-Compare 3 numbers");
		System.out.println("13-Compare 1 number");
		System.out.println("14-Floyd Triangle");
		System.out.println("15-Find file contents");
		System.out.println("16-Password confirmation");
		System.out.println("17-File read/write");
		System.out.println("18-Add integers in array");
		System.out.println("9- Exit");
		System.out.println("Enter: ");
		choice=scan.nextInt();
		
		switch (choice) {
		
		case 1:
			version.versionID();
			break;
		case 2:
			sizefile.findSize();
			break;
		case 3:
			distance.findDistance();
			break;
		case 4:
			temp.temp();
			break;	
		case 5:
			measure.measure();
			break;
		case 6:
			digit.numConvert();
			break;
		case 7:
			time.minuteToYear();
		case 8:
			bodyMass.bmiCalc();
			break;
		case 9:
			
			System.out.println("Exited");
			break;
		case 10:
			speedT.speed();
			break;
		case 11:
			digit.powers();
			break;
		case 12:
			digit.numCompare();
			break;
        case 13:			
			digit.numID();
			break;
        case 14:
			triangle.tri();
			break;
        case 15:
        	file files = new file();
			files.fileContents();
			break;
        case 16:
        	password pass = new password();
			pass.enterPassword();
			break;
        case 17:
        	file files2 = new file();
			files2.pathExist();
			break;
        case 18:
        	addArrayContents array1=new addArrayContents();
        	array1.fillArray();
        	System.out.println(array1.arrayAddition());
        	break;
		default: 
				System.out.println("Fail");
				
		}
				
		
		}
		}
		
	}


