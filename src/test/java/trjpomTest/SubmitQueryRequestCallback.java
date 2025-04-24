package trjpomTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import trjpom.RequestCallBackAndSubmitQuery;

public class SubmitQueryRequestCallback {
    WebDriver driver;
    RequestCallBackAndSubmitQuery SQRC;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://staging-trjpartner.thereturnjourney.com");

        SQRC = new RequestCallBackAndSubmitQuery(driver);
    }

    @Test(priority = 1)
    void SubmitQuery() {
        try {
            SQRC.SubmitQuesyfillInvalidThenValidCredentials();
        } catch (Exception e) {
            System.out.println("Submit Query test failed: " + e.getMessage());
            e.printStackTrace();
            assert false : "SubmitQuery test failed.";
        }
    }

    @Test(priority = 2)
    void RequestCallBack() throws InterruptedException {
            SQRC.RequestCallBack();  
    }

    @AfterClass
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
