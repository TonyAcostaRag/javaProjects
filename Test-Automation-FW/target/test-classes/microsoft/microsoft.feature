@microsoft
Feature: Microsoft - Search validation

  @TC1_SearchValidation
  Scenario: Microsoft page search validation
    Given Go to the microsoft page
    When I go to windows section
    And I go to search option
    And I search for "Xbox" 
    And I click on "Comprar" button
    And In the result page I click on the "Juegos"
    And Count the elements on the page
    And Go to the page "2"
    And Count the elements on the page
    And Go to the page "3"
    And Count the elements on the page
    And Print the sum of the elements
    And Print the titles of the elements
    And Go to the page "1"
    And Store the price of the first non-free option
    And Click on the fisrt non-free option 
    And Current price match with the first price
    And Click on the three dot button 
    And Add the item to the cart
    Then You have "0" elements available
    Then Message "Tu carro está vacío." is displayed


