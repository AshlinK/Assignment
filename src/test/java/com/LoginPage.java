package com;

import utilities.Locators;
import utilities.Property;
import utilities.TestProperties;

public class LoginPage extends Page {

    public CreateAccountPage signUp(){
       typeById(Locators.EMAIL_ID,TestProperties.get(Property.EMAIL_ID));
       clickById(Locators.CREATE_ACCOUNT_BUTTON_ID);
       return new CreateAccountPage();
    }
}
