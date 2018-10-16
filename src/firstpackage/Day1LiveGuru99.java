package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1LiveGuru99 {
	
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "c:\\chromedriver.exe");
		
				WebDriver driver = new ChromeDriver();
				String baseUrl = "http://demo.guru99.com/test/newtours/register.php";
				driver.get(baseUrl);
				driver.manage().window().maximize();
				
			//	WebElement moble = driver.findElement(By.className("level0 "));
				//moble.click();
				//WebElement search =driver.findElement(By.id("search"));
				//search.sendKeys("Hi");
				
				Select drpdown = new Select(driver.findElement(By.name("country")));
				drpdown.selectByVisibleText("INDIA");
				
				if(drpdown.equals("INDIA"))
				System.out.println("India is selected");
				else 
					System.out.println("Not selected anything");
				
				
						
				
				
				
		
		
		
	}
	}

