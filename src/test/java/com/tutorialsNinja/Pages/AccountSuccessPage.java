package com.tutorialsNinja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSuccessPage {

    public WebDriver driver;

    @FindBy(xpath = "//p[contains(text(), 'Congratulations! Your new account has been successfully created!')]")
    private WebElement accountSuccessMessage;


    public AccountSuccessPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean displayStatusOfAccountSuccessMessage(){
        boolean status = accountSuccessMessage.isDisplayed();
        return status;
    }
}
