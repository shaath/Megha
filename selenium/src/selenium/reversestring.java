package selenium;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args)
	{
		//megha----->ahgem
		String Reverse="";
		Scanner sc=new Scanner(System.in);
		String original=sc.next();
		
		int cnt=original.length();
		System.out.println(cnt);
		
		for (int i = cnt-1; i >= 0; i--)
		{
			
//			System.out.println(original.charAt(i));
			
			Reverse=Reverse+original.charAt(i);
		}
		System.out.println(Reverse);
		

	}

}
