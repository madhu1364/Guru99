package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.PageObjects.LoginPage;

public class TC_LoginTest_001  extends BaseCLass{
	
	
@Test
public void loginTest() throws InterruptedException
{
	Thread.sleep(2000);
driver.get(baseURL);


LoginPage lp=new LoginPage(driver);


lp.setUserName(username);


Thread.sleep(2000);
lp.setPassword("Password");



lp.clickSumbit();



if(driver.getTitle().equals("Guru99")) 
{
	Assert.assertTrue(true);
	}
else
{
	Assert.assertTrue(false);
	}


}
}
