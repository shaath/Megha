package selenium;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) 
	{
		ArrayList<String> s=new ArrayList<String>();
		
		s.add("Sharath");
		s.add("Megha");
		s.add("Varsha");
		s.add("Shravya");
		s.add(2, "Venki");
		
		System.out.println(s.size());
		
		
		for (int i = 0; i < s.size(); i++)
		{
			System.out.println(s.get(i));
			
		}
		
		
		
		

	}

}
