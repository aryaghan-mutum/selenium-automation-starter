package com.seleniumautomationstarter.regression.facebook;

import com.seleniumautomationstarter.BaseTest;
import com.seleniumautomationstarter.pages.facebook.FacebookLoginPage;
import org.junit.jupiter.api.Test;

class FacebookLoginTest extends BaseTest {

    //reference
    private FacebookLoginPage facebookLoginPage;

    @Test
    public void validateFacebookLogin() {
        facebookLoginPage = new FacebookLoginPage();
        driver.get("http://facebook.com");
        facebookLoginPage.facebookLogin(driver, "anastasia", "password");

    }
}
