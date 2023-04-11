package com.ea.Springproject.Stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class ApplicationHooks {

    @Autowired
    private WebDriver driver;

    @Value("${app.url}")
    private String appUrl;

    @Before
    public void initilizeTest(Scenario scenario){
        driver.get(appUrl);
    }

    @After
    public void tearDown(Scenario scenario){
        driver.quit();
    }
}
