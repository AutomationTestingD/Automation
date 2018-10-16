package firstpackage;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import java.util.List;		
import java.util.concurrent.TimeUnit;		
import org.openqa.selenium.*;		

public class ListHyperLinks {				
    		
    public static void main(String[] args) {									
        String baseUrl = "https://www.google.com/";		
        
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        driver.manage().window().maximize();		
        String underConsTitle = "Under Construction: Mercury Tours";					
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);					

			driver.get(baseUrl);					
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
        String[] linkTexts = new String[linkElements.size()];							
			int					i = 0;					

			//extract the link texts of each link element		
			for (WebElement e : linkElements) {							
			linkTexts[i] = e.getText();							
			i++;			
			System.out.println(e.getText());
        }		

			//test each link		
			for (String t : linkTexts) {							
			driver.findElement(By.linkText(t)).click();					
			if (driver.getTitle().equals(underConsTitle)) {							
                System.out.println("\"" + t + "\""								
                        + " is under construction.");			
            } else {			
                System.out.println("\"" + t + "\""								
                        + " is working.");			
            }		
			driver.navigate().back();			
        }		
			driver.quit();			
    }		
}