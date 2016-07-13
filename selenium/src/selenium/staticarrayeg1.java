package selenium;

public class staticarrayeg1 {

	public static void main(String[] args)
	{
		Object[] s={200000,"Selenium",'M',false,22222.22};

		System.out.println(s.length);
		
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}
	}

}
