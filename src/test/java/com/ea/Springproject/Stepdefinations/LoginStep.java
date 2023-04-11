package com.ea.Springproject.Stepdefinations;

import com.ea.Springproject.Pages.BasePage;
import com.ea.Springproject.Pages.LoginPage;
import com.ea.Springproject.Pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class LoginStep {

    @Autowired
    MainPage mainPage;

    @Autowired
    LoginPage loginPage;

    @Autowired
     public WebDriver driver;

    @Value("${app.url}")
    private String appUrl;

    private String acttitle;

    @When("user gets the title of page")
    public void user_gets_the_title_of_page() {
      acttitle = loginPage.getPageTitile();
        System.out.println("Title of the Application as " + acttitle);
    }
    @Then("verify the title of the login application")
    public void verify_the_title_of_the_login_application() {
        Assert.assertEquals("LoginPage Practise | Rahul Shetty Academy",acttitle);
    }
    @When("user enters username as {string}")
    public void user_enters_username_as(String username){
        loginPage.enteruserName(username);
    }
    @When("user enters the password as {string}")
    public void user_enters_the_password_as(String password) {
        loginPage.enterPassword(password);
    }
    @When("user click on the login button")
    public void user_click_on_the_login_button() {
        loginPage.clickterms();
        loginPage.signIn();
    }
}
