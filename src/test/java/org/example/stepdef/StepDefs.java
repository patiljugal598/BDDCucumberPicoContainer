/*
package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.constants.Endpoint;
import org.example.context.TestContext;
import org.example.objects.BillingDetails;
import org.example.objects.Product;
import org.example.pages.CartPage;
import org.example.pages.CheckoutPage;
import org.example.pages.OrderConfirmationPage;
import org.example.pages.StorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class StepDefs {
    WebDriver driver;
    BillingDetails billingDetails;

    public StepDefs(TestContext context){
        driver=context.driver;
    }
    @Given("I'm on the Store page")

    public void i_m_on_the_store_page() {
        new StorePage(driver).load(Endpoint.STORE.url);
    }

    @When("I add a {product} to the Cart")
    public void i_add_a_to_the_cart(Product product) throws InterruptedException {
        new StorePage(driver).addToCart(product.getProductName());
    }

    @Then("I see {int} {product} in the Cart")
    public void i_see_in_the_cart(Integer int1, Product product) {
        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getProductName(), product.getProductName());
        Assert.assertEquals(cartPage.getProductQuantity(product.getProductName()), int1);
    }

    @Given("I'm a guest customer")
    public void i_m_a_guest_customer() {
        new StorePage(driver).load(Endpoint.STORE.url);
    }

    @And("My billing details are")
    public void my_billing_details_are(BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
    }
    @And("I have a product in the cart")
    public void i_have_a_product_in_the_cart() {
        new StorePage(driver).addToCart("Blue Shoes");
    }

    @And("I'm on the Checkout Page")
    public void i_m_on_the_checkout_page() {
        new CartPage(driver).checkout();
    }

    @When("I provide billing details")
    public void i_provide_billing_details() {

        new CheckoutPage(driver).setBillingAddress(billingDetails);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("(//div[@class='blockUI blockOverlay'])[2]"))));

    }

    @And("I place an order")
    public void i_place_an_order() {
        new CheckoutPage(driver).placeOrder();
    }

    @Then("the order should be placed successfully")
    public void the_order_should_be_placed_successfully() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals(new OrderConfirmationPage(driver).getSuccessMsg(), "Thank you. Your order has been received.");
    }
}
*/
