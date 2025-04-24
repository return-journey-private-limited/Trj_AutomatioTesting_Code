package trjpom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RequestCallBackAndSubmitQuery {

    WebDriver driver;
    WebDriverWait wait;

    public RequestCallBackAndSubmitQuery(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    
    // SubmitQuery
    By ContactDropdown = By.xpath("//div[@class='group-hover:text-[#FF5900]']//*[name()='svg']");
    By SubmitQuery = By.xpath("//p[normalize-space()='Submit Query']");
    By Fname = By.id("fullName");
    By ContactNum = By.id("contactNumber");
    By Email = By.id("email");
    By Query = By.id("query");
    By clickSubmit = By.xpath("//button[@type='submit']");
    
    // RequestCallback
    By RequestCallBack = By.xpath("//p[normalize-space()='Request Callback']");
    By ContactNumber = By.xpath("//input[@id='contactNumber']");
    

    public void SubmitQuesyfillInvalidThenValidCredentials() throws InterruptedException {
        // Step 1: Click dropdown and Submit Query
    	Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(ContactDropdown)).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(SubmitQuery)).click();
        Thread.sleep(1000);

        // Step 2: Fill with invalid data
        wait.until(ExpectedConditions.visibilityOfElementLocated(Fname)).sendKeys("-12345Alok");
        driver.findElement(ContactNum).sendKeys("-1234567890");
        driver.findElement(Email).sendKeys("Alokmi2111997@gmail.com123456");
        driver.findElement(Query).sendKeys("Testing invalid form fill");
        Thread.sleep(3000);
        driver.findElement(clickSubmit).click();
        System.out.println("Submitted invalid data.");

        // Step 3: Refresh the page
        driver.navigate().refresh();
        System.out.println("Page refreshed after invalid submission.");

        // Step 4: Wait for form to reappear
        wait.until(ExpectedConditions.elementToBeClickable(ContactDropdown)).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(SubmitQuery)).click();
        Thread.sleep(1000);
        // Step 5: Fill with valid data
        wait.until(ExpectedConditions.visibilityOfElementLocated(Fname)).sendKeys("Alok Mishra");
        Thread.sleep(1000);
        driver.findElement(ContactNum).sendKeys("8932945274");
        Thread.sleep(1000);
        driver.findElement(Email).sendKeys("Alokmi2111997@gmail.com");
        driver.findElement(Query).sendKeys("The Return Journey");
        Thread.sleep(2000);
        driver.findElement(clickSubmit).click();
        
        System.out.println("Query Submitted Succesfully.");
        //System.out.println(driver.getPageSource());

        Thread.sleep(2000);
    }
    
    public void RequestCallBack() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(ContactDropdown).click();
    	Thread.sleep(2000);
    	driver.findElement(RequestCallBack ).click();
    	Thread.sleep(2000);
    	driver.findElement(ContactNumber).sendKeys("1234567890");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
    	Thread.sleep(5000);
    	
    	 WebElement  successPopupMessage = driver.findElement(By.xpath("//div[@class=\" pl-[16px] \"]"));
    	 System.out.println(successPopupMessage.getText());
    	   
    	
    }
}
