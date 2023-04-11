package com.ea.Springproject.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class HomePage extends  BasePage{

    @Autowired
    private WebDriver driver;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Checkout')]")
    public WebElement checkout;

    @FindBys(@FindBy(xpath = "//*[contains(text(),'Shop Name')]//following::div[1]//a"))
    public List<WebElement> categories;

    public String getShoppingtitle(){
        return  driver.getTitle();
    }
    public int getthecategorycount(){
        return categories.size();
    }
    public boolean verifycheckoutlink(){
        return checkout.isDisplayed();
    }
    public void getcategorieslist(){
        categories.stream().map(ele->ele.getText()).collect(Collectors.toList());
    }
}
