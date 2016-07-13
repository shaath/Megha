package day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {

	public static void main(String[] args)
	{
		Set<String> s=new HashSet<>();
		s.add("Megha");
		s.add("Varsha");
		s.add("Sandeep");
		s.add("kanchan");
		s.add("kirthi");
		s.add("Megha");
		
		System.out.println(s.size());
		Iterator<String> it=s.iterator();
		while (it.hasNext()) 
		{
			String value = it.next();
			System.out.println(value);
			
		}

	}

}
