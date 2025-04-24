package trjpom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationFlow {
	 WebDriver driver;

	    public RegistrationFlow (WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    // Locators 
	    By RegistrationClick = By.xpath("(//button[normalize-space()='Register Now'])[1]");
	    By FirstName = By.xpath("(//input[@id='firstName'])[1]");
	    By lastName = By.xpath("//input[@id=\"lastName\"]");
	    
	    By Email = By.xpath("//input[@id=\"Email\"]");
	    By GetEmailOTP= By.xpath("(//button[normalize-space()='Get OTP'])[1]");
	    By FillEmailOTP = By.xpath("//input[@id=\"emailOtp\"]");
	    By VerifyEmail= By.xpath("(//div[@class=\"flex items-end mb-[2px]\"])[1]");
	    
	    By MobileNum = By.xpath("//input[@id=\"contactNumber\"]");
	    By GetMobileOTP= By.xpath("(//button[@class='absolute right-2 top-[50%] translate-y-[-50%] text-[#82858D] text-[14px] border-l-1 border-gray-400 p-3 flex justify-center items-center h-[39px] font-[600] text-orange-primary cursor-pointer'])[1]");
	    By fillMobileOTP = By.xpath("//input[@id=\"mobileOtp\"]");
	    By MobileNumVerify = By.xpath("(//div[@class=\"flex items-end mb-[2px]\"])[2]");
	    
	    By GenderMale = By.xpath("(//input[@type=\"radio\"])[1]");
	    By Designation = By.xpath("//input[@id=\"designation\"]");
	    By Continue = By.xpath("(//button[normalize-space()='Continue'])[1]");
	    
	    By CompanyType = By.xpath("//input[@id='Proprietor']");
	    By CompanyName = By.xpath("//input[@id='firstName']");
	    By PanNumber = By.xpath("//input[@id='panNumber']");
	    
	    
	   
	    public void ValidBasicDetails() throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	
	    	driver.findElement( RegistrationClick).click();
	    	driver.findElement( FirstName).sendKeys("Alok");
	    	driver.findElement(lastName).sendKeys("Mishra");
	    	driver.findElement(Email).sendKeys("Alokmi2111997@gmail.com");
	    	driver.findElement(GetEmailOTP).click();
	    	Thread.sleep(10000);
	    	driver.findElement(FillEmailOTP).sendKeys("");
	    	Thread.sleep(10000);
	    	driver.findElement(VerifyEmail).click();
	    	Thread.sleep(2000);
	    	driver.findElement(MobileNum).sendKeys("8932945274");
	    	
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    	wait.until(ExpectedConditions.elementToBeClickable(GetMobileOTP)).click();
	    	Thread.sleep(2000);
	    	driver.findElement(fillMobileOTP).sendKeys("1234");
	    	Thread.sleep(1000);
	    	driver.findElement(MobileNumVerify).click();
	    	driver.findElement(GenderMale).click();
	    	driver.findElement(Designation).sendKeys("SDET");
	    	Thread.sleep(1000);
	    	JavascriptExecutor js1 =(JavascriptExecutor)driver;
	        js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    	System.out.println(js1.executeScript("return window.pageYOffset;"));
	    	Thread.sleep(1000);
	        driver.findElement(Continue).click();
	    }
	    
	    public void CompanyDetails() throws InterruptedException {
	        String logoPath = "C:\\Users\\AlokMishra\\Desktop\\TRJPOM\\src\\test\\resources\\Images\\QR.png";
	        String panPath = "C:\\Users\\AlokMishra\\Desktop\\TRJPOM\\src\\test\\resources\\Images\\QR.png";

	        WebElement logoInput = driver.findElement(By.id("file-upload"));
	        logoInput.sendKeys(logoPath);
	        Thread.sleep(2000);

	        driver.findElement(CompanyType).click();      
	        driver.findElement(CompanyName).sendKeys("The Return Journey");
	        driver.findElement(PanNumber).sendKeys("IGGPM6459H");

	        WebElement panInput = driver.findElement(By.id("panUpload"));

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].style.display = 'block';", panInput);

	        panInput.sendKeys(panPath);
	        Thread.sleep(2000);
	        JavascriptExecutor aa = (JavascriptExecutor) driver;
	        aa.executeScript("window.scrollBy(0, 800)");
	        
	        driver.findElement(By.id("gstIN")).sendKeys("09IGGPM6459H1ZB");
	        Thread.sleep(2000);
	        
	        
	        driver.findElement(By.xpath("//div[contains(@class,'mt-4 flex gap-4')]//div[1]//input[1]")).sendKeys("123");
	        driver.findElement(By.xpath("//input[@placeholder=\"City Name\"]")).sendKeys("abcfghj");
	        driver.findElement(By.xpath("//input[@placeholder=\"State Name\"]")).sendKeys("456789");
	        
	        driver.findElement(By.id("Owned")).click();
	        
	        WebElement AdharUpload = driver.findElement(By.id("addressProof"));
	        String AadharCard = "C:\\Users\\AlokMishra\\Desktop\\TRJPOM\\src\\test\\resources\\Images\\QR.png";
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js1.executeScript("arguments[0].style.display = 'block';", AdharUpload);
	        AdharUpload.sendKeys(AadharCard);
	        Thread.sleep(2000);
	        
	        
	        String Electicbill = "C:\\Users\\AlokMishra\\Desktop\\TRJPOM\\src\\test\\resources\\Images\\QR.png";

	        WebElement Elebill = driver.findElement(By.id("electricityBillProof"));
	        Elebill.sendKeys(Electicbill);
	        Thread.sleep(2000);
	        

	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	        
	        
	    }

	    }

	    
	    


