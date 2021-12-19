package com.demotestsaucelab.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "user-name")
    private WebElement EnterUsername;

    public void enterUsername(final String Username)
    {
        EnterUsername.sendKeys(Username);
    }

    @FindBy (id = "password")
    private WebElement EnterPassword;

    public void enterPassword (final String Password)
    {
        EnterPassword.sendKeys(Password);
    }

    @FindBy (id = "login-button")
    private WebElement ClickLogin;

    public void clickLogin()
    {
        ClickLogin.click();
    }

    @FindBy (xpath = "//h3[@data-test = 'error']")
    private WebElement errorMessage;

    public void errorMessageDisplayed(){
        waitForElementToBeDisplayed(errorMessage);
        Assert.assertTrue(errorMessage.isDisplayed());
    }
}
