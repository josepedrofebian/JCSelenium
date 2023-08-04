package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {
    public static void main(String[] args) {
        String path = "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe";
        String webDriver = "webdriver.chrome.driver";
        System.setProperty(webDriver, path);
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://demoqa.com/text-box");
        System.out.println("Open Browser, Open URL");
        driver.manage().window().fullscreen();
        driver.findElement(By.id("userName")).sendKeys("JuaraCoding");
        driver.findElement(By.id("userEmail")).sendKeys("info@juaracoding.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        js.executeScript("window.scrollBy(0,500)"); //scroll vertical 500px
        driver.findElement(By.id("submit")).click();
        delay();
        driver.quit();
        System.out.println("Quit Browser");
    }

    static void delay(){
        try {
            Thread.sleep(1000); //Delay 3 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
