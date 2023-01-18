package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basetest.BaseClass;
import basetest.TestUtiels;

public class Negativeformdata extends BaseClass



{
	static String email;
	static String textfield;
	static String address;
	static String city;
	static String code;


	
	
	
	@FindBy( xpath = "//button[@class='_2pOWh uWTUp _1Kqoj _2tVwl _3MrgP _10zXD sd4hU']")
	WebElement conttoshiping;
	
	@FindBy( xpath = "//p[@id='error-for-email']")
	WebElement emailerror;
	
	
	@FindBy( xpath = "//p[@id='error-for-TextField1']")
	WebElement textfielderror;
	
	@FindBy( xpath = "//p[@id='error-for-address1']")
	WebElement addresserror;

	@FindBy( xpath = "//p[@id='error-for-TextField4']")
	WebElement cityfielderror;

	@FindBy( xpath = "//p[@id='error-for-TextField5']")
	WebElement codefielderror;

	




	public Negativeformdata(WebDriver driver)

	{
	this.driver = driver;
	PageFactory.initElements(this.driver,this);
	
	}
	
	public void clickToScroll()
	
	{
    	JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeScript("arguments[0].scrollIntoView(true);",conttoshiping );
		   
		   
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
	
	public void getTheText()
	
	{
		
		
		try 
		{
			//explicitWait(emailerror);
			email=emailerror.getText();
			System.out.println(email);
			
			textfield=textfielderror.getText();
			System.out.println(textfield);
			
			address=addresserror.getText();
			System.out.println(address);
			
			city=cityfielderror.getText();
			System.out.println(city);
			
			code=codefielderror.getText();
			System.out.println(code);
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		
	}


	
	

}



