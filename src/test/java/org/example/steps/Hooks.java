package org.example.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver =null;
    static SoftAssert softAssert =new SoftAssert();


    @Before
    public static void open_Browser()
    {
        System.setProperty("webdriver.chrome.drive","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");

        driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("http://transmission-dev.azurewebsites.net/login");
    }
    @After
    public static void quit_Driver() throws InterruptedException {
        softAssert.assertAll();
        Thread.sleep(3000);
        driver.quit();

    }
}
