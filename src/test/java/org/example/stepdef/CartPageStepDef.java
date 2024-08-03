package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.context.TestContext;
import org.example.objects.Product;
import org.example.pages.CartPage;
import org.example.pages.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPageStepDef {

    CartPage cartPage;
    public CartPageStepDef(TestContext context){
        cartPage = PageFactoryManager.getCartPage(context.driver);
    }

    @Then("I see {int} {product} in the Cart")
    public void i_see_in_the_cart(Integer int1, Product product) {
        Assert.assertEquals(cartPage.getProductName(), product.getProductName());
        Assert.assertEquals(cartPage.getProductQuantity(product.getProductName()), int1);
    }

    @And("I'm on the Checkout Page")
    public void i_m_on_the_checkout_page() {
        cartPage.checkout();
    }
}
