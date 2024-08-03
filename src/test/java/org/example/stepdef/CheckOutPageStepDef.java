package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.context.TestContext;
import org.example.objects.BillingDetails;
import org.example.pages.CheckoutPage;
import org.example.pages.PageFactoryManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckOutPageStepDef {
    WebDriver driver;
    TestContext context;

    CheckoutPage checkoutPage;
    public CheckOutPageStepDef(TestContext context){
        driver = context.driver;
        this.context = context;
        checkoutPage = PageFactoryManager.getCheckoutPage(context.driver);
    }

    @And("My billing details are")
    public void my_billing_details_are(BillingDetails billingDetails) {
        this.context.billingDetails = billingDetails;
    }

    @When("I provide billing details")
    public void i_provide_billing_details() {

        checkoutPage.setBillingAddress(context.billingDetails);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("(//div[@class='blockUI blockOverlay'])[2]"))));

    }

    @And("I place an order")
    public void i_place_an_order() {
        checkoutPage.placeOrder();
    }
}
