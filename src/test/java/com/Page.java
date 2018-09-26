package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import utilities.Property;
import utilities.TestProperties;

import java.util.concurrent.TimeUnit;

public class Page {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static WebElement dropDown;

    public Page() {
        if (driver == null) {
            if (TestProperties.get(Property.BROWSER).equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.executables.chrome.driver", "src/main/resources/executables/executables.chrome/mac/chromedriver");
                driver = new ChromeDriver();
            } else if (TestProperties.get(Property.BROWSER).equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.executables.chrome.driver", "src/main/resources/executables/executables.chrome/mac/firefoxdriver");
                driver = new FirefoxDriver();
            } else if (TestProperties.get(Property.BROWSER).equalsIgnoreCase("ie")) {
                System.setProperty("webdriver.ie.driver", "src/main/resources/executables/executables.chrome/mac/iedriver");
                driver = new FirefoxDriver();
            }

        }
        driver.get(TestProperties.get(Property.TEST_SITE_URL));
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Long.parseLong(TestProperties.get(Property.IMPLICIT_WAIT)), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);

    }

    public void waitForElementToBeVisibleById(String locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
    }

    public void waitForElementToBeVisibleByXpath(String locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickById(String locator) {
        driver.findElement(By.id(locator)).click();
    }

    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void typeById(String locator, String value) {
        driver.findElement(By.id(locator)).sendKeys(value);
    }

    public void typeByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

    public void selectById(String locator, String visibleText) {
        dropDown = driver.findElement(By.id(locator));
        Select select = new Select(dropDown);
        select.selectByVisibleText(visibleText);
    }

    @AfterSuite
    public static void quit() {
        driver.quit();
    }
}
