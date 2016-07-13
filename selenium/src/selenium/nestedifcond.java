package selenium;

public class nestedifcond {

	public static void main(String[] args) 
	{
		int a=100000;
		int b=20000;
		int c=4000;
		
		if (a > b & a > c)
		{
			System.out.println("A is bigger");
		}
		else if (b>c & b>a) 
		{
			System.out.println("B is bigger");
		}
		else
		{
			System.out.println("C is bigger");
		}
		

	}

}
