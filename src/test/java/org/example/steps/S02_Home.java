package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Home;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class S02_Home {
    P02_Home home = new P02_Home();
    SoftAssert softAssert = new SoftAssert();
    String new_price = null;


    @When("user click on catalog")
    public void catalog_Path() {
        System.out.println("category");

        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        home.category_Path().click();

    }

    @And("user click on item")
    public void userClickOnItem() {
        System.out.println("item");
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(2));
        WebElement element = home.item();
        JavascriptExecutor executor = (JavascriptExecutor) Hooks.driver;
        executor.executeScript("arguments[0].click();", element);

        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(home.item()));

        //element.click();

        System.out.println("item 2");
        // home.item().click();
        System.out.println("iten page");

    }

    public void userShouldNavigateToItemPage() {
        System.out.println("iten 3");
        softAssert.assertEquals(home.item_Url(), "http://transmission-dev.azurewebsites.net/catalog");
    }

    @And("user find product and click on edit")
    public void userClickOnEdit() {
        System.out.println("edit");
        home.edit_Button().click();

    }

    @And("user change the price")
    public void userChangeThePrice() throws InterruptedException {
        System.out.println("change price");
        Thread.sleep(2000);
        home.price_Text().clear();
        Thread.sleep(1000);
        int randoemN = new Random().nextInt(401) + 100;
        new_price = String.valueOf(randoemN);
        home.price_Text().sendKeys(new_price);
    }

    @And("user click save")
    public void userClickSave() {
        System.out.println("save");
        home.save_button().click();
    }


    @Then("price should save and navigate to catlog page")
    public void priceShouldSaveAndNavigateToCatlogPage() {
        softAssert.assertEquals(home.Catalog_Url(), "http://transmission-dev.azurewebsites.net/catalog");
    }
    @And("price at grid updated with new value")
    public void priceAtGridUpdatedWithNewValue()
    {
        userClickOnItem();
        String expected_Price  =home.grid_Price().getText();
        System.out.println("expected result "+expected_Price);
        System.out.println("Actual result "+new_price);
        softAssert.assertTrue(expected_Price.contains(new_price));
        //softAssert.assertTrue(expected_Price.contains("Amr")); //to check fail



    }





}















