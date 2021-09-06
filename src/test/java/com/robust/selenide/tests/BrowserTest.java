package com.robust.selenide.tests;

import com.robust.selenide.pages.HomePage;
import com.robust.selenide.webdriver.Browser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class BrowserTest {

    @BeforeEach
    public void setUp() {
        System.out.println("Starting Browser...");
        open("https://demo.nopcommerce.com/");
    }

    @Test
    public void testThisSiteIsOpen() {
        HomePage homePage = page(HomePage.class);

        System.out.println("Successfully opened the page...");
        homePage.computersMenuLink.click();

    }


    @AfterEach
    public void tearDown() {
        Browser.closeBrowser();
    }

}
