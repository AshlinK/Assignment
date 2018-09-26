package com;

import org.openqa.selenium.By;
import utilities.Locators;

public class HomePage extends Page{

    public LoginPage goToLogin(){
        waitForElementToBeVisibleByXpath(Locators.LOGIN_XPATH);
        clickByXpath(Locators.LOGIN_XPATH);
        return new LoginPage();
    }
}
