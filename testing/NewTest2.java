package testing;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	public static WebDriver wd ;  //  it declare as global variable so we can call object many times & anywhere
  @Test
  
  @Parameters({"un","pw"})  // un: username  pw:password
 
  public void login(String un,String pw) throws Exception {
	  wd.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//button[@id='submit']")).click();
	  Thread.sleep(3000);
  }
  
  @BeforeTest
  public void beforeTest() {
	  wd =new ChromeDriver();  // no need to write webdriver
	  wd.get("https://practicetestautomation.com/practice-test-login/" );
  }

  @AfterTest
  public void afterTest() {
	 
	  wd.close();
  }

}
