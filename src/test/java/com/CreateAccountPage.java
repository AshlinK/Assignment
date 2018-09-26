package com;

import utilities.CommonUtil;
import utilities.Locators;

public class CreateAccountPage extends Page {
    public void fillAccountDetails(){
        clickById(Locators.GENDER_ID);
        String firstName=CommonUtil.generateRandomString(10);
        typeById(Locators.CUSTOMER_FIRSTNAME_ID,firstName);
        String lastName=CommonUtil.generateRandomString(10);
        typeById(Locators.CUSTOMER_LASTNAME_ID,lastName);
        String password=CommonUtil.generateRandomNumber(5);
        typeById(Locators.PASSWORD_ID,password);
        selectByValue(Locators.SELECT_DAYS_ID,"14");
        selectByValue(Locators.SELECT_MONTHS_ID,"1");
        selectByValue(Locators.SELECT_YEARS_ID,"1992");

    }
}
