package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {


	WebDriver driver;
	public SearchPage (WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="(//input[@type='text'])[1]")
    private WebElement sbox;
    @FindBy (xpath="(//input[@type='submit'])[1]")
    private WebElement sbtn;
	
    
    @FindBy (xpath="//strong[@class='result']")
    private WebElement errorMsg;
 
 public String getErrorMessage() {
	return errorMsg.getText();
	 }
 
    public void serch(String sbox) {
     this.sbox.sendKeys(sbox);
     sbtn.click();
    }
}
