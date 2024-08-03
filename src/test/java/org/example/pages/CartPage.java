package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//td[@class='product-name']/a") WebElement productName;
    @FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]") WebElement checkOutButton;
    public String getProductName(){
        return productName.getText().trim();
    }

    public int getProductQuantity(String productName){
        By productQty = By.xpath("//label[contains(text(),'"+productName+"')]//following-sibling::input");
        return Integer.parseInt(driver.findElement(productQty).getAttribute("value"));
    }

    public void checkout(){
        checkOutButton.click();
    }
}
