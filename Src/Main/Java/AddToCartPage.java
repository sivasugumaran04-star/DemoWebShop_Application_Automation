package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddToCartPage {
	WebDriver driver;
	public  AddToCartPage(WebDriver driver) {

		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//div[@class='product-item'])[1]")
	 private WebElement addtocart;
	@FindBy(xpath="giftcard_2.RecipientName")
	private WebElement name;
	@FindBy(name="giftcard_2.RecipientEmail")
	private WebElement email;
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	private WebElement addtocart2;
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingcart;
	@FindBy(xpath="//input[@value='6662015']")
	private WebElement checkbtn;
	@FindBy(xpath="//input[@value='Update shopping cart']")
	private WebElement update;
	@FindBy(xpath="(//input[contains(@name,'itemquantity')])[1]")
	private WebElement qa;
	
	
	 public void addtocart(String name2,String Email2 ) {

		  addtocart.click();
		  name.sendKeys(name2);
		  email.sendKeys(Email2);
		  addtocart.click();
		  String ep="";
		  String at = driver.findElement(By.xpath("//div[@id='bar-notification']")).getText();
		  Assert.assertEquals(ep.contains("The product has been added to your "),at);
	 }
	 public void removeProduct() {
		 shoppingcart.click();
		 checkbtn.click();
		 update.click();
		  String ep="";
		  String at = driver.findElement(By.xpath("//span[@class='cart-qty']")).getText();
		  Assert.assertEquals(ep.contains("0"),at);
		}
	 public void updateProduct(String qandity) {
		 shoppingcart.click();
		 qa.sendKeys(qandity);
		 update.click();
		 String ep="";
		  String at = driver.findElement(By.xpath("(//input[@type='text'])[2]")).getText();
		  Assert.assertEquals(ep.contains("5"),at);
		}
	 
} 
