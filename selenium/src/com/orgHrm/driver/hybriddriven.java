package com.orgHrm.driver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.orgHrm.Master.orgMaster;

public class hybriddriven 
{
	@Test
	public void driver() throws IOException
	{
		orgMaster om=new orgMaster();
		String res=null;
		
		String xlpath="F:\\Megha\\selenium\\src\\com\\orgHrm\\Testdata\\Hybrid.xlsx";
		String xlout="F:\\Megha\\selenium\\src\\com\\orgHrm\\Results\\hybridout.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("empreg");
		
		
		int tcRc=ws.getLastRowNum();
		int tsRc=ws1.getLastRowNum();
		int empRc=ws2.getLastRowNum();
		
		for (int i = 1; i <= tcRc; i++) 
		{
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcid=ws.getRow(i).getCell(0).getStringCellValue();
				for (int j = 1; j <= tsRc; j++) 
				{
					String tstcid=ws1.getRow(j).getCell(0).getStringCellValue();
					
					if (tcid.equalsIgnoreCase(tstcid))
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						
						switch (key) 
						{
						case "Launch":
							res=om.org_Launch("http://opensource.demo.orangehrm.com");
							break;
						case "login":
							res=om.org_Login("Admin", "admin");
							break;
							
						case "logout":	
							res=om.org_Logout();
							om.org_Close();
							break;
							
						case "Empreg":	
							for (int k = 1; k <= empRc; k++)
							{
								String f=ws2.getRow(k).getCell(0).getStringCellValue();
								String l=ws2.getRow(k).getCell(1).getStringCellValue();
								res=om.org_Empreg(f, l);
								ws2.getRow(k).createCell(2).setCellValue(res);
							}
							
							break;
						case "Userreg":
							res=om.org_Userreg("Venki Ch", "venki123456", "venki123456", "venki123456");
							break;
							
						case "Ulogin":
							res=om.org_Login("venki123456", "venki123456");
							break;
						}
						//test steps result updation
						ws1.getRow(j).createCell(4).setCellValue(res);
						//test case result updation
						if (!ws1.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).createCell(3).setCellValue(res);
							
						}
						else
						{
							ws.getRow(i).createCell(3).setCellValue("Fail");
						}
						
					}
					
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
			
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
	}

}
