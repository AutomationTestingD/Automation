package firstpackage;//pull testing

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mywipro {

    public static void main(String[] args) throws InterruptedException, IOException {
        
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mywipro.wipro.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"bySelection\"]/div[2]/div")).click();

        //Excel data reading for user name and password
        
        File file = new File("C:\\Users\\Sandy\\eclipse-workspace\\firstproject\\src\\firstpackage\\test.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        String username =  sheet.getRow(0).getCell(0).getStringCellValue();
        String password =  sheet.getRow(0).getCell(1).getStringCellValue();
        driver.findElement(By.xpath("//*[@id=\"userNameInput\"]")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"passwordInput\"]")).sendKeys(password);
        
        
        driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/app-root/div/app-landing/div[1]/div/app-home/section/div[1]/app-favourite-apps/div/div/ul/li/div[1]/div[1]/button")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/app-root/div/app-my-app/iframe")));
        driver.findElement(By.xpath("//*[@id=\"tmsMobileId\"]")).click();
        Thread.sleep(10000);
      
        ArrayList<WebElement> a = new ArrayList<WebElement>();
        
        for(int i=0; i<7; i++){
        
        a.add(0, driver.findElement(By.xpath("//*[@id=\\"+i+"_0_0_0\"]")));
System.out.println(a.get(i));
        }
      /*  
        int ArraySize = a.size();
        
        for(int i=0; i<ArraySize; i++) {    
        	
        	a.get(i).click();
        	if(a.get(i).isSelected()) {
        	
        	        		  
		        Actions builder =new Actions(driver);
		        builder.moveToElement(a.get(i)).click().sendKeys("2").build().perform();
		     	System.out.println("Efforts successfully updated");
        	  }*/
		            	/*try {    
		        		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[16]/div/div[2]/div/div/div[1]/div/div[3]/button")).click();
		        		System.out.println("You cannot update the efforts for the current date");    
		        	    }        		
		        	catch(Exception e1) 
		        		{
		            	System.out.println("No Efforts field is available");
		            	}
		        	}*/
		       }
        }
     
