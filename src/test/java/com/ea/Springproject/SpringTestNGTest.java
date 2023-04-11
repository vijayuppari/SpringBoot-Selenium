package com.ea.Springproject;

import com.ea.Springproject.Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.OverrideAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;


@SpringBootTest
public class SpringTestNGTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private WebDriver driver;

    @Value("${app.url}")
    private String appUrl;

    @Autowired
    private MainPage mainPage;

    @BeforeTest
    protected void setupLaunch(){
        driver.get(appUrl);
    }
    @Test
    public void testLogin(){
        mainPage.performLogin();
    }
    @BeforeClass(alwaysRun = true)
    @BeforeSuite(alwaysRun = true)
    @Override
    public void springTestContextPrepareTestInstance() throws Exception{
        super.springTestContextPrepareTestInstance();
    }

    @AfterClass
    protected void tearDown(){

        driver.quit();
    }
}
