package trjpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyBooking_Page {
	WebDriver driver;

    public MyBooking_Page(WebDriver driver) {
        this.driver = driver;
    }
    
    // logo
    By LogoClickable = By.xpath("//img[@alt='Logo']");
    
    // HomeIcon
    By HomeIcon =By.xpath("//p[normalize-space()='Home']");
    
    // ClickUpcomingIcon
    By ClickUpcomingIcon = By.xpath("//body/div[contains(@data-overlay-container,'true')]/div/div/div[1]/div[1]/div[1]");
    
    // ClickCompletedIcon
    By ClickCompletedIcon = By.xpath("//p[normalize-space()='Completed(4)']");
    
    // CancledIcon
    By ClickCancledIcon = By.xpath("//p[normalize-space()='Cancelled(10)']");
    
    // CountTableRows
    By TableRow = By.xpath("//div[@class=\"w-full min-h-[42px] flex bg-[#f4f4f8] p-3 rounded-t-[8px] gap-6 border-2\"]");
    
    // Click ViewIcon
    By ViewIcon = By.xpath("//body/div[@data-overlay-container='true']/div/div/div/div[2]/div[11]");
    
    // ClickForwordPaginationIcon
    By ClickForwordPaginationIcon = By.xpath("//p[contains(@class,'cursor-pointer font-bold text-lg text-text-secondary hover:text-primary')][normalize-space()='>']");
    
    // ClickBackwordPaginationIcon
    By BackwordPaginationIcon = By.xpath("//p[normalize-space()='<']");
    
    public String getPageTitle() {
        String expectedTitle = "TRJ Partner";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title doesn't match");
        return actualTitle;
    }
    
    public void Clicklogo() {
    	driver.findElement(LogoClickable).click();
    }
    public void ClickHome() {
    	driver.findElement(HomeIcon).click();
    }
    public void ClickUpcomingIcon() {
    	driver.findElement(ClickUpcomingIcon).click();
    }
    public void ClickCompleteIcon() {
    	driver.findElement(ClickCompletedIcon).click();
    }
    public void ClickCancilIcon() {
    	driver.findElement(ClickCancledIcon).click();
    }
    public int TableRow() {
    	return driver.findElements(TableRow).size();
    }
    public void ClickViewIcon() {
    	driver.findElement(ViewIcon);
    }
    public void ClickNextPagination() {
    	driver.findElement(ClickForwordPaginationIcon);
    }
    public void ClickPrevioursPagination() {
    	driver.findElement(BackwordPaginationIcon);
    }
    
    
    
}
