package org.example.stepdef;

import io.cucumber.java.en.Then;
import org.example.context.TestContext;
import org.example.pages.OrderConfirmationPage;
import org.example.pages.PageFactoryManager;
import org.testng.Assert;

public class OrderConfirmationPageStepDef {

    OrderConfirmationPage orderConfirmationPage;
    public OrderConfirmationPageStepDef(TestContext context){
        orderConfirmationPage= PageFactoryManager.getOrderConfirmationPage(context.driver);

    }

    @Then("the order should be placed successfully")
    public void the_order_should_be_placed_successfully() {
        Assert.assertEquals(orderConfirmationPage.getSuccessMsg(), "Thank you. Your order has been received.");
    }
}
