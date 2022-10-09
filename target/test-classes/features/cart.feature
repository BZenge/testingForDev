Feature: cart

  @wip
  Scenario: Add product to cart
    Given I navigate to url
    When I click on category tshirts
    Then I successfully land on the product list page
    When I change the product view
    And I click on add to cart button
    Then I successfully received the added to cart pop up