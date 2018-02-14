package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;
  @Test
  public void test1() {
	  	driver.get("https://www.google.com");
	  	String title = driver.getTitle();
	  	
	  	System.out.printf("Title %s", title);
	  	
//	  	1LIz_0gKy-BjKrkUbM2RAo7cxtV3PiQszgHOJdxtn54I
  }
  @BeforeTest
  public void beforeTest() {
	  String path = "C:\\Eclipse\\eclipse\\WebDriver\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path); //"//src/test.resources/chromedriver.exe");
	  driver =new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
