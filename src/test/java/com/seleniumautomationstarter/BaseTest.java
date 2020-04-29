package com.seleniumautomationstarter;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Parent Test
public abstract class BaseTest {

    public SoftAssertions softAssertion;
    public WebDriver driver;

//    @BeforeAll
//    public void bf() {
//        System.out.println("before all");
//    }
//
//    @AfterAll
//    public void af() {
//        System.out.println("after all");
//    }


    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        softAssertion = new SoftAssertions();
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.get("http://webdev-consulting.com/");
        driver.manage().window().maximize();
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }


}
