package Default;

public class ParentClassDemo {
	
	String color = "red";

	public void Gear ()
	{
		System.out.println("Gear code is implemented");
	}
	
	public void breaks()
	{
		System.out.println("Break code is implemented");
	}
	
	
	public void audioSystem()
	
	{
		System.out.println("Audio code is implemented");

	}
	
	public static void main(String[] args)
	{
		
	}
	
	
	public void overrideMethod(int a)
	{
		System.out.println("Method override parent class"+a);
	}
}
