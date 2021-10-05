package com.stepdefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OneDwithH {
	WebDriver driver;
	@Given("user is on the same products")
	public void user_is_on_the_same_products() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@When("user should search products")
	public void user_should_search_products(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> m = dataTable.asMap(String.class, String.class);
		String data = m.get("Laptop");
		System.out.println(data);

		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys(data, Keys.ENTER);
	}

	@Then("user should verify all product listed success")
	public void user_should_verify_all_product_listed_success() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.quit();
	}
}
