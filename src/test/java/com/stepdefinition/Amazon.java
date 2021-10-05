package com.stepdefinition;

import java.util.ArrayList;
import java.util.List;
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

public class Amazon {
	WebDriver driver;
	
	@Given("user is on the same product")
	public void user_is_on_the_same_product() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}

	@When("user should search product")
	public void user_should_search_product(io.cucumber.datatable.DataTable dataTable) {
	List<String> emp = dataTable.asList();
		String data = emp.get(2);
		System.out.println(data);
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys(data,Keys.ENTER);
	  
	}

	@Then("user should verify all product listed succefully")
	public void user_should_verify_all_product_listed_succefully() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.quit();
	}

}
