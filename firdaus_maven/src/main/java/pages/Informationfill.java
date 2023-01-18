package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basetest.BaseClass;
import basetest.TestUtiels;

public class Informationfill extends BaseClass

{
	@FindBy( xpath = "//input[@name='email']")
	WebElement email ;
	
	@FindBy( xpath = "//select[@name='countryCode']")
	WebElement dropdown;
	
//	@FindBy( xpath ="//p[text()='All rights reserved Sur Le Lac']")
//	@FindBy(xpath="//div[@id='SandboxContainer']")
//	@FindBy(xpath="//div[@id='app']")
	@FindBy(xpath="//body[@style='background-color: rgb(255, 255, 255);']")
	WebElement handlepopup;
	//div[@class='hCees _3RAR3']
	//body[@style='background-color: rgb(255, 255, 255);']
	
	@FindBy( id="address1")
	WebElement address;
	
	@FindBy( xpath = "//input[@name='lastName']")
//	@FindBy(xpath="//input[@id='TextField14']")
	WebElement lastname;
	
	@FindBy( xpath = "//input[@name='city']")
	WebElement city;
	
	@FindBy( xpath = "//input[@name='postalCode']")
	WebElement postcode;
	
	//@FindBy( xpath = "//button[@type='submit']")
	@FindBy( xpath = "//button[@class='_2pOWh uWTUp _1Kqoj _2tVwl _3MrgP _10zXD sd4hU']")
	WebElement conttoshiping;
	
//	@FindBy( xpath = "//button[@type='submit']")
//	WebElement scrlelement;
	
	
	@FindBy( xpath = "//a[@href='https://surlelac.co/']")
	WebElement logo;
	
	
	public Informationfill(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
	}
	
	 public boolean clickEmail()
		
		{
			boolean result = false;
			try 
			{
				explicitWait(email);
				email.click();
				TestUtiels.log().info("Clicked on email");
				email.sendKeys(TestUtiels.getPropertiesData("email"));
				result=true;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			return result;
		}

  public boolean clickDropDown()
		
		{
			boolean result = false;
			try 
			{
				explicitWait(dropdown);
				dropdown.click();
				TestUtiels.log().info("Clicked on dropdown");
				Select sc = new Select(dropdown);
				sc.selectByVisibleText("United Kingdom");
				result=true;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			return result;
		}
  
  public boolean clickHanlePopup()
		
		{
	  		boolean result = false;
			try 
			{
//				explicitWait(handlepopup);
				handlepopup.click();
				System.out.println("popupHandled_Clicked");
//				TestUtiels.log().info("Clicked on popup");
				result = true;
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
			return result;
		}
  	
  	public boolean clickAddress()
  	{
  		boolean result= false;
  		try
  		{
  			explicitWait(address);
  			address.click();
  			address.sendKeys(TestUtiels.getPropertiesData("address"));

				TestUtiels.log().info("Clicked on address");
  			
  			result=true;
  		}
  		catch(Exception e)
  		{
  			System.out.println(e);
				

  		}
  		return result;
  	}
  	
  	public boolean clickLastName()
  	{
  		boolean result= false;
  		try
  		{
  			explicitWait(lastname);
  			lastname.click();
  			lastname.sendKeys(TestUtiels.getPropertiesData("lastname"));

				TestUtiels.log().info("Clicked on lastname");
  			
  			result=true;
  		}
  		catch(Exception e)
  		{
  			System.out.println(e);


  		}
  		return result;
  	}
  	
  	

  	
  	public boolean clickCity()
  	{
  		boolean result= false;
  		try
  		{
  			explicitWait(city);
  			city.click();
  			city.sendKeys(TestUtiels.getPropertiesData("city"));

				TestUtiels.log().info("Clicked on city");
  			
  			result=true;
  		}
  		catch(Exception e)
  		{
  			System.out.println(e);


  		}
  		return result;
  	}
  	
  	public boolean clickPostCode()
  	{
  		boolean result= false;
  		try
  		{
  			explicitWait(postcode);
  			postcode.click();
  			postcode.sendKeys(TestUtiels.getPropertiesData("postcode"));

				TestUtiels.log().info("Clicked on postcode");
  			
  			result=true;
  		}
  		catch(Exception e)
  		{
  			System.out.println(e);
				

  		}
  		return result;
  	}
  	
  	public boolean clickContinueShipping()
  	{
  		boolean result= false;
  		try
  		{
  			explicitWait(conttoshiping);
  			conttoshiping.click();

				TestUtiels.log().info("Clicked on continue to shipping");
  			
  			result=true;
  		}
  		catch(Exception e)
  		{
  			System.out.println(e);
		

  		}
  		return result;
  	}

  	public void clickScrollTo1()
  	{
  			JavascriptExecutor js = (JavascriptExecutor)driver;
  		   js.executeScript("arguments[0].scrollIntoView(true);", conttoshiping);
  		   
  			
  	}
  	
  	
  	public boolean clickOnLogo()
  	{
  		boolean result= false;
  		try
  		{
  			explicitWait(logo);
  			logo.click();

				TestUtiels.log().info("Clicked on logo to retune homepage");
  			
  			result=true;
  		}
  		catch(Exception e)
  		{
  			System.out.println(e);
		

  		}
  		return result;
  	}

  	
  	

	
}
