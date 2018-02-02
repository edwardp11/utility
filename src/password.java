import java.util. Scanner;
public class password {
	
	private String pw;
	
	public password(){
		 pw="";
	
	}

	
	public void enterPassword() {
	Boolean trigger = false;
	
	
	Scanner sc = new Scanner(System.in);

	while (!trigger){
	System.out.println("passwords must be 8 in length, have only letters and number, and have at least two numbers");
	pw = sc.nextLine();
	if (numCount() && letNum()&& pwLength()){
	trigger=true;
	System.out.println("Password Entered");
	}
	else
	System.out.println("Password Incorrect");
	}


	}

    private boolean numCount(){
	int count = 0;
	char[] pwArray=pw.toCharArray();
	for (int i=0; i<pwArray.length;i++){
	if ((pwArray[i]>=0) && (pwArray[i]<=9))
	count++;
	
	if (count>=2);
	 return true;
	}
	System.out.println("more numbers needed");

	 return false;
	
	}

	private boolean letNum () {
		System.out.println("test number and letters");
				
	 if (pw.matches("^[a-zA-Z0-9]*"))
	  return true;
	else {
	System.out.println("Use only letters and numbers---" + pw);
	

	return false;
	}
	}

	private boolean pwLength () {
	if (pw.length()>=8)
	return true;
	else{
	System.out.println("too short");

	 return false;
	}
	}


	}



