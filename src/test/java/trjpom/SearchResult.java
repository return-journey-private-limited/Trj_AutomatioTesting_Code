package trjpom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResult {
	WebDriver driver;

    public SearchResult(WebDriver driver) {
        this.driver = driver;
    }
   
  //Locators
    
    By Locations=By.xpath("//div[contains(@class,'w-[130px]')]//span//*[name()='svg']");
    By Apply = By.xpath("//button[normalize-space()='Apply']");
    By Occassion = By.xpath("//div[contains(@class,'w-[115px]')]//span//*[name()='svg']");
    By Faimly = By.xpath("//div[contains(@class,'relative')]//div[4]");
    By OccassionApply= By.xpath("//button[contains(@class,'inline-flex items-center justify-center whitespace-nowrap font-Manrope font-bold rounded-[8px] ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-[#FF5903] text-white hover:bg-[#FF7A35] h-[36px] px-[24px] text-[14px] leading-[19.12px] tracking-[0.4px] mt-2')]");
    By Tags = By.xpath("(//*[name()='path'])[10]");
    By Placeholder = By.xpath("//input[contains(@placeholder,'Search and Add from the List')]");
    By TagsApply = By.xpath("//button[normalize-space()='Apply']");
    By Duration = By.xpath("//div[contains(@class,'w-[109px]')]//span//*[name()='svg']");
    By DurationApply = By.xpath("//button[normalize-space()='Apply']");
    By Commission = By.xpath("//div[contains(@class,'w-[160px]')]//span//*[name()='svg']");
    By Commision15 = By.xpath("//div[contains(@class,'flex-col gap-3')]//div[1]");
    By CommissionApply = By.xpath("//button[normalize-space()='Apply']");
    By PriceAdult = By.xpath("//div[contains(@class,'flex gap-4')]//div[3]//div[1]//span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M216.49,10')]");
    By Go = By.xpath("//button[contains(@class,'inline-flex items-center justify-center whitespace-nowrap font-Manrope font-bold rounded-[8px] ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-[#FF5903] text-white hover:bg-[#FF7A35] text-[14px] leading-[19.12px] tracking-[0.4px] h-10 px-8')]");
    By SortBy = By.xpath("//div[@class='flex gap-2']//*[name()='svg']");
    By Lowest = By.xpath("//h3[normalize-space()='Price (Lowest First)']");

    By SearchRoot=By.xpath("//p[@class=\"font-Inter font-[400] text-[14px] leading-[16.94px] tracking-[0.4px]\"]");
    By View = By.xpath("(//button[normalize-space()='View'])[1]");
    By ShowVarriation = By.xpath("//body/div[contains(@data-overlay-container,'true')]/div/div/div/div/div[3]/div[4]/div[1]/p[1]//*[name()='svg']");
    
  //Root
    public void SearchRoot() {
    	System.out.println(driver.findElements(SearchRoot).size());
    }
    //ClickView
    public void View() throws InterruptedException {
    	
    	driver.findElement(View).click();
    	Object[] windowHandles = driver.getWindowHandles().toArray();
    	driver.switchTo().window((String) windowHandles[1]);
    	
    }
}
