package com.seleniumautomationstarter;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumAutomationStarterApplicationTests {

	SoftAssertions softAssertions = new SoftAssertions();

	@BeforeEach
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	}

    @Test
	public void validateFacebookLogin() {

		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anastasia");
		driver.findElement(By.id("pass")).sendKeys("anastasia password");
		driver.findElement(By.xpath("//button[@value='Log In']")).click();
	}

	@Test
	public void validateAnastisia() {

		WebDriver driver = new ChromeDriver();
		driver.get("http://webdev-consulting.com/");

		driver.findElement(By.id("menu-item-89")).click();
		String actualDesigntext = driver.findElement(By.xpath("//h2[text()='Design work']")).getText().toLowerCase();

		softAssertions.assertThat(actualDesigntext)
				.as("In Design tab there is not Design Work")
				.isEqualTo("Design Work".toLowerCase());

		softAssertions.assertAll();
		//softAssertion = tests will execute eventhough the preceeding tests are failed
	}

}
