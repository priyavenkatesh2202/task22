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
			
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://phptravels.com/demo/");
			
			driver.manage().window().maximize();
			
		 //	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Priya");
			
			
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Venk");
			
			
			driver.findElement(By.xpath("//input[@placeholder=' ']")).sendKeys("9566700270");
			
			
			driver.findElement(By.xpath("//input[@placeholder='Business Name']")).sendKeys("SVR Logistics");
			
			
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("priyavenk@gmail.com");
			
			
	        String st = driver.findElement(By.xpath("//span[@id='numb1']")).getText();
		
			
			
			String str = driver.findElement(By.xpath("//span[@id='numb2']")).getText();
			
			
			int i=Integer.parseInt(st); 
			
			int t = Integer.parseInt(str);
			
			
			int s = i+t;
			
		   String stt = Integer.toString(s); 
		  
		   driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys( stt ); 
		   
		   
		   WebElement clickable = driver.findElement(By.xpath("//button[@id='demo']"));
	       new Actions(driver).click(clickable).perform();
	       
	       
		  // driver.findElement(By.xpath("//button[@id='demo']")).click();
			
		   
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			
	  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h2[@class='text-center cw mt-3']")));

//		 
			
			   //div[@class='completed']     (//div[@class='col-md-12'])[2]

	     String e = driver.findElement(By.xpath("//strong[contains(text(),' Thank')]")).getTagName();
	    
	     System.out.println("The verified tag name is: " +e );
			
	 /* File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// Mention the path
		
		File dest1 = new File("C:\\Users\\HP\\eclipse-workspace\\POMProject\\SNAP\\snp.png");
		
		// Move source to dest
		
		FileUtils.copyFile(source1, dest1);
		  driver.findElement(By.xpath("//strong[contains(text(),' Thank')]")).click();
		
		// Capture screenshot
		
				File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				// Mention the path
				
				File dest = new File("C:\\Users\\HP\\eclipse-workspace\\POMProject\\SNAP\\snp.png");
				
				// Move source to dest
				
				FileUtils.copyFile(source, dest);
			
			*/
	     
		}
		
	
		
	
}
