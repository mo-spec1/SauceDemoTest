package com.demotestsaucelab.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

    public ProductPage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "title")
    private WebElement productTitle;

    public void isProductTitleDisplayed()
    {
        waitForElementToBeDisplayed(productTitle);
        Assert.assertTrue(productTitle.isDisplayed());
    }
}
