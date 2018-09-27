package com;

import org.testng.Assert;
import utilities.Locators;

public class ShoppingCartPage extends Page {

    public void increaseProduct1Qty(){
        waitForElementToBeVisibleByXpath(Locators.ADD_QUANTITY_PRODUCT1_XPATH);
        clickByXpath(Locators.ADD_QUANTITY_PRODUCT1_XPATH);
    }

    public void verifyProduct1Total(){
        double price=getTextByXpath(Locators.PRODUCT1_PRICE_XPATH);
        double quantity=getValueByXpath(Locators.PRODUCT1_QUANTITY_XPATH);
        double total=getTextByXpath(Locators.PRODUCT1_TOTAL_XPATH);
        System.out.println("Product 1:"+price*quantity+" "+total);
        Assert.assertEquals(price*quantity,total,"Total do not match");
    }

    public void increaseProduct2Qty(){
        waitForElementToBeVisibleByXpath(Locators.ADD_QUANTITY_PRODUCT2_XPATH);
        clickByXpath(Locators.ADD_QUANTITY_PRODUCT2_XPATH);
    }

    public void verifyProduct2Total(){
        double price=getTextByXpath(Locators.PRODUCT2_PRICE_XPATH);
        double quantity=getValueByXpath(Locators.PRODUCT2_QUANTITY_XPATH);
        double total=getTextByXpath(Locators.PRODUCT2_TOTAL_XPATH);
        System.out.println("Product 2:"+price*quantity+" "+total);
        Assert.assertEquals(price*quantity,total,"Total do not match");
    }

    public void verifyGrossTotal(){

    }

    public void proceedToCheckout(){

    }
}
