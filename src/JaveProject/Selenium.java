package JaveProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium
{
  public static void main(String[] args) 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe\\");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https:\\www.flipkart.com");
	
}
}
