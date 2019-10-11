
package casestudy.scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Step_definition_Scenario2 {
	WebDriver driver;
	
@Given("^start browser and proceed to login in TestMe App$")
public void start_browser_and_proceed_to_login_in_TestMe_App() throws Throwable {
	driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
}

@When("^username \"([^\"]*)\" password \"([^\"]*)\"$")
public void username_password(String arg1, String arg2) throws Throwable {
	driver.findElement(By.name("userName")).sendKeys(arg1);
	driver.findElement(By.name("password")).sendKeys(arg2);
	driver.findElement(By.name("Login")).click();
}

@Then("^check if login is successful$")
public void check_if_login_is_successful() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 50);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("products")));
	Assert.assertEquals(driver.getTitle(), "Home");
	System.out.println("Logged in Successfully !!");
	driver.close();
}



}
