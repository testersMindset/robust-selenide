package com.robust.selenide.steps;

import com.robust.selenide.pages.HomePage;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.page;

public class MenuSteps {


    @Given("^user validates links dropdown on the menu are working correctly$")
    public void testThisSiteIsOpen() {
        HomePage homePage = page(HomePage.class);
        System.out.println("Successfully opened the page...");
        homePage.computersMenuLink.click();
    }

}
