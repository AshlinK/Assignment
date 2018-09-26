package testcases;

import com.CreateAccountPage;
import com.HomePage;
import com.LoginPage;
import org.testng.annotations.Test;

public class Flow {

    @Test
    public void test(){
        HomePage homePage=new HomePage();
        LoginPage loginPage=homePage.goToLogin();
        System.out.println("-----Clicked on login----");
        CreateAccountPage createAccountPage=loginPage.signUp();
        System.out.println("----Sign up now----");
        createAccountPage.fillAccountDetails();
    }
}
