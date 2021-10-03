package com.robust.selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {

    public SelenideElement registerFormParent = $(".form-fields");
    public SelenideElement genderMale = $("#gender #gender-male");
    public SelenideElement genderFemale = $("#gender #gender-female");

    public SelenideElement firstName = $("#FirstName");
    public SelenideElement lastName = $("#LastName");

    public SelenideElement daySelector = $(By.name("DateOfBirthDay"));
    public SelenideElement monthSelector = $(By.name("DateOfBirthMonth"));
    public SelenideElement yearSelector = $(By.name("DateOfBirthYear"));

    public SelenideElement email = $("#Email");
    public SelenideElement password = $("#Password");
    public SelenideElement confirmPassword = $("#ConfirmPassword");

}
