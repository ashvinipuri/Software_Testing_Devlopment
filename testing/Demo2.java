package testing;

import java.rmi.server.SkeletonMismatchException;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Demo2 {
  @Test (priority=1)  // also  if we can use ( priority=1,enabled=false)  only this test case will not run
  public void reg() {
	  throw new SkipException("test not complete");  // if we use throw new skipException and  pass any msg then  
	//  System.out.println("Reg test case");
  }
  @Test(priority=2)
  public void home() {
	  System.out.println("home test case");
  }
  @Test
  public void login() {
	  System.out.println("login test case");
  }
  @Test(priority=4)
  public void logout() {
	  System.out.println("logout test case");
  }
}
