package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Login;
import org.example.pages.P02_Home;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class S01_login {
    P01_Login login_Page=new P01_Login();
    P02_Home home =new P02_Home();
    SoftAssert softAssert =new SoftAssert();
    @Given("Go to login page")
    public void login_page(){
        System.out.println("first step");

       // Hooks.driver.findElement(By.name("email")).sendKeys("testbotitb2@dist.com");

       // Hooks.driver.findElement(By.name("password")).sendKeys("123456");
       // Hooks.driver.findElement(By.name("password")).sendKeys(Keys.ENTER);

        //Hooks.driver.findElement(By.className("button-input")).click();

    }
    @BeforeTest

    @When("User fill valid data and click login")
    public void userFillValidDataAndClickLogin() {
        login_Page.user_Name_field().sendKeys("testbotitb2@dist.com");
        login_Page.password_Field().sendKeys("123456");
        login_Page.login_button().click();

    }
    public void userNavigateToHomePage() {
        softAssert.assertEquals(home.home_page(),"http://transmission-dev.azurewebsites.net/home");


    }





}
