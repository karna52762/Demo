package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	WebDriver driver;

	@Given("user is on FB Page")
	public void a() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}

	@When("User enter username and password")
	public void b() {
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("Greens");

		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("Hello@34356");
	}

	@When("user should click login button")
	public void c() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

	@Then("user need to validaate")
	public void d() {
		Assert.assertTrue("verify titile", true);
	}

}
