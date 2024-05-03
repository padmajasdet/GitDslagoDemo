package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class getStartedpage {

	public WebDriver ldriver;
	public getStartedpage( WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	//POM
	@FindBy(className="btn")
	WebElement getstarted;
	//Action
	
	public void getstartedclick() {
		// TODO Auto-generated method stub
		getstarted.click();
	}
}
