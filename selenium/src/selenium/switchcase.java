package selenium;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) 
	{
		
		
		Scanner sc=new Scanner(System.in);
		String course=sc.next();
		
		switch (course)
		{
		case "selenium":
			System.out.println("You are selected selenium");
			break;
		case "UFT":	
			System.out.println("You are selected UFT");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		default:
			System.out.println("Select a proper option");
			break;
		}
		

	}

}
