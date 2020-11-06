package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	WebDriver driver;

	@Given("^user allready in login page$")
	public void user_allready_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Software1\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^title of login page is OrangeHRM$")
	public void title_of_login_page_is_OrangeHRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("OrangeHRM", title);

	}

	// @Then("^User enters username and password$")
	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() {
		driver.findElement(By.name("Submit")).click();

	}

	@And("^user is home_page$")
	public void user_is_home_page() {
		String hometitle = driver.getTitle();
		System.out.println(hometitle);
		Assert.assertEquals("OrangeHRM", hometitle);

	}

	@Then("^click on MyInfo page$")
	public void click_on_MyInfo_page() {

		driver.findElement(By.id("menu_pim_viewMyDetails")).click();

	}

	@Then("^click on edit button$")
	public void click_on_edit_button() {

		driver.findElement(By.id("btnSave")).click();

	}

	@Then("^enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enters_and(String firstname, String lastname) {

		driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys(firstname);
		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys(lastname);

	}

	@Then("^enters \"([^\"]*)\"$")
	public void enters(String employeeId) {

		driver.findElement(By.id("personal_txtEmployeeId")).sendKeys(employeeId);

	}

	@Then("^select male radio button$")
	public void select_male_radio_button() {
		driver.findElement(By.id("personal_optGender_1")).click();

	}

	@Then("^select nationlity$")
	public void select_nationlity() {
		WebElement element = driver.findElement(By.id("personal_cmbNation"));
		Select sc = new Select(element);
		sc.selectByVisibleText("Afghan");

	}

	@Then("^clicks on save button$")
	public void clicks_on_save_button() {
		driver.findElement(By.id("btnSave")).click();
		driver.close();
	}

}
