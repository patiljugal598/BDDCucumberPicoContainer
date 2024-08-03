@test
Feature: Place an order
  Scenario: using default payment option
    Given I'm a guest customer
    And My billing details are
      | firstname | lastname |  address_line1     | city  |  zip   | email                   |
      | Jugal     | Patil    |  6300 Spring Creek | Plano |  75024 | patiljugal598@gmail.com |
    And I have a product in the cart
    And I'm on the Checkout Page
    When I provide billing details
    And I place an order
    Then the order should be placed successfully