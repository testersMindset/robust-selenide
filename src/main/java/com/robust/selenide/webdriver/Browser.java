package com.robust.selenide.webdriver;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    private static WebDriver webDriver;

    public static WebDriver getDriver() {
        if(webDriver == null) {
            loadDriver();
        }
        return webDriver;
    }

    private static void setDriver(WebDriver wDriver){
        webDriver = wDriver;
    }

    private static void loadDriver(){
        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        setDriver(driver);
        WebDriverRunner.setWebDriver(driver);
    }


    public static void closeBrowser(){
        if(webDriver != null) {
           getDriver().quit();
            setDriver(null);
            WebDriverRunner.setWebDriver(null);
        }
    }
}
