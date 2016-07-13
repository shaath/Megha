package selenium;

public class twodimarray {

	public static void main(String[] args)
	{
		Object[][] s=new Object[2][3]; 
		
		System.out.println(s.length);
		
		System.out.println(s[0].length);
		
		s[0][0]=30000;
		s[1][2]=30000;

		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s[i].length; j++) 
			{
				System.out.println(s[i][j]);
			}
			
		}
	}

}
