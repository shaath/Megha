package com.orgHrm.testNGMaster;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider 
{
	@DataProvider
	public Object[][] data()
	{
		Object[][] d=new Object[3][2];
		
		d[0][0]="User1";
		d[0][1]="Pwd1";
		
		d[1][0]="User2";
		d[1][1]="Pwd2";
		
		d[2][0]="User3";
		d[2][1]="Pwd3";
		
		return d;
	}
	
	@Test(dataProvider="data")
	public void login(String u,String p)
	{
		System.out.println(u+"-----"+p);
		
	}
	
	

}
