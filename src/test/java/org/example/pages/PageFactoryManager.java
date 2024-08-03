package org.example.pages;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {

    private static CartPage cartPage;
    private static CheckoutPage checkoutPage;
    private static OrderConfirmationPage orderConfirmationPage;
    private static StorePage storePage;

    public static CartPage getCartPage(WebDriver driver) {
        return cartPage == null ? new CartPage(driver) : cartPage;
    }

    public static CheckoutPage getCheckoutPage(WebDriver driver) {
        return checkoutPage == null ? new CheckoutPage(driver) : checkoutPage;
    }

    public static OrderConfirmationPage getOrderConfirmationPage(WebDriver driver) {
        return orderConfirmationPage == null ? new OrderConfirmationPage(driver) : orderConfirmationPage;
    }

    public static StorePage getStorePage(WebDriver driver) {
        return storePage == null ? new StorePage(driver) : storePage;
    }
}
