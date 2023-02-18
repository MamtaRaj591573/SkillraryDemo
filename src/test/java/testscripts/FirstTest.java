package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FirstTest extends BaseClass
{
	@Test
	public void firstTest()
	{
		SoftAssert soft=new SoftAssert();
		home.clickGears();
		home.clickSkillraryDemoApp();
		web.handleChildBrowser();
		
		
		soft.assertTrue(skillraryDemo.getPageHEader().isDisplayed());
		skillraryDemo.mouseHoverToCourse(web);
		skillraryDemo.clickSeleniumTraining();
		
		soft.assertEquals(selenium.getPageHEader(),"Selenium Training");
		selenium.doubleClickPlusButton(web);
		selenium.clickToCart();
		web.handleAlert();
		web.explicitWait(time, selenium.getItemAddedMessage());
		web.takeScreenshot();
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		
		selenium.getItemAddedMessage();
		soft.assertAll();
		
	}

}
