package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//declaration
	@FindBy(xpath="//img[@alt=\"SkillRary\"]")
	private WebElement logo;
	@FindBy(xpath="//a[.=' GEARS ']")
	private WebElement gears;
	@FindBy(xpath="//input[@type=\"search\"]")
	private WebElement searchBar;
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement searchButton;
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']/descendant::a[.=' SkillRary Demo APP']")//have to check
	private WebElement skillraryDemoApp;
	
	//Initialization
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	
	public WebElement getLogo()
	{
		return logo;
	}
	public void searchFor(String data)
	{
		searchBar.sendKeys(data);
		searchButton.click();
	}
	public void clickGears()
	{
		gears.click();
	}
	public void clickSkillraryDemoApp()
	{
		skillraryDemoApp.click();
	}

}
