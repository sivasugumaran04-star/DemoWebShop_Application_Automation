package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	public  RegisterPage (WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//a[text()='Register']")
    private WebElement rbtn;
    @FindBy (name="Gender")
    private WebElement Gender;
	@FindBy(name="FirstName")
	  private WebElement FirstName;
	 @FindBy (name="LastName")
	    private WebElement LastName;
	 @FindBy (name="Email")
	    private WebElement Email;
	 @FindBy (name="Password")
	    private WebElement Password;
	 @FindBy (name="ConfirmPassword")
	    private WebElement ConfirmPassword;
	 @FindBy (xpath="(//input[@type='submit'])[2]")
	    private WebElement registerbutton;
	// @FindBy (xpath="//input[@value='Continue']")
	  //  private WebElement Continuebutton;
	 
	 @FindBy (xpath="//div[@class='validation-summary-errors']")
	    private WebElement errorMsg;
	 
	 public String getErrorMessage() {
		return errorMsg.getText();
		 }
	 
	 public void register(String FirstName,String LastName ,String Email,String Password,String ConfirmPassword) {
		  rbtn.click();
		  Gender.click();
		  this.FirstName.sendKeys(FirstName);
		  this.LastName.sendKeys(LastName);
		  this.Email.sendKeys(Email);
		  this.Password.sendKeys(Password);
		  this.ConfirmPassword.sendKeys(ConfirmPassword);
		  registerbutton.click();
		 // Continuebutton.click();
    }
}
