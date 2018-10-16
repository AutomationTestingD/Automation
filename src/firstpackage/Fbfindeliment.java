package firstpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbfindeliment {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "https://netbanking.hdfcbank.com/netbanking/";
        
        
        driver.get(baseUrl);
        driver.manage().window().maximize();
        //tagName = driver.findElement(By.name("fldLoginUserId")).getTagName();
        
      //  for(int i=0; i<20;i++) {
        
        WebElement customerid = driver.findElement(By.name("fldLoginUserId"));
        customerid.sendKeys("44640496");
        
       WebElement pass = driver.findElement(By.id("newpassword"));
        pass.sendKeys("");
        WebElement mobile = driver.findElement(By.id("userEmail"));
        mobile.sendKeys("9603007731"); 
        WebElement submit = driver.findElement(By.id("se_userSignIn"));
        submit.click();
        
       // try {
       // 	submit.click();
      //    } catch (org.openqa.selenium.WebDriverException name) {
                //Replace ExceptionHere with your exception and name with the name of your exception.
     //   	  System.out.println("Cannot continue");
     //   	  driver.close();
       //   }
        
                }
        //System.out.println(tagName);
      //  driver.close();
}