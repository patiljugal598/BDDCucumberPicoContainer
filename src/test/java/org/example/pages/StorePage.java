package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage{
    public StorePage(WebDriver driver) {
        super(driver);
    }

    public void addToCart(String productName){
        By addToCartButton = By.xpath("//a[@aria-label=\"Add “"+productName+"” to your cart\"]");
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();

        By viewCartLink = By.xpath("//a[@aria-label=\"Add “"+productName+"” to your cart\"]//following-sibling::a");
        wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();
    }

}
