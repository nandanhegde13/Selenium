package Default;

public class childClassDemo extends ParentClassDemo {
	
	public static void main(String args[])
	{
		childClassDemo cd = new childClassDemo();
		cd.methodOverloading(10);
		cd.methodOverloading("Test");
		cd.overrideMethod(20);
		
	}
	
	public void engine()
	{
		System.out.println("new Engine");
	}
	
	public void overrideMethod(int a)
	{
		super.overrideMethod(a);
		System.out.println("Child"+a);
	}
	
	public void methodOverloading(String a)
	{
		System.out.println(a);
	}
	
	public void methodOverloading(int a)
	{
		System.out.println(a);
	}
}
