package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.By;

public class CheckoutPage {
 
	WebDriver driver;
	public CheckoutPage (WebDriver driver) {
         this.driver=driver;
		 PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingcart;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement checkbox;
	@FindBy(xpath="//button[@name='checkout']")
	private WebElement checkout;
	@FindBy(id="BillingNewAddress_City")
	private WebElement city;
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement add1;
	@FindBy(id="BillingNewAddress_Address2")
	private WebElement add2;
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement zipcode;
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement pno;
	@FindBy(xpath="(//input[@title='Continue'])[1]")
	private WebElement continue1;
	
	@FindBy(id="PickUpInStore")
	private WebElement chbox;
	@FindBy(xpath="(//input[@type='button'])[3]")
	private WebElement continue2 ;
	@FindBy(xpath="(//input[@value='Continue'])[4]")
	private WebElement continue3;
	@FindBy(xpath="(//input[@value='Continue'])[5]")
	private WebElement continue4;
	@FindBy(xpath="//input[@value='Confirm']")
	private WebElement confirm;
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement Continue;
	
	
	
	public void checkout() {
		shoppingcart.click();
		checkbox.click();
		checkout.click();
		city.sendKeys("chennai");
		add1.sendKeys("ekkatuthangal");
		zipcode.sendKeys("600031");
		pno.sendKeys("9876543210");
		continue1.click();
		
		chbox.click();
		continue2.click();
		continue3.click();
		continue4.click();
		confirm.click();
		Continue.click();
		Assert.assertEquals(driver.getTitle().contains("Demo Web Shop"), true);
		
	}
	
}
