package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.example.context.TestContext;
import org.example.factory.DriverFactory;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Hooks {
    private WebDriver driver;
    private final TestContext context;
    public Hooks(TestContext context){
        this.context = context;
    }
    @Before
    public void before(Scenario scenario){
        System.out.println("Before Scenario Name:: " + scenario.getName()  +"   Thread Id :: "+Thread.currentThread().getId());
        driver = DriverFactory.initialiseDriver(System.getProperty("browser","chrome"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        context.driver = driver;
    }

    @After
    public void after(Scenario scenario){
        driver.quit();
        System.out.println("After Scenario Name:: " + scenario.getName()  +"   Thread Id :: "+Thread.currentThread().getId());
    }
}
