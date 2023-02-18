package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SeleniumTrainingPage
{
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	@FindBy(id="add")
	private WebElement add;
	@FindBy(xpath=" //button[contains(text(),'Add to Cart')]")
	private WebElement addToCart;
	@FindBy(xpath="")
	private WebElement itemAddedMessage;
	
	public SeleniumTrainingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public String getPageHEader()
	{
		return pageHeader.getText();
	}
	public void doubleClickPlusButton(WebDriverUtility web)
	{
		web.doubleClickOnElement(add);
	}
	public void clickToCart()
	{
		addToCart.click();
	}
	public WebElement getItemAddedMessage()
	{
		return itemAddedMessage;
	}

}
