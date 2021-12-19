package com.demotestsaucelab.pages;

import com.demotestsaucelab.common.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Driver
{
    public String BaseURL = "https://www.saucedemo.com/";
    public Select select;

    public void launchURL(){
        driver.navigate().to(BaseURL);
    }

    public void selectByValue(WebElement element, String text)
    {
        select = new Select (element);
        select.selectByVisibleText(text);
    }

    public void selectByIndex(WebElement element, int index)
    {
        select = new Select (element);
        select.selectByIndex(index);
    }

    public void waitForElementToBeDisplayed(WebElement element)
    {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
