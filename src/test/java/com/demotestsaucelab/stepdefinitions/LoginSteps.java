package com.demotestsaucelab.stepdefinitions;

import com.demotestsaucelab.pages.BasePage;
import com.demotestsaucelab.pages.LoginPage;
import com.demotestsaucelab.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import sun.security.util.Password;

public class LoginSteps extends BasePage{

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

    @Given("I navigate to the Sauce Labs Login Page")
    public void navigateToLoginPage() {
        loginPage.launchURL();
    }

    @When("I enter the credentials {string} and {string}")
    public void i_enter_the_credentials_and(final String Username, final String Password) {
        loginPage.enterUsername(Username);
        loginPage.enterPassword(Password);
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickLogin();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        productPage.isProductTitleDisplayed();
    }

    @When("I enter the Username {string}")
    public void iEnterTheUsername(final String locked_out_user) {
        loginPage.enterUsername(locked_out_user);

    }

    @And("I enter the Password {string}")
    public void iEnterThePassword(final String secret_sauce) {
        loginPage.enterPassword(secret_sauce);
    }

    @Then("an error message is displayed")
    public void anErrorMessageIsDisplayed() {
        loginPage.errorMessageDisplayed();
    }
}
