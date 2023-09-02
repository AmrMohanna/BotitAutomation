package org.example.pages;

import io.cucumber.java.en.And;
import org.example.steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P02_Home {
    public String home_page() {
        String home_Url = Hooks.driver.getCurrentUrl();
        return home_Url;
    }

    public WebElement category_Path() {
        WebElement category = Hooks.driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/ul/li[1]/a"));
        return category;
    }
    public WebElement item()
    {
        WebElement item_Path =Hooks.driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[5]/div/section/div[2]/label[2]"));
        //WebElement item_Path =Hooks.driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/section[1]/div[2]/div[2]/div[2]/div[1]/a[1]"));
        //WebElement item_Path =Hooks.driver.findElement(By.cssSelector("div.section:nth-child(3) div.center div.content div.right-side div.container:nth-child(11) div.container-catalog:nth-child(15) section.tabs:nth-child(6) div:nth-child(2) > label.tab-label-2.wow"));
        return item_Path;
    }

    public String Catalog_Url() {
        String cat_Url = Hooks.driver.getCurrentUrl();
        return cat_Url;
    }
    public WebElement grid_Price()
    {
        WebElement price_Path = Hooks.driver.findElement
                (By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/section[1]/div[2]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[7]/td[5]/div[1]/h2[1]"));

        return price_Path;
    }
    public WebElement add_Item()
    {
        WebElement add_New_Item = Hooks.driver.findElement(By.className("add-new-item"));
        return add_New_Item;
    }



    public String item_Url() {

        String ite_Url = Hooks.driver.getCurrentUrl();
        return ite_Url;
    }
    public WebElement edit_Button()
    {
        WebElement edit_but=Hooks.driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/section[1]/div[2]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[7]/td[7]/div[1]/a[1]"));
        return edit_but;
    }
    public WebElement price_Text()
    {
        WebElement prict_tex=Hooks.driver.findElement(By.name("mainPrice"));
        return prict_tex;
    }
    public WebElement save_button()
    {
        WebElement save_but=Hooks.driver.findElement(By.className("exit-button"));
        return save_but;
    }
    public List find_product()
    {
        return Hooks.driver.findElements(By.name("tab2"));

    }
    public WebElement price_value()
    {
        WebElement price_Page=Hooks.driver.findElement
                (By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/section[1]/div[2]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[7]/td[5]/div[1]/h2[1]"));
        return price_Page;
    }

}