package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RegisterPage;
import utilities.BaseClass;
import utilities.File_Utility;

public class RegisterTest extends BaseClass {

	@Test
	public void registerValidData() {

		RegisterPage rp=new RegisterPage(driver);
		 rp.register(File_Utility.getExcelData("RegisterData", 1, 1),
				    File_Utility.getExcelData("RegisterData", 1, 2),
				    File_Utility.getExcelData("RegisterData", 1, 3),
				    File_Utility.getExcelData("RegisterData", 1, 4),
				    File_Utility.getExcelData("RegisterData", 1, 5));
				    
		
		String ep= File_Utility.getExcelData("RegisterData", 1, 3);
		String at = driver.findElement(By.xpath("//a[text()='siva@yaagoo.com']")).getText();
		Assert.assertEquals(ep,at);
		test.info("Regiter Passed");
	}
	
	@Test
	public void registerInvalidData() {
		RegisterPage rp=new RegisterPage(driver);
		rp.register("siva","M", "siva@gmail.com", "9025cva", "9025cva");
		String at = rp.getErrorMessage();
		String ep="The specified email already exists";
		Assert.assertEquals(ep,at);
		test.info("Regiter Failed");
		//String ep="The specified email already exists";
		//String at = driver.findElement(By.xpath("//li[text()='The specified email already exists']")).getText();
		//Assert.assertEquals(ep,at);
		//test.info("Regiter Failed");
		
		
	}
}
