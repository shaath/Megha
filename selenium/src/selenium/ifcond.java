package selenium;

import java.util.Scanner;

public class ifcond 
{

	public static void main(String[] args) 
	{
//		String name="Megha";
//		String name1="megha";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name value");
		String name=sc.next();
		System.out.println(name);
		
		System.out.println("Enter name1 value");
		String name1=sc.next();
		System.out.println(name1);
		
		if (name.equalsIgnoreCase(name1))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}

	}

}
