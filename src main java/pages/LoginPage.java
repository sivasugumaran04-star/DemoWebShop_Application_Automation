package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	WebDriver driver;
	public  LoginPage (WebDriver driver) {

		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	}
	 @FindBy (xpath="//a[text()='Log in']")
       private WebElement lbtn;
	 
	 @FindBy(name="Email")
	 private WebElement Email;
	 @FindBy(name="Password")
	 private WebElement Password;
	 @FindBy(xpath="(//input[@type='submit'])[2]")
	 private WebElement lbtn2;
	 
	@FindBy(xpath="//li[text()='The credentials provided are incorrect']")
	private WebElement errorMsg;
	
	@FindBy(xpath="//span[@for='Email']")
	private WebElement errorMsg2;
	
	 public String getErrorMessage() {
			return errorMsg.getText();
			 }
	 
	 public String getErrorMessage2() {
			return errorMsg2.getText();
			 }
	 public void login(String Email,String Password ) {

		  
		  lbtn.click();
		  this.Email.sendKeys(Email);
		  this.Password.sendKeys(Password);
		  lbtn2.click();
		  String ep="cvam@gmail.com";
		  String at = driver.findElement(By.xpath("//a[text()='cvam@gmail.com']")).getText();
		  Assert.assertEquals(ep,at);
	 }
	 public void InvalidloginTest(String Email,String Password ) {

		  
		  lbtn.click();
		  this.Email.sendKeys(Email);
		  this.Password.sendKeys(Password);
		  LoginPage lp=new LoginPage(driver);
		  String at =lp.getErrorMessage2();
		  String ep="Login Successfully";
		  Assert.assertEquals(ep,at);
		  lbtn2.click();
	 }
	 
		  
	}

	


