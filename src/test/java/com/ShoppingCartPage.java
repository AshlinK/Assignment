package com;

import org.testng.Assert;
import utilities.Locators;

public class ShoppingCartPage extends Page {

    public void increaseProduct1Qty(){
        waitForElementToBeVisibleByXpath(Locators.ADD_QUANTITY_PRODUCT1_XPATH);
        clickByXpath(Locators.ADD_QUANTITY_PRODUCT1_XPATH);
    }

    public void verifyProduct1Total(){
        waitForElementToBeVisibleByXpath(Locators.PRODUCT1_PRICE_XPATH);
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
        waitForElementToBeVisibleByXpath(Locators.PRODUCT2_PRICE_XPATH);
        double price=getTextByXpath(Locators.PRODUCT2_PRICE_XPATH);
        double quantity=getValueByXpath(Locators.PRODUCT2_QUANTITY_XPATH);
        double total=getTextByXpath(Locators.PRODUCT2_TOTAL_XPATH);
        System.out.println("Product 2:"+price*quantity+" "+total);
        Assert.assertEquals(price*quantity,total,"Total do not match");
    }

    public void verifyGrossTotal(){
        double product1Total=getTextByXpath(Locators.PRODUCT1_TOTAL_XPATH);
        double product2Total=getTextByXpath(Locators.PRODUCT2_TOTAL_XPATH);
        double total=getTextByXpath(Locators.PRODUCTS_TOTAL_XPATH);
        double shippingTotal=getTextByXpath(Locators.PRODUCTS_SHIPPING_TOTAL_XPATH);
        double grossTotal=getTextByXpath(Locators.PRODUCTS_GROSS_TOTAL_XPATH);
        Assert.assertEquals(product1Total+product2Total,total,"Total do not match");
        Assert.assertEquals(product1Total+product2Total+shippingTotal,grossTotal,"Gross Total do not match");
    }

    public void proceedToCheckout(){
        clickByXpath(Locators.PROCEED_TO_CHECKOUT_XPATH);
        waitForElementToBeVisibleByXpath(Locators.SUBMIT_XPATH);
        clickByXpath(Locators.SUBMIT_XPATH);
        waitForElementToBeVisibleById(Locators.CHECKBOX_ID);
        clickById(Locators.CHECKBOX_ID);
        clickByXpath(Locators.SUBMIT_XPATH);
        waitForElementToBeVisibleById(Locators.PAY_BY_WIRE_XPATH);
        clickByXpath(Locators.PAY_BY_WIRE_XPATH);
        clickByXpath(Locators.SUBMIT_XPATH);
    }
}
