package testing.pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void first() {  
	  System.out.println("I am in test case");
  }
  
  @Test
  public void second() {
	  System.out.println("I am in test case");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am in test case");
  }
  
//  @BeforeMethod  // if we change annotaion name it will give complile time error
//  public void abcd()  // if we change method name it will give  run  time error
//  {
//	  System.out.println("I am in beforeMethod");
//  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am in afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am in after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am in  before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am in after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am in  beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am in  afterSuite");
  }

}
