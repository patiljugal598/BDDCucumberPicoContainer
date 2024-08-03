package org.example.pages;

import org.example.objects.BillingDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "billing_first_name") WebElement firstnameTxtBox;
    @FindBy(id="billing_last_name") WebElement lastnameTxtBox;
    @FindBy(id = "billing_address_1") WebElement addressLine1;
    @FindBy(id="billing_city") WebElement cityTxtBox;
    @FindBy(id="billing_postcode") WebElement zipTxtBox;
    @FindBy(id = "billing_email") WebElement emailTxtBox;
    @FindBy(id ="place_order") WebElement placeOrderButton;


    public void setBillingAddress(BillingDetails billingDetails){
        firstnameTxtBox.sendKeys(billingDetails.getFirstname());
        lastnameTxtBox.sendKeys(billingDetails.getLastname());
        addressLine1.sendKeys(billingDetails.getAddress_line1());
        cityTxtBox.sendKeys(billingDetails.getCity());
        zipTxtBox.sendKeys(billingDetails.getZip());
        emailTxtBox.sendKeys(billingDetails.getEmail());
    }

    public void placeOrder(){
        wait.until(ExpectedConditions.visibilityOf(placeOrderButton));
        placeOrderButton.click();
    }
}

