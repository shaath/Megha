package day10;

import com.orgHrm.Master.orgMaster;

public class orghrmsuite {

	public static void main(String[] args)
	{
		orgMaster om=new orgMaster();
		//login
		String res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//empreg
		
		res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Empreg("Pranay", "Reddy");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//userreg
		
		res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Userreg("Pranay Reddy", "Pranay123", "Pranay123", "Pranay123");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//userlogin
		
		 	res=om.org_Launch("http://opensource.demo.orangehrm.com");
			System.out.println(res);
			
			res=om.org_Login("Pranay123", "Pranay123");
			System.out.println(res);
			
			res=om.org_Logout();
			System.out.println(res);
			
			om.org_Close();


	}

}
