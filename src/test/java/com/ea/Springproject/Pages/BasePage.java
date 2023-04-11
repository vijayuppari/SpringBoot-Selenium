package com.ea.Springproject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public abstract class BasePage {

    @Autowired
    private WebDriver driver;
    @PostConstruct
    public void initPage() {
        PageFactory.initElements(driver,this);
    }

}
