package casestudy.scenario;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class scenario3_and_4_step_definition {
WebDriver driver;
WebDriverWait wait;
@Given("^start the browser and login in TestMe App$")
public void start_the_browser_and_login_in_TestMe_App() throws Throwable {
	driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	driver.findElement(By.name("userName")).sendKeys("lalitha");
	driver.findElement(By.name("password")).sendKeys("Password123");
	driver.findElement(By.name("Login")).click();
	Assert.assertEquals(driver.getTitle(), "Home");
}

@When("^search product in search engine as \"([^\"]*)\"$")
public void search_product_in_search_engine_as(String arg1) throws Throwable {
    driver.findElement(By.name("products")).sendKeys(arg1);    
}


@When("^proceed upto payment$")
public void proceed_upto_payment() throws Throwable {
		 wait= new WebDriverWait(driver, 50);
	   driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();//find_details
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();//add_to_cart
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();//click_cart
	    driver.findElement(By.xpath("/html/body/main/section/div[3]/table/tfoot/tr[2]/td[5]/a")).click();//check_out
	    driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();//proceed_to_pay
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("radio1")));
	    driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label")).click();//allahabad_bank
	    driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();//continue_to_pay
	   // driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/a")).click();
	    driver.findElement(By.name("username")).sendKeys("123456");
	    driver.findElement(By.name("password")).sendKeys("Pass@456");
	    driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	    driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	    driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	    driver.findElement(By.xpath("/html/body/header/div/div/ul/b/a[2]")).click();
}


@Then("^validation of successful end to end flow in TestMe App$")
public void validation_of_successful_end_to_end_flow_in_TestMe_App() throws Throwable {
	wait= new WebDriverWait(driver, 50);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("val")));
	Assert.assertEquals(driver.getTitle(), "Home");
	System.out.println(" Successful!!");
	driver.close();
}
@Given("^Start the browser and proceed to TestMe App$")
public void start_the_browser_and_proceed_to_TestMe_App() throws Throwable {
	driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
}

@Then("^validate that no product in available message is shown correctly$")
public void validate_that_no_product_in_available_message_is_shown_correctly() throws Throwable {
	 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();//find_details
	 Assert.assertEquals("Sorry no products available in this category. Please try some other", driver.findElement(By.xpath("/html/body/section/div/div/div[2]/h3")).getText());
	 System.out.println("SORRY! NO PRODUCTS AVAILABLE");
  driver.close();
}

@Then("^validate if the popup displays for leaving the searchbar blank$")
public void validate_if_the_popup_displays_for_leaving_the_searchbar_blank() throws Throwable {
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();//find_details
	Alert alert = driver.switchTo().alert();
	alert.accept();
	System.out.println("Please enter some product name ");
	driver.close();
}

}
