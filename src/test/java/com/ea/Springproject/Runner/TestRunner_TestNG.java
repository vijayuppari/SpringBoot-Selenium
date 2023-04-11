package com.ea.Springproject.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features =  {"src/test/Features"},
        glue = "com.ea.Springproject.Stepdefinations",
        plugin ={"pretty","timeline:test-output-thread/"}

)
public class TestRunner_TestNG extends AbstractTestNGCucumberTests {


}
