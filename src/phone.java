
public class phone  {
	private String firstName,lastName;
	private int pNumber;
	
	public phone(String fName, String lName, int phoneNumber){
		firstName=fName;
		lastName=lName;
		pNumber = phoneNumber;
		}
	public String getPhone()
	{
		return (firstName + " " + lastName + pNumber);
	}

}
