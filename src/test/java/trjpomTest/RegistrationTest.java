package trjpomTest;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import trjpom.RegistrationFlow;

public class RegistrationTest {

    WebDriver driver;
    RegistrationFlow registrationFlow;  // Use correct class name

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://staging-trjpartner.thereturnjourney.com");
        driver.manage().window().maximize();

        registrationFlow = new RegistrationFlow(driver); // Initialize your POM class
    }

    @Test(priority=1)
    void testBasicDetails() throws InterruptedException {
        registrationFlow.ValidBasicDetails();  // Call the method from RegistrationFlow
        
    }
    @Test(priority=2)
    public void CompanyDetails() throws InterruptedException {
    	registrationFlow.CompanyDetails();
    	
    }
    
}

