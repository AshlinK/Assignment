package com;

import utilities.CommonUtil;
import utilities.Locators;
import utilities.Property;
import utilities.TestProperties;

public class LoginPage extends Page {

    public CreateAccountPage signUp(){
       typeById(Locators.EMAIL_ID,CommonUtil.generateRandomEmailId());
       clickById(Locators.CREATE_ACCOUNT_BUTTON_ID);
       return new CreateAccountPage();
    }
}
