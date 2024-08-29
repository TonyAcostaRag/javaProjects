package microsoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;
import java.util.ArrayList;

import utilities.*;

public class Microsoft_Elements extends Utilities {
	
	public Microsoft_Elements (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='shellmenu_2']")
	protected WebElement windows_Link;
	
	@FindBy(xpath = "//button[@id='search']")
	protected WebElement search_Link;
	
	@FindBy(xpath = "//input[@id='cli_shellHeaderSearchInput']")
	protected WebElement search_box;
	
	@FindBy(xpath = "//header/a[1]")
	protected WebElement comprar_link;
	
	@FindBy(xpath = "//span[contains(text(),'Juegos')]")
	protected WebElement juegos_link;
	
	@FindBy(xpath = "//div[@class='c-group f-wrap-items context-list-page']")
	protected WebElement pageOne_divGroup;
	
	@FindBy(xpath = "//h3[@class='c-subheading-6']")
	protected WebElement page_titles;
	
	@FindBy(xpath = "//a[contains(text(),'1')]")
	protected WebElement pageOne_link;
	
	@FindBy(xpath = "//a[contains(text(),'2')]")
	protected WebElement pageTwo_link;
	
	@FindBy(xpath = "//a[text()='3']")
	protected WebElement pageThree_link;
	
	@FindBy(xpath = "//span[contains(text(), 'MXN')][@itemprop='price']")
	protected WebElement nonfree_items;
	
	@FindBy(xpath = "//button//span[@class='Price-module__srOnly___2mBg_']")
	protected WebElement comprar_Button;
	
	@FindBy(xpath = "//button[@class='ButtonWithFlyout-module__flyoutButton___3qzlA OverflowMenuButton-module__overflowMenuButton___1xxOX CommonButtonStyles-module__highContrastAwareButton___MWhXQ Button-module__basicBorderRadius___1zJi9 Button-module__defaultBase___2r-eQ Button-module__buttonBase___1vCmd Button-module__typePrimary___2kI0T Button-module__sizeMedium___2Wg1O Button-module__overlayModeSolid___Nv0Hx']")
	protected WebElement threeDot_Button;
	
	@FindBy(xpath = "//button[contains(text(), 'Agregar al carro')]")
	protected WebElement addToCart_Button;
	
	@FindBy(xpath = "//a[contains(text(), 'Abrir carro')]")
	protected WebElement openCart_Link;
	
	@FindBy(xpath = "//a[@id='uhf-shopping-cart']")
	protected WebElement cart_Link;
	
	@FindBy(xpath = "//span[contains(text(), 'Microsoft')][@itemprop='name']")
	protected WebElement ms_button;
	
	@FindBy(xpath = "//p[contains(text(), 'Tu carro está vacío.')]")
	protected WebElement emptyCart_message;
	
	
	public void clickOn_WindowsLink() {
		windows_Link.click();
	}
	
	public void clickOn_SearchLink() {
		search_Link.click();
	}
	
	public void write_SearchBox( String search ) {
		search_box.sendKeys(search);
		search_box.submit();
	}
	
	public void clickOn_ComprarLink() {
		comprar_link.click();
	}
	
	public void clickOn_JuegosLink() {
		juegos_link.click();
	}
	
	public int countingOptions() {
		List<WebElement> page_Options = pageOne_divGroup.findElements(By.className("m-channel-placement-item"));
		
		return page_Options.size();
	}
	
	public List<String> gettingTitles() {
		List<WebElement> pageTitles_List = page_titles.findElements(By.xpath("//h3[@class='c-subheading-6']"));
		List<String> pageTitles_List_String = new ArrayList<>();
		
		for(int i = 0; i < pageTitles_List.size(); i++) {
			pageTitles_List_String.add(pageTitles_List.get(i).getText());
		}
		
		return pageTitles_List_String;
	}
	
	public void clickOn_PageLink( String page ) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		if (Integer.parseInt(page) == 1) {
			pageOne_link.click();
		} else if (Integer.parseInt(page) == 2) {
			pageTwo_link.click();
		} else if (Integer.parseInt(page) == 3) {
			pageThree_link.click();
		}
			
	}

	public String lookingFor_FirstNonFreeItem() {
		List<WebElement> nonFree_ItemsList = nonfree_items.findElements(By.xpath("//div[@class='m-channel-placement-item']//div[@class='c-price']//span[@class='x-screen-reader'][contains(text(), 'MXN')]"));
		String firstPrice = "";
		
		firstPrice = nonFree_ItemsList.get(0).getText().toString();
		
		return firstPrice;
	}
	
	public String trimTextOnPrice(String priceWithText) {
		String onlyPrice = priceWithText;
		
		char [] priceWithText_Array = priceWithText.toCharArray();
		
		int startPrice_Index = 0;
		
		for (int i = 0; i < priceWithText_Array.length; i++ ) {
			
			if ( Character.compare(priceWithText_Array[i], 'M') == 0 &&
					Character.compare(priceWithText_Array[(i + 1)], 'X') == 0 ) {
				startPrice_Index = i;
				break;
			}
		}
		
		return onlyPrice.substring(startPrice_Index);
	}
	
	public void clickOn_specifiedNonFreeItem() {
		
		List<WebElement> nonFree_ItemsList = nonfree_items.findElements(By.xpath("//span[contains(text(), 'MXN')][@itemprop='price']")); 
		WebElement first_MonFreeItems = nonFree_ItemsList.get(0);
		
		
		first_MonFreeItems.click();
	}
	
	public String getCurrentPrice() {
		
		return comprar_Button.getText();
	}
	
	public void clickOn_ThreeDotButton() {
		threeDot_Button.click();
	}
	
	public void clickOn_AddItemToCart() {
		addToCart_Button.click();
	}
	
	public void clickOn_CartLink() {
		openCart_Link.click();
	}

	public int getTotalItemsOnCart() throws Throwable {
		
		
		cart_Link.click();
		Thread.sleep(1000);
		
		List<WebElement> OneItem_ElementList = cart_Link.findElements(By.xpath("//span[contains(text(), 'Artículos (1)')]"));
		
		
		return OneItem_ElementList.size();
	}

	public String getEmptyCart_Message() {
		return emptyCart_message.getText().toString();
	}

}
