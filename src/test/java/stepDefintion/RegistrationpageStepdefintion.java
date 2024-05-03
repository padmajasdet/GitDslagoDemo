package stepDefintion;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class RegistrationpageStepdefintion {
	public WebDriver driver;
	public RegistrationPage rp;

@Given("user is in landing page")
public void user_is_in_landing_page() {
   	 driver=new ChromeDriver();
	    rp=new RegistrationPage(driver);
	    driver.get("https://dsportalapp.herokuapp.com");
}
@When("^user enters username (.+) , password (.+) and confirm password (.+)$")
public void user_clicks_on_register_button(String username, String password,String confirmpassword) throws InterruptedException {
	rp.getStarted();
	Thread.sleep(5000);
	rp.register();
	rp.username(username);
    rp.password(password);
    rp.password2(confirmpassword);
    rp.registerbutton();
  
}
@Then("page Title should be {string}")
public void page_title_should_be(String Title){
		
	 if(driver.getTitle()=="NumpyNinja") {
	    	
	    	Assert.assertTrue(false);
	    	//assertTrue(): This Assertion verifies the Boolean value returned by the condition. If the Boolean value is true, then the assertion passes the test case.
	    	
	    }
	    else {
	    	Assert.assertEquals(Title,driver.getTitle());
		        System.out.println("currently we are in "+driver.getTitle())	;
		        //System.out.println("currently we are in "+Title)	;
	    	driver.close();
	    }
   
           	
}


 
}





