package com.inetBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetBanking.utilities.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCLass {
	
	Readconfig readconfig=new Readconfig();
	
	String baseURL=readconfig.getApplicationURL();
	String username=readconfig.getUsername();
	String password=readconfig.getPassWord();
	static WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
