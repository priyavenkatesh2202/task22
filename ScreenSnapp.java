package task22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenSnapp {

	
		
		
		
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
		// open the browser	
			
			WebDriver driver = new ChromeDriver();
			
		// launch the URL	
			
			driver.get("https://phptravels.com/demo/");
			
			driver.manage().window().maximize();
			
		// enter first name
			
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Priya");
			
		// enter last name	
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Venk");
			
		// enter phone number	
			driver.findElement(By.xpath("//input[@placeholder=' ']")).sendKeys("9566700270");
			
		//	enter business name
			driver.findElement(By.xpath("//input[@placeholder='Business Name']")).sendKeys("SVR Logistics");
			
		// enter mail ID	
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("priyavenk@gmail.com");
			
		// to add the value  that verifies the sum 	
			
			
			// getting first value
			
	        String st = driver.findElement(By.xpath("//span[@id='numb1']")).getText();
		
			
			// getting second value
			String str = driver.findElement(By.xpath("//span[@id='numb2']")).getText();
			
			//converting string to integer
			int i=Integer.parseInt(st); 
			
			int t = Integer.parseInt(str);
			
			// to add the values and stored @ value s
			int s = i+t;
			
			//converting integer to string
		    String stt = Integer.toString(s); 
		  
		// enter the sum value    
		    driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys( stt ); 
		   
		// mouse action to click the submit button   
	        WebElement clickable = driver.findElement(By.xpath("//button[@id='demo']"));
	        new Actions(driver).click(clickable).perform();
	       
	    // explicit wait for the form to be submitted  
	        
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	       
	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[@class='text-center cw mt-3']")));
     

	    // to verify the form is submitted successfully 
		
	        
	        String text = element.getText(); 
	        System.out.println("The verified tag name is: " + text);
	    
	   
		
		// to Capture the screenshot
		
		   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   
		   
		   
			// locating one of the element to take screenshot   
			   
			   driver.findElement(By.xpath("//strong[contains(text(),' Thank')]")).click();
			
				
		// Mention the path where the screen shot to be located
				
		   File dest = new File("C:\\Users\\HP\\eclipse-workspace\\POMProject\\SNAP\\snp.png");
				
	    // source to destination
				
		   FileUtils.copyFile(source, dest);
			
		}
		}
		
	
		
	

