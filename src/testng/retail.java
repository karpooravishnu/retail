package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class elearningTest {
	
	
	
	
	@BeforeMethod
	
	public void launchBrowser(){
		

		System.setProperty("webdriver.chrome.driver", ".//project1//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://retailm1.upskills.in/admin/");
	}
	 @Test
	public void testdetails(){
		 
		 System.setProperty("webdriver.chrome.driver", ".//project1//chromedriver.exe");
		 
			WebDriver driver = new ChromeDriver();
			driver.get("http://retailm1.upskills.in/admin/");
			driver.findElement(By.name("username")).sendKeys("Admin");
	        driver.findElement(By.name("password")).sendKeys("Admin@123");
	        driver.findElement(By.xpath("//div/div/div/div/div[2]/form/div[3]/button")).click();
	        
	        WebElement hover = driver.findElement(By.xpath("//*[@id='menu-customer']"));
	        Actions action = new Actions(driver);
	        action.moveToElement(hover).perform();
	        
	        
	     
	        WebElement mainMenu = driver.findElement(By.xpath("//*[@id='menu-customer']"));
	        Actions actions = new Actions(driver);
	        actions.moveToElement(mainMenu);
	        WebElement subMenu = driver.findElement(By.xpath("//*[@id='menu-customer']/ul/li[1]/a"));
	        actions.moveToElement(subMenu);
	        actions.click().build().perform();
	        
	        
	        driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/a")).click();
	        
	        Select group = new Select(driver.findElement(By.xpath("//*[@id='input-customer-group']")));
	        group.selectByVisibleText ("Default");
	        
	       
	        
	        
	        
	        
	        
	        WebElement firstname = driver.findElement(By.xpath("//*[@id='input-firstname']"));
	        WebElement lastname = driver.findElement(By.xpath("//*[@id='input-lastname']"));
	        WebElement email= driver.findElement(By.xpath("//*[@id='input-email']"));
	        WebElement tel= driver.findElement(By.xpath("//*[@id='input-telephone']"));
	        WebElement fax= driver.findElement(By.xpath ("//*[@id='input-fax']"));
	        WebElement pass= driver.findElement(By.xpath ("//*[@id='input-password']"));
	        WebElement conpass= driver.findElement(By.xpath ("//*[@id='input-confirm']"));
	        firstname.sendKeys("karpoora");
	        lastname.sendKeys("vishnu");
	        email.sendKeys("ab@gmail.com");
	        tel.sendKeys("56677765");
	        fax.sendKeys("6365646");
	        pass.sendKeys("1234");
	        conpass.sendKeys("1234");
	        
	        
	        Select newsletter = new Select(driver.findElement(By.xpath("//*[@id='input-newsletter']")));
	        newsletter.selectByVisibleText ("Enabled");
	        
	        Select status = new Select(driver.findElement(By.xpath("//*[@id='input-status']")));
	        status.selectByVisibleText ("Enabled");
	        
	        Select approve = new Select(driver.findElement(By.xpath("//*[@id='input-approved']")));
	        approve.selectByVisibleText ("Yes");
	        
	        Select safe = new Select(driver.findElement(By.xpath("//*[@id='input-safe']")));
	        safe.selectByVisibleText ("Yes");
	        
	        driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/button")).click();
	        driver.quit();
	        
	      

	        
	        

	        
	    
	      

	    
	     
	        
	        
	       
			
			// TODO Auto-generated method stub

		}

	

	      
		
	
	 @Test
		public void testdetails2(){
			 
			 System.setProperty("webdriver.chrome.driver", ".//project1//chromedriver.exe");
			 
				WebDriver driver = new ChromeDriver();
				driver.get("http://retailm1.upskills.in/admin/");
				driver.findElement(By.name("username")).sendKeys("Admin");
		        driver.findElement(By.name("password")).sendKeys("Admin@123");
		        driver.findElement(By.xpath("//div/div/div/div/div[2]/form/div[3]/button")).click();
		        WebElement hover = driver.findElement(By.xpath("//*[@id='menu-customer']"));
		        Actions action = new Actions(driver);
		        action.moveToElement(hover).perform();
		        
		        
		     
		        WebElement mainMenu = driver.findElement(By.xpath("//*[@id='menu-customer']"));
		        Actions actions = new Actions(driver);
		        actions.moveToElement(mainMenu);
		        WebElement subMenu = driver.findElement(By.xpath("//*[@id='menu-customer']/ul/li[1]/a"));
		        actions.moveToElement(subMenu);
		        actions.click().build().perform();
		        
		        
		        driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/a")).click();
		        
		        Select group = new Select(driver.findElement(By.xpath("//*[@id='input-customer-group']")));
		        group.selectByVisibleText ("Default");
		        
		       
		        
		        
		        
		        
		        
		        WebElement firstname = driver.findElement(By.xpath("//*[@id='input-firstname']"));
		        WebElement lastname = driver.findElement(By.xpath("//*[@id='input-lastname']"));
		        WebElement email= driver.findElement(By.xpath("//*[@id='input-email']"));
		        WebElement tel= driver.findElement(By.xpath("//*[@id='input-telephone']"));
		        WebElement fax= driver.findElement(By.xpath ("//*[@id='input-fax']"));
		        WebElement pass= driver.findElement(By.xpath ("//*[@id='input-password']"));
		        WebElement conpass= driver.findElement(By.xpath ("//*[@id='input-confirm']"));
		        firstname.sendKeys("marques");
		        lastname.sendKeys("brownlee");
		        email.sendKeys("abrown@gmail.com");
		        tel.sendKeys("566557765");
		        fax.sendKeys("636553646");
		        pass.sendKeys("12364");
		        conpass.sendKeys("12364");
		        
		        
		        Select newsletter = new Select(driver.findElement(By.xpath("//*[@id='input-newsletter']")));
		        newsletter.selectByVisibleText ("Enabled");
		        
		        Select status = new Select(driver.findElement(By.xpath("//*[@id='input-status']")));
		        status.selectByVisibleText ("Enabled");
		        
		        Select approve = new Select(driver.findElement(By.xpath("//*[@id='input-approved']")));
		        approve.selectByVisibleText ("Yes");
		        
		        Select safe = new Select(driver.findElement(By.xpath("//*[@id='input-safe']")));
		        safe.selectByVisibleText ("Yes");
		        
		        driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/button")).click();
		        driver.quit();
	 }
		      

		        
		        

		        
		    
		      

		    
		     
		        
		        
		       
				
				// TODO Auto-generated method stub

		

		}

	


