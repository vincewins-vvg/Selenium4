package week1.day2;

public class CarClass {
//	Create a class -> Car
//	public -> get Registration Number (4 digits)
//	private -> get Owner's Name
//	package -> print the car model (Swift, Duster, City)
//	public -> Is punctured?
//	public -> subtracting two numbers
//	public -> Multiplying 3 numbers
//	public -> dividing 2 numbers
	
	public int getRegNumber()
	{
		int regNumber = 3211;
		return regNumber;
		
	}
	
	private String getOwnersName()
	{
		String ownersName = "XYZ";
		return ownersName;
	}
	
	void getCarModelName()
	{
		System.out.println("Swift");
	}
    public int subTwoNos(int b,int c)
{
	int a = b-c;
	return a;
	
	}
    public boolean isPunctured()
    {
    	
    	return false;
    }

    public int multiplyThreeNos(int b,int c,int d)
{
	int a = b*c*d;
	return a;
	
	}
    
    public int divideTwoNumbers(int b,int c)
    {
    	int a = b/c;
    	return a;
    	
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarClass cr= new CarClass();
		System.out.println(cr.getOwnersName());
		System.out.println(cr.getRegNumber());
		cr.getCarModelName();
		System.out.println("Diff of 2 numbers is: "+cr.subTwoNos(4, 2));
		System.out.println("Remainder is: "+cr.divideTwoNumbers(9, 3));
		System.out.println("3 number muliplication: " +cr.multiplyThreeNos(3, 2, 2));
		int multiplyThreeNos = cr.multiplyThreeNos(0, 0, 0);
		

		
		

	}

}
