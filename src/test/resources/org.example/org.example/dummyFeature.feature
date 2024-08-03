@test
Feature: Add to cart

  Rule: Add from store
    Scenario Outline: Add one quantity to the cart
      Given I'm on the Store page
      When I add a "<product_name>" to the Cart
      Then I see <quantity> "<product_name>" in the Cart
      Examples:
        | product_name      | quantity |
        | Blue Shoes        | 1        |
        | Blue Denim Shorts | 1        |
