package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Base {
	

		public WebDriver d;
		public Properties prop;
		
		public WebDriver initializedDriver() throws IOException 
		{
		 prop=new Properties();
		// FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"src\\main\\java\\resources\\data.properties");
      FileInputStream fis = new FileInputStream("C:\\Users\\Hare Krishna\\eclipse-workspacedemo1\\projectpavan\\src\\main\\java\\resources\\data.properties");
		 prop.load(fis);
		 
	/*	 String browsername=prop.getProperty("browser");
		 String Chromekey=prop.getProperty("key");
		 String Chromevalue=prop.getProperty("value");
		 
		 if(browsername.equals("chrome"))
		 {
			 System.setProperty("Chromekey","Chromevalue");
			  d=new ChromeDriver();
		 }    */
		 
			String browsername=prop.getProperty("browser");
			
			System.out.println(browsername);
			
			
			if(browsername.contains("chrome"))
			{
				
				System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriverlatest\\chromedriver.exe");
				ChromeOptions options =new ChromeOptions();
			
				if(browsername.contains("headless"))
				{
				
				
				options.addArguments("headless");
				
					//options1.setHeadless(true);
				}
				
		         d=new ChromeDriver(options);
			}
		 
		 if (browsername.equals("firefox"))
			{
			 System.setProperty("webdriver.gecko.driver","C:\\work\\FireFox Driver\\geckodriver.exe");
			 d = new FirefoxDriver();
			}
		 
		 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 d.manage().window().maximize();
		 return d;
		}
		
		public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
		    File source= ts.getScreenshotAs(OutputType.FILE);
		    String destinationfile=System.getProperty("user.dir") +"\\reports\\" +testCaseName +".png";
		    FileUtils.copyFile(source, new File(destinationfile));
			
			return destinationfile;
		}
		
		
	}
