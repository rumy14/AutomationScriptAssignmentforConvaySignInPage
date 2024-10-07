package com.convay.testcases;



import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.convay.pageobject.BaseTest;
import com.convay.pageobject.LoginPage;
import com.convay.utilities.ReadExcelFile;


public class FailedLoginToTestExtentReport extends BaseTest {
	
	String fileName=System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";

	
	@Test(priority =1,dataProvider="LoginDataProvider")
	public void LoginFailed(String userEmail,String userPwd) throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.loginToPortal(userEmail, userPwd);
		
		if(userEmail.equals(userEmail) && userPwd.equals(userPwd))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(false);
			//lp.logout();
		}
		else
		{
			captureScreenShot(driver,"VerifyLogin");
			Assert.assertTrue(false);
		}
	}
	
	
	//@Test(priority =2)
	public void fetchDashboardText() throws IOException
	{
		LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
		lp.dashboardportal();
	}
	
	
	@DataProvider(name="LoginDataProvider")
	public String[][] LoginDataProvider()
	{
		
		int ttlRows= ReadExcelFile.getRowCount(fileName, "LoginData");
		int ttlColumns= ReadExcelFile.getColCount(fileName, "LoginData");
		
		String data[][]= new String[ttlRows-1][ttlColumns];
		
		for(int i=1;i<ttlRows;i++)
		{
			for(int j=0;j<ttlColumns;j++)
			{
				data[i-1][j]=ReadExcelFile.getCellValue(fileName, "LoginData", i, j);
			}
		}
		return data;
	}

	
	
	
	
}
