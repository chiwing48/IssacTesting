package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test1 {
	private WebDriver driver;
	
	
  @Test
  public void test1() {
	  
	  	driver.get("https://www.google.com");
	  	String title = driver.getTitle();
	  	System.out.printf("Title %s", title);
	  	
  }
  @BeforeTest
  public void beforeTest() {
	  
	  String path = Consts.CHROME_DRIVER_PATH;
	  System.setProperty("webdriver.chrome.driver", path); //"//src/test.resources/chromedriver.exe");
	  driver =new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
