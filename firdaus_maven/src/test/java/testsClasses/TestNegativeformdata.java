package testsClasses;

import org.testng.annotations.Test;

import basetest.BaseClass;
import pages.Negativeformdata;

public class TestNegativeformdata extends BaseClass

//ctrl+shift+c=testngcomment/uncomment short form

{
	@Test
	public void testnegativeformdata()
	{
		
		Negativeformdata nfd = new Negativeformdata(driver);
		nfd.clickToScroll();
		nfd.clickContinueShipping();
		
		nfd.getTheText();
		
	}
}
