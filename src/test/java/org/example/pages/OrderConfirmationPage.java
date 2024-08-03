package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage extends BasePage{
    public OrderConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p[text()='Thank you. Your order has been received.']") WebElement successMsg;

    public String getSuccessMsg(){
        return successMsg.getText().trim();
    }
}
