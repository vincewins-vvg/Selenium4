package week3.day2;

public abstract class AndroidTV implements Android{
	
	public void openApp()
	{
     System.out.println("open the app");
	}
	
	public void errorMessage()
	{
		System.out.println("Sorry something went wrong");
	}
	
	public void noConnection()
	{
		System.out.println("Sorry no internet connection");
	}

}
