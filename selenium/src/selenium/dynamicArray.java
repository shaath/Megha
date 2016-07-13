package selenium;

public class dynamicArray {

	public static void main(String[] args)
	{
		int[] salary=new int[10];
		
		System.out.println(salary.length);
		
		salary[0]=30000;
		salary[5]=50000;
		salary[9]=60000;
		

		for (int i = 0; i < salary.length; i++)
		{
			System.out.println(salary[i]);
		}
	}

}
