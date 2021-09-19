package com.robust.selenide.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"classpath:com.robust.selenide.steps", "classpath:com.robust.selenide.hooks"},
        features = "src/test/resources/features",
        stepNotifications = true,
        publish = true
)
public class CucumberRunner {

}
