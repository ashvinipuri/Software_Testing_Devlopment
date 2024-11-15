// 1 to 27 - https://automationexercise.com/login
//Task Common
//1. Open webpage
//2. Maximize the page
//3. Get Title and print in console
//4. Fetch data that enter in to the text box
//5. Perform operation as per given webpage(Sign up/Login)
//6. After login print URL in console
//7 Close browser(After all operations/task)




package testing;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LabExam {
	public static WebDriver wd ; 
  @Test
  @Parameters({"un","pw"})

  public void login(String un,String pw) throws Exception {
	  wd.findElement(By.xpath("//input[@name='email']")).sendKeys(un);
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//button[@id='submit']")).click();
	  Thread.sleep(3000);
	  
	  // fetch data 
	  
	  WebElement we=wd.findElement(By.name("firstName"));
		we.sendKeys("Ashvini");
		String w=we.getAttribute("value");
		System.out.println(w);

		WebElement we1=wd.findElement(By.name("lastName"));
		we1.sendKeys("Amol");
		String w1=we.getAttribute("value");
		System.out.println(w1);


  }
  
  @BeforeTest
  public void beforeTest() {
	  wd =new ChromeDriver();  // no need to write webdriver
	  wd.get("https://automationexercise.com/login" );
	  wd.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	 
	  String s = wd.getTitle();
	  System.out.println(s);
	  
	  String u = wd.getCurrentUrl();
	  System.out.println(u);
	  
	  
	  wd.close();
  }
}