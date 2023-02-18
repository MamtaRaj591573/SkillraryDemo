package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class SecondTestScript extends BaseClass
{
	@Test
	public void secondTest()
	{
		SoftAssert soft=new SoftAssert();
		home.clickGears();
		home.clickSkillraryDemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillraryDemo.getPageHEader().isDisplayed());
		
		skillraryDemo.selectCategory(web, 1);
		soft.assertEquals(testing.getPageHeader(), "Testing");
		//web.dragAndDrop(testing.getSeleniumImage(), testing.getCartArea());
		testing.clickFacebookIcon();
		soft.assertAll();
	}
	
}
