package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.constants.Endpoint;
import org.example.context.TestContext;
import org.example.objects.Product;
import org.example.pages.PageFactoryManager;
import org.example.pages.StorePage;
import org.openqa.selenium.WebDriver;

public class StoreStepDef {

    StorePage storePage;
    public StoreStepDef(TestContext context){
        storePage = PageFactoryManager.getStorePage(context.driver);
    }
    @Given("I'm on the Store page")

    public void i_m_on_the_store_page() {
        storePage.load(Endpoint.STORE.url);
    }

    @When("I add a {product} to the Cart")
    public void i_add_a_to_the_cart(Product product) throws InterruptedException {
        storePage.addToCart(product.getProductName());
    }

    @And("I have a product in the cart")
    public void i_have_a_product_in_the_cart() throws InterruptedException {
        storePage.addToCart("Blue Shoes");
    }

    @Given("I'm a guest customer")
    public void i_m_a_guest_customer() {
        storePage.load(Endpoint.STORE.url);
    }
}
