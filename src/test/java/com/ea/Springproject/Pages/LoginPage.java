
package com.ea.Springproject.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LoginPage extends BasePage {

    @Autowired
     WebDriver driver;

    @FindBy(how = How.ID, using = "username")
    public WebElement username;
    @FindBy(how = How.ID, using = "password")
    public WebElement password;
    @FindBy(how = How.ID, using = "terms")
    public WebElement terms;
    @FindBy(how = How.ID, using = "signInBtn")
    public WebElement signInBtn;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'terms and conditions')]")
    public WebElement termsandconditions;


    public String getPageTitile(){
        return driver.getTitle();
    }
    public boolean termsconditionslink(){
        return  termsandconditions.isDisplayed();
    }
    public void enteruserName(String uname){
        username.sendKeys(uname);
    }
    public void enterPassword(String pword){
        password.sendKeys(pword);
    }
    public void clickterms(){
        terms.click();
    }
    public void signIn(){
        signInBtn.click();
    }
    public HomePage doLogin(String uname, String pass){
        username.sendKeys(uname);
        password.sendKeys(pass);
        terms.click();
        signInBtn.click();
        return  new HomePage();
    }
}

