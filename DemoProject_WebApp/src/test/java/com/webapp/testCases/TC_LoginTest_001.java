package com.webapp.testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.webapp.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void LoginTest(){ 
		
		logger.info("Successfully launched");
	LoginPage lp=new LoginPage(driver);
	lp.setUname(username);
	logger.info("Entered Username");
	lp.setPassword(password);
	logger.info("Entered Password");
	lp.clickSubmit();
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			{
		        Assert.assertTrue(true);
			}
	
	else
	{
        Assert.assertTrue(false);

	}
	}
}
