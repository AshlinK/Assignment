package com;

import utilities.CommonUtil;
import utilities.Locators;

public class CreateAccountPage extends Page {
    public ItemListingPage fillAccountDetails(){
        waitForElementToBeVisibleById(Locators.CUSTOMER_FIRSTNAME_ID);
        String firstName=CommonUtil.generateRandomString(10);
        typeById(Locators.CUSTOMER_FIRSTNAME_ID,firstName);

        String lastName=CommonUtil.generateRandomString(10);
        typeById(Locators.CUSTOMER_LASTNAME_ID,lastName);

        String password=CommonUtil.generateRandomPassword(5);
        typeById(Locators.PASSWORD_ID,password);

        selectByValue(Locators.SELECT_DAYS_ID,"14");
        selectByValue(Locators.SELECT_MONTHS_ID,"1");
        selectByValue(Locators.SELECT_YEARS_ID,"1992");

        String companyName=CommonUtil.generateRandomString();
        typeById(Locators.COMPANY_ID,companyName);

        String address=CommonUtil.generateRandomString(20);
        typeById(Locators.ADDRESS_ID,address);

        String city=CommonUtil.generateRandomString();
        typeById(Locators.CITY_ID,city);

        selectByValue(Locators.STATE_ID,"2");

        String zipcode="00000";
        typeById(Locators.POSTCODE_ID,zipcode);

        selectByValue(Locators.COUNTRY_ID,"21");

        String mobileNo=CommonUtil.generateRandomNumber(10);
        typeById(Locators.MOBILE_PHONE_ID,mobileNo);

        String alias=CommonUtil.generateRandomString();
        typeById(Locators.ALIAS_ID,alias);

        clickById(Locators.REGISTER_BUTTON_ID);

        waitForElementToBeVisibleByXpath(Locators.WOMEN_XPATH);
        clickByXpath(Locators.WOMEN_XPATH);

        return new ItemListingPage();
    }
}
