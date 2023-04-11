
package com.ea.Springproject.Pages;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainPage extends BasePage{


    @Autowired
    private LoginPage loginPage;

    public void performLogin(){
        loginPage.doLogin("rahulshettyacademy","learning");
    }

}
