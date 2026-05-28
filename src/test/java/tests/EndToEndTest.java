package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.SearchPage;
import utilities.BaseClass;
import utilities.File_Utility;

public class EndToEndTest extends BaseClass{

	@Test
	public void eneToEndTest() {
		LoginPage lp=new LoginPage(driver);
		RegisterPage rp=new RegisterPage(driver);
		SearchPage sp=new SearchPage(driver);
		AddToCartPage ap=new AddToCartPage(driver);
		Checkout cp= new Checkout();
		
	    test.info("Register");
	    rp.register(File_Utility.getExcelData("RegisterData", 1, 1),
	    File_Utility.getExcelData("RegisterData", 1, 2),
	    File_Utility.getExcelData("RegisterData", 1, 3),
	    File_Utility.getExcelData("RegisterData", 1, 4),
	    File_Utility.getExcelData("RegisterData", 1, 5));
	    
	    driver.findElement(By.xpath("//a[text()='Log out']")).click();
	    
	    test.info("Login");
	    lp.login("cvam@gmail.com", "cvalusri");
	    
	    test.info("Search");
	    sp.serch(File_Utility.getPropertyData("search"));
	    
	    test.info("AddToCart");
	    ap.addtocart(File_Utility.getPropertyData("addname"),File_Utility.getPropertyData("addemail"));
	    
	    test.info("Checkout");
	    cp.Checkout();
	    
	    
	    
        //lp.loginWithInValidData("cvam@gmail.com","cva23usri");
		//lp.login("cvam@gmail.com","cva23usri");
		
		//test.info("Serach");
		//hp.searchProduct("laptop");
		
		//test.info("Add To Cart");
		//cp.addProduct();
		
		//test.info("Checkout");
		//ch.checkout();
	}
	
}
