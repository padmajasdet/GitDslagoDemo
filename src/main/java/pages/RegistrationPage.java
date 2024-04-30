package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	public WebDriver ldriver;
public RegistrationPage ( WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements( rdriver,this);
}
@FindBy(className="btn")
WebElement getstarted;

@FindBy(linkText="Register")
WebElement Register;

@FindBy(name="username")
WebElement username;

@FindBy(name="password1")
WebElement password;

@FindBy(name="password2")
WebElement confirmpassword;

@FindBy(name="password2")
WebElement confirmpassword;
}
