$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("microsoft.feature");
formatter.feature({
  "line": 2,
  "name": "Microsoft - Search validation",
  "description": "",
  "id": "microsoft---search-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@microsoft"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Microsoft page search validation",
  "description": "",
  "id": "microsoft---search-validation;microsoft-page-search-validation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC1_SearchValidation"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Go to the microsoft page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I go to windows section",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I go to search option",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I search for \"Xbox\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Comprar\" button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "In the result page I click on the \"Juegos\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Count the elements on the page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Go to the page \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Count the elements on the page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Go to the page \"3\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Count the elements on the page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Print the sum of the elements",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Print the titles of the elements",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Go to the page \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Store the price of the first non-free option",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Click on the fisrt non-free option",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Current price match with the first price",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Click on the three dot button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Add the item to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "You have \"0\" elements available",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Message \"Tu carro está vacío.\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MicrosoftSteps.go_to_the_microsoft_page()"
});
formatter.result({
  "duration": 20531298300,
  "status": "passed"
});
formatter.match({
  "location": "MicrosoftSteps.i_go_to_windows_section()"
});
formatter.result({
  "duration": 13227424800,
  "status": "passed"
});
formatter.match({
  "location": "MicrosoftSteps.i_go_to_search_option()"
});
formatter.result({
  "duration": 1168578000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Xbox",
      "offset": 14
    }
  ],
  "location": "MicrosoftSteps.i_search_for(String)"
});
formatter.result({
  "duration": 14217945300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Comprar",
      "offset": 12
    }
  ],
  "location": "MicrosoftSteps.i_click_on_button(String)"
});
formatter.result({
  "duration": 38105292600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Juegos",
      "offset": 35
    }
  ],
  "location": "MicrosoftSteps.in_the_result_page_I_click_on_the(String)"
});
formatter.result({
  "duration": 29701265100,
  "status": "passed"
});
formatter.match({
  "location": "MicrosoftSteps.count_the_elements_on_the_first_three_pages()"
});
formatter.result({
  "duration": 4379587400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 16
    }
  ],
  "location": "MicrosoftSteps.print_the_sum_of_the_elements(String)"
});
formatter.result({
  "duration": 18360148100,
  "status": "passed"
});
formatter.match({
  "location": "MicrosoftSteps.count_the_elements_on_the_first_three_pages()"
});
formatter.result({
  "duration": 3091803400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 16
    }
  ],
  "location": "MicrosoftSteps.print_the_sum_of_the_elements(String)"
});
formatter.result({
  "duration": 22307342700,
  "status": "passed"
});
formatter.match({
  "location": "MicrosoftSteps.count_the_elements_on_the_first_three_pages()"
});
formatter.result({
  "duration": 2997582700,
  "status": "passed"
});
formatter.match({
  "location": "MicrosoftSteps.print_the_sum_of_the_elements()"
});
formatter.result({
  "duration": 201700,
  "status": "passed"
});
formatter.match({
  "location": "MicrosoftSteps.print_the_titles_of_the_elements()"
});
formatter.result({
  "duration": 6793500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 16
    }
  ],
  "location": "MicrosoftSteps.print_the_sum_of_the_elements(String)"
});
formatter.result({
  "duration": 14112630100,
  "status": "passed"
});
formatter.match({
  "location": "MicrosoftSteps.store_the_price_of_the_first_non_free_option()"
});
formatter.result({
  "duration": 118245600,
  "status": "passed"
});
formatter.match({
  "location": "MicrosoftSteps.click_on_the_fisrt_non_free_option()"
});
formatter.result({
  "duration": 22135170100,
  "status": "passed"
});
formatter.match({
  "location": "MicrosoftSteps.current_price_match_with_the_first_price()"
});
formatter.result({
  "duration": 63673800,
  "status": "passed"
});
formatter.match({
  "location": "MicrosoftSteps.click_on_the_three_dot_button()"
});
formatter.result({
  "duration": 1155060100,
  "status": "passed"
});
formatter.match({
  "location": "MicrosoftSteps.add_the_item_to_the_cart()"
});
formatter.result({
  "duration": 8128251500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 10
    }
  ],
  "location": "MicrosoftSteps.you_have_elements_available(int)"
});
formatter.result({
  "duration": 43889268700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tu carro está vacío.",
      "offset": 9
    }
  ],
  "location": "MicrosoftSteps.message_is_displayed(String)"
});
formatter.result({
  "duration": 90267100,
  "status": "passed"
});
formatter.after({
  "duration": 2498055200,
  "status": "passed"
});
});