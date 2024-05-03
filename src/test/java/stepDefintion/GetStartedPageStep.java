package stepDefintion;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.RegistrationPage;
import PageObjects.getStartedpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetStartedPageStep  {
	public WebDriver driver;
	public  getStartedpage gsp;

@Given("The user should open the DS Algo Portal URL in any supported browser")
public void the_user_should_open_the_ds_algo_portal_url_in_any_supported_browser() {
	 driver=new ChromeDriver();
	  gsp=new  getStartedpage(driver);
	 driver.get("https://dsportalapp.herokuapp.com");
    }

@When("The user clicks the {string} button")
public void the_user_clicks_the_button(String string) {
	gsp.getstartedclick();
   
}

@Then("The user should land in Data Structure Introduction Page with {string} and {string} links")
public void the_user_should_land_in_data_structure_introduction_page_with_and_links(String string, String string2) {
    driver.getTitle();
    Assert.assertEquals("NumpyNinja",driver.getTitle());
    System.out.println("currently we are in "+driver.getTitle())	;
    //System.out.println("currently we are in "+Title)	;
driver.close();
}




}
