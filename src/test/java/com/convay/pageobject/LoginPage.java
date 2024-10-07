package com.convay.pageobject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends BaseTest{

	WebDriver driver;
	//constructor
	public LoginPage(WebDriver lDriver)
	{
		this.driver=lDriver;
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\"loginlabel\"]") WebElement loginclick;
	
	
	@FindBy(xpath="/html/body/div[4]/div/div/div[5]/div[2]/form/div[1]/div[2]/input") WebElement uname;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div[5]/div[2]/form/div[2]/div[2]/input") WebElement pass;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div[5]/div[2]/form/div[3]/input") WebElement loginButton;



	public void loginToPortal(String username, String password) {
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginButton.click();
		
	}

	public void dashboardportal() throws IOException
	{
		
		
	}
}
