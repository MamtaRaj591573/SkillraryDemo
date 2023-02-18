package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage 
{
	//declaration
	@FindBy(xpath="//img[contains(@src,'contactus')]")
	private WebElement pageHeader;
	@FindBy(name="name")
	private WebElement fullName;
	@FindBy(name="sender")
	private WebElement emailTF;
	@FindBy(name="subject")
	private WebElement subjectTF;
	@FindBy(name="message")
	private WebElement messageTF;
	@FindBy(xpath="//button[text()='Send us mail']")
	private WebElement sendUsMailButton;
	
	//initialization
	public ContactUsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getPageHeader()
	{
		return pageHeader;
	}
	public void submitDetails(String name,String email,String subject,String message)
	{
		fullName.sendKeys(name);
		emailTF.sendKeys(email);
		subjectTF.sendKeys(subject);
		messageTF.sendKeys(message);
		sendUsMailButton.click();
	}

}