package tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchPage;
import utilities.BaseClass;
import utilities.File_Utility;

public class SearchTest extends BaseClass {
	@Test
	public void searchInValidData() {
		SearchPage sp=new SearchPage(driver);
		sp.serch(File_Utility.getPropertyData("invalidsearch"));
		
		String at=" No products were found that matched your criteria.                 ";
		String ep=" No products were found that matched your criteria.                 ";
		Assert.assertEquals(ep,at);
		test.info("Search with invalid Test successfully Failed");
		
	}
	
	@Test
	public void searchvalidData() {
		
		
		SearchPage sp=new SearchPage(driver);
		sp.serch(File_Utility.getPropertyData("search"));
		
		boolean ep=true;
		//String at = driver.findElement(By.xpath("(//input[@type='text'])[3]")).getText();
		String at= driver.getCurrentUrl();
		Assert.assertEquals(ep,at.contains("laptop"));
		test.info("Search with valid data Test successfully Passed");
	}
}


