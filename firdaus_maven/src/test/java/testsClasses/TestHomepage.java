package testsClasses;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import basetest.BaseClass;
import pages.Homepage;
import pages.Informationfill;
import pages.ProductDetails;
//@Listeners(listeners.TestNGListeners.class)
@Listeners(basetest.Listener.class)


public class TestHomepage extends BaseClass
{
	@Test(description="Test_Case") //for report generate
	public void testhomepage()
	{
//		openBrowser();
		//WebDriver driver;
		Homepage h = new Homepage(driver);
		h.clickPopup();
		
		boolean isclickShopAll = h.clickShopAll();
		Assert.assertEquals(isclickShopAll, true,"Failed to click shop all");
		
		boolean isclickAbout = h.clickAbout();
		Assert.assertEquals(isclickAbout, true,"Failed to click about");
		
//		boolean isclickLookBook = h.clickLookBook();
//		Assert.assertEquals(isclickLookBook, true,"Failed to click lookbook");
		
		boolean isclickCartIcon = h.clickCartIcon();
		Assert.assertEquals(isclickCartIcon, true,"Failed to click cart icon");
		
		String isgetTheText = h.getTheText();
		System.out.println(isgetTheText);
		boolean result=false;
		if(isgetTheText.contains("EMPTY"))
		{
			result=true;
			
		}else{
			result=false;
		}
		
		Assert.assertEquals(result, true,"empty cart is not visible");

		backto();
		boolean isclickSearchBox = h.clickSearchBox();
		Assert.assertEquals(isclickSearchBox, true,"Failed to click search box");
		
		boolean isenterDataSearchBox = h.enterDataSearchBox();
		Assert.assertEquals(isenterDataSearchBox, true,"Failed to enterd data search box");
		
//		h.clickToScroll();
		
//		boolean isclickFirstProduct = h.clickFirstProduct();
//		Assert.assertEquals(isclickFirstProduct, true,"Failed to click on first product");
		
	
		h.clickShopAll();

		boolean isclickProduct = h.clickProduct();
		Assert.assertEquals(isclickProduct, true,"Failed to click on product");
		
		ProductDetails pd = new ProductDetails(driver);
		
		boolean isclickSelectSize =pd.clickSelectSize();
		Assert.assertEquals(isclickSelectSize, true,"Failed to click select size");

		boolean isclickQuantity = pd.clickQuantity();
		Assert.assertEquals(isclickQuantity, true,"Failed to click quantity");
		
		
		pd.clickScrollTo2();
		boolean isclickAddToCart = pd.clickAddToCart();
		Assert.assertEquals(isclickAddToCart, true,"Failed to click add to cart");

		boolean isclickViewCart = pd.clickViewCart();
		Assert.assertEquals(isclickViewCart, true,"Failed to click view my cart");

		boolean isclickCheckOut = pd.clickCheckOut();
		Assert.assertEquals(isclickCheckOut, true,"Failed to click check out");
		
		Informationfill i = new Informationfill(driver);

		
//		 boolean isClickHandlePopup = i.clickHanlePopup();
//		 Assert.assertEquals(isClickHandlePopup, true, "Failed to click popup beforeEmail");
		boolean isclickEmail = i.clickEmail();
		Assert.assertEquals(isclickEmail, true,"Failed to click email");
		
//		 boolean isClickHandlePopup1 = i.clickHanlePopup();
//		 Assert.assertEquals(isClickHandlePopup1, true, "Failed to click popup beforeDropdown");
		boolean isclickDropDown = i.clickDropDown();
		Assert.assertEquals(isclickDropDown, true,"Failed to click drop down");
		
//		 boolean isClickHandlePopup2 = i.clickHanlePopup();
//		 Assert.assertEquals(isClickHandlePopup2, true, "Failed to click popup beforelastName");
		boolean isclickLastName = i.clickLastName();
		Assert.assertEquals(isclickLastName, true,"Failed to click last name");
		
//		 boolean isClickHandlePopup3 = i.clickHanlePopup();
//		 Assert.assertEquals(isClickHandlePopup3, true, "Failed to click popup beforeAddress");
		boolean isclickAddress = i.clickAddress();
		Assert.assertEquals(isclickAddress, true,"Failed to click address");
		
		i.clickScrollTo1();
		
//		 boolean isClickHandlePopup4 = i.clickHanlePopup();
//		 Assert.assertEquals(isClickHandlePopup4, true, "Failed to click popup beforeCity");
		boolean isclickCity = i.clickCity();
		Assert.assertEquals(isclickCity, true,"Failed to click city");
		
//		 boolean isClickHandlePopup5 = i.clickHanlePopup();
//		 Assert.assertEquals(isClickHandlePopup5, true, "Failed to click popup beforePostcode");
		boolean isclickPostCode= i.clickPostCode();
		Assert.assertEquals(isclickPostCode, true,"Failed to click post code");
		
//		 boolean isClickHandlePopup6 = i.clickHanlePopup();
//		 Assert.assertEquals(isClickHandlePopup6, true, "Failed to click popup beforeContShip");
		boolean isclickContinueShipping = i.clickContinueShipping();
		Assert.assertEquals(isclickContinueShipping, true,"Failed to click continue to shipping");
		
		boolean isclickOnLog = i.clickOnLogo();
		Assert.assertEquals(isclickOnLog, true,"Failed to click on logo to return homepage");
		
		
		browserClose();


	
		//h.clickAbout();
		//browserClose();
//		BaseClass bs = new BaseClass();
//		browserClose();
	}

}
