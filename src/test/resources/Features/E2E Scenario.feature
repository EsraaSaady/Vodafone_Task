Feature: Add Items to cart and remove them

  @E2E
  Scenario: Verify that the user can add, search for and delete user
    Given Login to page using "01000346077","Lenovo1#"
    And I add "2" to cart from home page
    And I search for product with name "iphone"
    And I add the product to cart
    Then I verify that numbers of items equals "3" in cart
    And I delete all items in cart
