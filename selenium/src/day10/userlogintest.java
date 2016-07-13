package day10;

import com.orgHrm.Master.orgMaster;

public class userlogintest {

	public static void main(String[] args) 
	{
		orgMaster om=new orgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		res=om.org_Login("Sandeep123", "Sandeep123");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

	}

}
