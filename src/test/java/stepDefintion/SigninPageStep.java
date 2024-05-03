package stepDefintion;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import PageObjects.RegistrationPage;
import PageObjects.SigninPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninPageStep {
	public WebDriver driver;
	public SigninPage sp;

@Given("The user is on the DS Algo Sign in Page")
public void the_user_is_on_the_ds_algo_sign_in_page() {
	 driver=new ChromeDriver();
	    sp=new SigninPage(driver);
	    driver.get("https://dsportalapp.herokuapp.com/home");
	
}
   


@When("The user clicks login button after entering valid  {string}  and {string}")
public void the_user_clicks_login_button_after_entering_valid_and(String username, String password) {
	sp.signin();
	sp.username(username);
	sp.Password(password);
	sp.Login();
}
@Then("The error message You are logged in")
public void the_error_message_you_are_logged_in() {
	sp.displayAlert();
}

@Then("The error message Invalid Username and Password")
public void the_error_message_invalid_username_and_password() {
	sp.displayAlert();
}
@Then("The error message Please fill it out")
public void the_error_message_please_fill_it_out() {
	System.out.println("Please fill out the fields");
		//sp.displayAlert();
		//driver.close();
}
@Then("The error message {string}")
public void the_error_message(String string) {
	System.out.println(string);
}
//    
}
