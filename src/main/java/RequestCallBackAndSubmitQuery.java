

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RequestCallBackAndSubmitQuery {
	  WebDriver driver;
	    WebDriverWait wait;

	    public RequestCallBackAndSubmitQuery(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }
	    
	    By HimachalPradesh = By.xpath("//img[@alt='Himachal Pradesh']");
	    By JammuAndKashmir = By.xpath("//img[@alt='Jammu & Kashmir']");
	    By Goa = By.xpath("//img[@alt='Goa']");
	    By Kerala = By.xpath("//img[@alt='Kerala']");
	    By Rajasthan = By.xpath("//img[@alt='Rajasthan']");
	    By CompanyAboutUs = By.xpath("//span[normalize-space()='About us']");
	    By CompanyPrivacyPolicy = By.xpath("//span[normalize-space()='Privacy Policy']");
	    
	    public void FiveAreas() throws InterruptedException {
	    	driver.findElement(HimachalPradesh).click();
	    	driver.navigate().back();
	    	Thread.sleep(2000);
	    	driver.findElement(JammuAndKashmir).click();
	    	driver.navigate().back();
	    	Thread.sleep(2000);
	    	driver.findElement(Goa).click();
	    	driver.navigate().back();
	    	Thread.sleep(2000);
	    	driver.findElement(Kerala).click();
	    	driver.navigate().back();
	    	Thread.sleep(2000);
	    	driver.findElement(Rajasthan).click();
	    	driver.navigate().back();	
	    }
	 
	    

}
