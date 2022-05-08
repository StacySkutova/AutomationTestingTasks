Feature: Individual task scenario test

  Scenario: 01. Open main, scroll down/up, find Shop by category, click Cycle and Shop now, check empty basket between steps
    Given Main page opened
    When Scrolling down to find the text Shop By Category
    And Scrolling up to find the empty basket
    And Click link Cycle
    And Check and click button Shop now
    And Check Cycle Items Catalog Page opened and the basket is empty
    And Click on button Basket
    Then Basket page opened and empty
