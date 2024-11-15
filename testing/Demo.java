package testing;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demo {
	public static WebDriver wd ;  //  it declare as global variable so we can call object many times & anywhere
	
  @Test
  public void f() {
	  wd.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ashvini");
  }
  
  @BeforeTest
  public void beforeTest() {
	   wd =new ChromeDriver();  // no need to write webdriver
	  wd.get("https://demo.guru99.com/test/newtours/register.php" );
	  }

}
