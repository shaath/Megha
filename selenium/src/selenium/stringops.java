package selenium;

public class stringops {

	public static void main(String[] args) 
	{
		String city="Hyderabad";
		
//		if (city.contains("bd"))
//		{
//			System.out.println("Given string available in the city variable");
//		}
//		else
//		{
//			System.out.println("Given string not available in the city variable");
//		}
		
		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());
		//to get the length of the string
		
		System.out.println(city.length());
		
		System.out.println(city.charAt(4));
		
		System.out.println(city.substring(2, 5));
		
		System.out.println(city.substring(4));

	}

}
