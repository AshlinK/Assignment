package testcases;

import com.*;
import org.testng.annotations.Test;

public class Flow {

    @Test
    public void test() throws InterruptedException{
        HomePage homePage=new HomePage();
        LoginPage loginPage=homePage.goToLogin();
        System.out.println("-----Clicked on login----");
        CreateAccountPage createAccountPage=loginPage.signUp();
        System.out.println("----Sign up now----");
        ItemListingPage itemListingPage=createAccountPage.fillAccountDetails();
        System.out.println("---Account details filled");
        itemListingPage.addProduct1();
        System.out.println("Added product 1");
        itemListingPage.addProduct2();
        System.out.println("Added product 2");
        ShoppingCartPage shoppingCartPage=itemListingPage.openShoppingCart();
        shoppingCartPage.increaseProduct1Qty();
        shoppingCartPage.increaseProduct2Qty();
        shoppingCartPage.verifyProduct1Total();
        shoppingCartPage.verifyProduct2Total();

    }
}
