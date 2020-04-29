package com.seleniumautomationstarter.regression.webdev;

import com.seleniumautomationstarter.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

// wedDev is a child Test Case inherits from BaseTest
public class WebDevTest extends BaseTest {

    @Test
    public void validateFacebookUser() {

        driver.findElement(By.id("menu-item-89")).click();
        String actualDesigntext = driver.findElement(By.xpath("//h2[text()='Design work']")).getText().toLowerCase();

        softAssertion.assertThat(actualDesigntext)
                .as("In Design tab there is not Design Work")
                .isEqualTo("Design Work".toLowerCase());

        softAssertion.assertAll();
        //softAssertion = tests will execute eventhough the preceeding tests are failed
    }
}
