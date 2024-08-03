package org.example.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {
    public static WebDriver initialiseDriver(String browser){
        WebDriver driver = null;
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().cachePath("src/test/resources/drivers").setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().cachePath("src/test/resources/drivers").setup();
                driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }
}
