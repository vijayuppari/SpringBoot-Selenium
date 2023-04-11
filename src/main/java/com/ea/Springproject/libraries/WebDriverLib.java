package com.ea.Springproject.libraries;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class WebDriverLib {
    @Bean
    @ConditionalOnProperty(name="browser",havingValue = "Chrome")
    public WebDriver getChromedriver(){
        ChromeOptions co = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        co.addArguments("--remote-allow-origins=*");
        return new ChromeDriver(co);
    }
    @Bean
    @ConditionalOnProperty(name="browser",havingValue = "Edge")
    public WebDriver getEdgebrowser(){
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
