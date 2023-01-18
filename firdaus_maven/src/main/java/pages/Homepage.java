package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basetest.BaseClass;
import basetest.TestUtiels;

public class Homepage extends BaseClass
{
	

	//page object model
	//Find all the elements
	//WebDriver driver = null;
	
	@FindBy( xpath = "//button[@tabindex='0']")
	WebElement popup;
	
	@FindBy( xpath = "//span[text()='Shop All']")
	WebElement shopall;
	
	@FindBy( xpath = "//a[@href='/pages/about']")
	WebElement about;
	
	@FindBy( xpath = "//span[text()='Lookbook']")
	WebElement lookbook;
	
	@FindBy( xpath = "//input[@id='Search-In-Modal-1']")
	WebElement searchbox;
	
	@FindBy( xpath = "//button[@class='search__button field__button']")
	WebElement searchicon; 
	
	@FindBy( xpath = "//a[contains(text(),' 101 T-shirt')]")
	WebElement firstproduct;	

	
	@FindBy( xpath = "//a[@href='/cart']")
	WebElement carticon;
	
	@FindBy( xpath = "//h1[@class='cart__empty-text']")
	WebElement textverify;
	
	@FindBy( xpath = "//a[@href='/products/101-t-shirt']")
	WebElement product;
	
	@FindBy( xpath ="//a[contains(text(), ' Swan Hoodie')]")
	WebElement scroll;
	
	

			public Homepage(WebDriver driver)
			{
				this.driver = driver;
				PageFactory.initElements(this.driver,this);
			}
//	
	//Perform the actions
	
			public boolean clickPopup()
			{
				boolean result = false;
				try
				{
					explicitWait(popup);
					popup.click();
					TestUtiels.log().info("Clicked on popup");
					result= true;
				}
				catch(Exception e )
				{
					System.out.println(e);
					result=false;
				}
				return result;
			}
			public boolean clickShopAll()
			
			{
				boolean result = false;
				try 
				{
					explicitWait(shopall);
					shopall.click();
					TestUtiels.log().info("Clicked on Shopall");
					result=true;
				}
				catch(Exception e)
				{
					System.out.println(e);
					result=false;
				}
				
				return result;
				
			}	
			
        public boolean clickAbout()
			
			{
				boolean result = false;
				try 
				{
					explicitWait(about);
					about.click();
					TestUtiels.log().info("Clicked on about");
					result=true;
				}
				catch(Exception e)
				{
					System.out.println(e);
					result=false;
				}
				
				return result;
				
			}	
        
        public boolean clickLookBook()
		
		{
			boolean result = false;
			try 
			{
				explicitWait(lookbook);
				lookbook.click();
				TestUtiels.log().info("Clicked on lookbook");
				result=true;
			}
			catch(Exception e)
			{
				System.out.println(e);
				result=false;
			}
			
			return result;
			
		}	
        
        public boolean clickSearchBox()
		
		{
			boolean result = false;
			try 
			{
				explicitWait(searchbox);
				searchbox.click();
				TestUtiels.log().info("Clicked on searchbox");
				result=true;
			}
			catch(Exception e)
			{
				System.out.println(e);
				result=false;
			}
			
			
			return result;
			
		}
        public boolean enterDataSearchBox()
		{
			boolean result = false;
			try 
			{
				searchbox.sendKeys("tshirt");
				searchicon.click();
				TestUtiels.log().info("Clicked on enterdata in searchbox");
				explicitWait(carticon);
				result = true;

			}
			catch(Exception e )
			{
				//System.out.println(e);
				result = false;
			}
			
			return result;
		}
		
        public boolean clickCartIcon()
		
		{
			boolean result = false;
			try 
			{
				explicitWait(carticon);
				carticon.click();
				TestUtiels.log().info("Clicked on carticon");
				result=true;
			}
			catch(Exception e)
			{
				System.out.println(e);
				result=false;
			}
			
			
			return result;
			
		}
        
        public String getTheText()
		
		{
			String emptyText = null;
			try 
			{
				explicitWait(textverify);
				emptyText=textverify.getText();
				
				
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
			
			
			return emptyText;
		}
		
        public boolean clickFirstProduct()
		
		{
			boolean result = false;
			try 
			{
				explicitWait(firstproduct);
				firstproduct.click();
				TestUtiels.log().info("Clicked on firstproduct");
				explicitWait(product);
				result = true;
			}
			catch(Exception e)
			{
				System.out.println(e);
				result=false;
			}
			
			
			return result;
			
		}
        public boolean clickProduct()
		
		{
			boolean result = false;
			try 
			{
				explicitWait(product);
				product.click();
				TestUtiels.log().info("Clicked on product");
				result=true;
			}
			catch(Exception e)
			{
				System.out.println(e);
				result=false;
			}
			
			
			return result;
			
		}
        
        public void clickToScroll()
		
		{
        	JavascriptExecutor js = (JavascriptExecutor)driver;
  		   js.executeScript("arguments[0].scrollIntoView(true);", scroll);
  		   
		}
        
        
       
        
      


}
