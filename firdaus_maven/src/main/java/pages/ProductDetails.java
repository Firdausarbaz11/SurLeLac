package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basetest.BaseClass;
import basetest.TestUtiels;

public class ProductDetails extends BaseClass
{
	public WebDriver driver;
	
//	@FindBy( xpath = "//li[@productid='7744073236654']")
//	WebElement productcolor;
	
//	@FindBy( xpath = "//a[@class='product-buynowbutton fs_button']")
//	WebElement shopnow;
	
	@FindBy( xpath = "//label[contains(@title,'M')]")
	WebElement selectsize;
	
	@FindBy( xpath ="//button[@name=\"plus\"]")
	WebElement quantity;
	
	//@FindBy( xpath ="//div[@class='product-form__buttons abcd']")
	//@FindBy( xpath = "//product-form[@class='product-form']//button[@name='add']")
	@FindBy( xpath = "//button[@type='submit']")
	WebElement addtocart;
	
	@FindBy(id="cart-notification-button")
	WebElement viewmycart;
	
	@FindBy(id="checkout")
	WebElement checkout;
	
	@FindBy( xpath = "//details[@id='Details-collapsible-row-1-template--15566425686190__main']")
	WebElement scroll;
	
	
	public ProductDetails(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
	}
	
	
	
	
	 public boolean clickSelectSize()
		
		{
			boolean result = false;
			try 
			{
				explicitWait(selectsize);
				selectsize.click();
				TestUtiels.log().info("Clicked on size");
				result=true;
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
			
			
			return result;
			
		}
      
     public boolean clickQuantity()
		
		{
			boolean result = false;
			try 
			{
				explicitWait(quantity);
				quantity.click();
				TestUtiels.log().info("Clicked on quantity");
				result=true;
			}
			catch(Exception e)
			{
				System.out.println(e);
			
			}
			
			
			return result;
			
		}
     
     public boolean clickAddToCart()
		
		{
			boolean result = false;
			try 
			{
				explicitWait(addtocart);
				addtocart.click();
				TestUtiels.log().info("Clicked on add to cart");
				explicitWait(viewmycart);
				result=true;
			}
			catch(Exception e)
			{
				System.out.println(e);
				result=false;
			}
			
			return result;
			
		}	
     public boolean clickViewCart()
		
		{
			boolean result = false;
			try 
			{
				explicitWait(viewmycart);
				viewmycart.click();
				TestUtiels.log().info("Clicked on view my cart");
				result=true;
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
			
			return result;
			
		}
     
     public boolean clickCheckOut()
		
		{
			boolean result = false;
			try 
			{
				explicitWait(checkout);
				checkout.click();
				TestUtiels.log().info("Clicked on checkout");
				result=true;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			return result;
			
		}	
     
     public void clickScrollTo2()
   	{
   			JavascriptExecutor js = (JavascriptExecutor)driver;
   		   js.executeScript("arguments[0].scrollIntoView(true);", scroll);
   		   
   			
   	}

      
    

}


