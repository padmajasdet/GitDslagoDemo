package PageObjects;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

	//public static WebElement textInsideInputBox;
	public WebDriver ldriver;
	//public  JavascriptExecutor jse=(JavascriptExecutor)ldriver;
	public SigninPage ( WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
}
	//page objects
	//data driven excel
	@FindBy(linkText="Sign in")
	WebElement signin;
	
	@FindBy(name="password")
	WebElement password;

	@FindBy(name="username")
	 WebElement username;
	
	// textInsideInputBox = username.getAttribute("value");
	
	@FindBy(xpath="//input[@value='Login']")
		WebElement login;
	@FindBy(xpath="//div[@class='alert alert-primary']")
		WebElement statusmessage;
	
	
	//actions
	
	public void signin() {
		signin.click();
		}
	public void username(String username1) {
		username.sendKeys(username1);
			
	}
	
	public void Login() {
		login.click();
								
	}
	public void Password(String password1) {
		password.sendKeys(password1);
				
	}
public void displayAlert() {
	if(statusmessage.isDisplayed()) {
		System.out.println(statusmessage.getText());
				}
	else {
		System.out.println("Please fill out the fields");
}
	
}
}
