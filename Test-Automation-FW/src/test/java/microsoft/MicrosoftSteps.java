package microsoft;

import java.util.List;
import java.util.ArrayList;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;

import utilities.*;

public class MicrosoftSteps extends Utilities{
	
	
	int options = 0;
	List<String> titles = new ArrayList<>();
	String firstPrice_PageOne = "";
	
	@After
	public void afterScenario(){
        stopDriver();
    }
	
	@Given("^Go to the microsoft page$")
	public void go_to_the_microsoft_page() throws Throwable {
		getDriver().get("https://www.microsoft.com/es-mx/");
		Thread.sleep(1000);
	}

	@When("^I go to windows section$")
	public void i_go_to_windows_section() throws Throwable {
		getMicrosoft_ElementsPage().clickOn_WindowsLink();
		Thread.sleep(1000);
	}

	@When("^I go to search option$")
	public void i_go_to_search_option() throws Throwable {
		getMicrosoft_ElementsPage().clickOn_SearchLink();
		Thread.sleep(1000);
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String search) throws Throwable {
		getMicrosoft_ElementsPage().write_SearchBox(search);
		Thread.sleep(1000);
	}

	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String arg1) throws Throwable {
		getMicrosoft_ElementsPage().clickOn_ComprarLink();
		Thread.sleep(1000);
	}

	@When("^In the result page I click on the \"([^\"]*)\"$")
	public void in_the_result_page_I_click_on_the(String arg1) throws Throwable {
		getMicrosoft_ElementsPage().clickOn_JuegosLink();
		Thread.sleep(1000);
	}

	@When("^Count the elements on the page$")
	public void count_the_elements_on_the_first_three_pages() throws Throwable {
		options += getMicrosoft_ElementsPage().countingOptions();
		titles.addAll(getMicrosoft_ElementsPage().gettingTitles());
	}
	
	@When("^Go to the page \"([^\"]*)\"$")
	public void print_the_sum_of_the_elements(String page) throws Throwable {
		getMicrosoft_ElementsPage().clickOn_PageLink(page);
		Thread.sleep(1000);
	}

	@When("^Print the sum of the elements$")
	public void print_the_sum_of_the_elements() throws Throwable {
		System.out.println("Sum of the elements on the Juegos page is: " + options);
	}

	@When("^Print the titles of the elements$")
	public void print_the_titles_of_the_elements() throws Throwable {
		
		System.out.println("Start printing the titles:\n");
		for (int i = 0; i < titles.size(); i++) {
			System.out.println((i + 1) + " - " + titles.get(i).toString());
		}
	}

	@When("^Store the price of the first non-free option$")
	public void store_the_price_of_the_first_non_free_option() throws Throwable {
		firstPrice_PageOne = getMicrosoft_ElementsPage().lookingFor_FirstNonFreeItem();
		System.out.println("\nThis is the first price: " + firstPrice_PageOne);
	}

	@When("^Click on the fisrt non-free option$")
	public void click_on_the_fisrt_non_free_option() throws Throwable {
		String Trimmed_textWithPrice = "";
		Trimmed_textWithPrice = getMicrosoft_ElementsPage().trimTextOnPrice(firstPrice_PageOne);
		Thread.sleep(2000);
		getMicrosoft_ElementsPage().clickOn_specifiedNonFreeItem();
		Thread.sleep(1000);
		firstPrice_PageOne = Trimmed_textWithPrice;
	}

	@When("^Current price match with the first price$")
	public void current_price_match_with_the_first_price() throws Throwable {
		
		String currentPrice = "";
		currentPrice = getMicrosoft_ElementsPage().getCurrentPrice();
		
		System.out.println("Current Price: " + currentPrice + 
				"\nFirst Price: " + firstPrice_PageOne);
		
		Assert.assertTrue(currentPrice.equals(firstPrice_PageOne),
				"Error. ---> Current and first prices are not equals\n" +
				"Current Price: " + currentPrice + 
				"\nFirst Price: " + firstPrice_PageOne);
	}

	@When("^Click on the three dot button$")
	public void click_on_the_three_dot_button() throws Throwable {
		getMicrosoft_ElementsPage().clickOn_ThreeDotButton();
		Thread.sleep(1000);
	}

	@When("^Add the item to the cart$")
	public void add_the_item_to_the_cart() throws Throwable {
		getMicrosoft_ElementsPage().clickOn_AddItemToCart();
		Thread.sleep(8000);
	}

	@Then("^You have \"([^\"]*)\" elements available$")
	public void you_have_elements_available(int expected_Items) throws Throwable {
		
		goBack();
		Thread.sleep(3000);
		
		int totalItems_OnCart = 0;
		totalItems_OnCart = getMicrosoft_ElementsPage().getTotalItemsOnCart();
		
		Assert.assertTrue(totalItems_OnCart == expected_Items, 
				"There is a mismatch on the elements expected on the Cart");
	}

	@Then("^Message \"([^\"]*)\" is displayed$")
	public void message_is_displayed(String message) throws Throwable {
		
		String displayed_message = "";
		displayed_message = getMicrosoft_ElementsPage().getEmptyCart_Message();
		
		System.out.println("Expected: " + message +
				"\ndisplayed: " + displayed_message);
		
		Assert.assertTrue(message.equals(displayed_message), 
				"Error. ---> Cart message is different than expected" +
		"\nDisplayed message: " + displayed_message);

	}

}
