package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.BaseClass;

public class LoginTest extends BaseClass{

	
	@Test
	public void loginWithValidData() throws Exception{
		
			LoginPage lp=new LoginPage(driver);
			lp.login("cvam@gmail.com", "cvalusri");
			test.info("Login Passed");
		}
	@Test
	public void loginWithInValidData() throws Exception{
		
		LoginPage lp=new LoginPage(driver);
		lp.InvalidloginTest("aSTYRTFGLK", "cva23usri");
		test.info("Login Failed");
	}
		
	}
	
	    
	      
	    
	    
	     
	     
	     
	     
	     

