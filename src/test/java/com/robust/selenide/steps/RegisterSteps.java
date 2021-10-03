package com.robust.selenide.steps;

import com.robust.selenide.pages.HomePage;
import com.robust.selenide.pages.RegisterPage;
import io.cucumber.java.en.Given;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

import static com.codeborne.selenide.Selenide.page;

public class RegisterSteps {


    @Given("^user registers new user with following values:$")
    public void registerAsNewUser(Map<String, String> values) {
        HomePage homePage = page(HomePage.class);
        homePage.registerLink.click();

        RegisterPage registerPage = page(RegisterPage.class);
        if (StringUtils.equalsIgnoreCase("male", values.get("gender"))) {
            registerPage.genderMale.click();
        } else {
            registerPage.genderFemale.click();
        }
        registerPage.firstName.sendKeys(values.get("firstName"));
        registerPage.lastName.sendKeys(values.get("lastName"));
        registerPage.daySelector.selectOptionContainingText(values.get("day"));
        registerPage.monthSelector.selectOptionContainingText(values.get("month"));
        registerPage.yearSelector.selectOptionContainingText(values.get("year"));
        registerPage.email.sendKeys(values.get("email"));
        registerPage.password.sendKeys(values.get("password"));
        registerPage.confirmPassword.sendKeys(values.get("confirmPassword"));

        System.out.println("FORMS SUBMITTED AS NEW USER >> " + values.get("firstName"));
    }

}
