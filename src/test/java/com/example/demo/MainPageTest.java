package com.example.demo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MainPageTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/Users/gloriatamakloe/Desktop/Selenium zeug/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.mosbach.dhbw.de//");

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void search() {

        //Click cookie Box away

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       WebElement CookieButton = driver.findElement(By.className("cf2Lf6"));
       CookieButton.click();

       WebElement MenuField = driver.findElement(By.cssSelector("a[id='show-menu']"));
       MenuField.click();

       WebElement BachelorStudiengangLink = driver.findElement(By.cssSelector("a[href=\"/studium/studienangebot-bachelor/\"]"));
       BachelorStudiengangLink.click();

       WebElement OnlinemedienLink = driver.findElement(By.cssSelector("a[href=\"/studium/studienangebot-bachelor/medien-onlinemedien/\"]"));
       OnlinemedienLink.click();
    }


}
