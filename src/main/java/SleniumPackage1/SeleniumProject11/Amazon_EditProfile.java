package SleniumPackage1.SeleniumProject11;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_EditProfile
{
WebDriver driver;

//@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
//WebElement Account_List;
@FindBy(linkText="Your Account")     
WebElement Account;
@FindBy(xpath="//span[.='Edit login, name, and mobile number']")   
WebElement Edit;
@FindBy(xpath="//a[@aria-label='Edit name']")
WebElement Edit_name;
@FindBy(name="customerName") 
WebElement Change;  
@FindBy(id="cnep_1C_submit_button")
WebElement Save;

/*public void Account_List(WebDriver driver)   
{
Actions a1=new Actions(driver); 
a1.moveToElement(Account_List).perform();
}*/
public void Account_Click()
{
Account.click();
}
public void Edit()
{
Edit.click();
}
public void Edit_name()
{
Edit_name.click(); 
}
public void Change()
{
Change.sendKeys("PriyaGangadhar"); 
}
public void Save_Change()
{
Save.click();
}

 
public Amazon_EditProfile(WebDriver driver) 
 {	 
		PageFactory.initElements(driver, this);
	}
}