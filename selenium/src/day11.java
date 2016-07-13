import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.orgHrm.Master.orgMaster;

public class day11 
{

	public static void main(String[] args) throws IOException 
	{
		orgMaster om=new orgMaster();
		String xlpath="F:\\Megha\\selenium\\src\\com\\orgHrm\\Testdata\\Testdata.xlsx";
		String xlout="F:\\Megha\\selenium\\src\\com\\orgHrm\\Results\\Empres.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmpregData");
//		XSSFRow r=ws.getRow(4);
//		XSSFCell c=r.getCell(0);
//		System.out.println(c.getStringCellValue());
		
		int rc=ws.getLastRowNum();
		om.org_Launch("Http://opensource.demo.orangehrm.com");
		om.org_Login("Admin", "admin");
		for (int i = 1; i <= rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.createCell(2);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			System.out.println(f+"--------------"+l);
			
			String res=om.org_Empreg(f, l);
		
			c2.setCellValue(res);
			
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		om.org_Logout();
		om.org_Close();
		
		

	}

}
