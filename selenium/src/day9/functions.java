package day9;

public class functions {

	public static void main(String[] args) 
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		functions f=new functions();
		f.function3();
		
		boolean flag=f.function4();
		System.out.println(flag);
		
	}
	
	//static function without returning value
	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	//static function with returning value
	
	public static String function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
	}
	//non static function without returning value
	
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	
	//non static functions with returning values
	
	public boolean function4()
	{
		System.out.println("This is function4 code");
		return true;
	}
	
	
	

}
