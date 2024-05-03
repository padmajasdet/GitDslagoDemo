package PageObjects;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	public WebDriver ldriver;
	//public  JavascriptExecutor jse=(JavascriptExecutor)ldriver;
	public RegistrationPage ( WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	
	//page object model
	
	@FindBy(className="btn")
	WebElement getstarted;

	@FindBy(linkText="Register")
	WebElement Register;

	@FindBy(xpath="//*[@id='id_username']")
	WebElement username;

	@FindBy(name="password1")
	WebElement password;

	@FindBy(name="password2")
	WebElement confirmpassword;

	@FindBy(xpath="//*[@value='Register']")
	WebElement Registerbutton;
	
	//Actions
	public void getStarted() {
		getstarted.click();
	}
	public void register() {
		//jse.executeScript("arguments[0].click();", Register);
		Register.click();
	}
	public void username(String username1) {
		username.sendKeys(username1);
	}
	public void password(String password1) {
		password.sendKeys(password1);
	}
	public void password2(String password2) {
		confirmpassword.sendKeys(password2);
	}
	public void registerbutton()  {
		Registerbutton.click();
				
	}


}