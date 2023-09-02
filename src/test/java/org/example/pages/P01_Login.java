package org.example.pages;

import org.example.steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Login {
    public WebElement user_Name_field()
    {
        WebElement user_Field=Hooks.driver.findElement(By.name("email"));
        return user_Field;

    }
    public WebElement password_Field()
    {
        WebElement password=Hooks.driver.findElement(By.name("password"));
        return password;


    }
    public WebElement login_button()
    {
       WebElement login= Hooks.driver.findElement(By.className("button-input"));
       return login;
    }
}
