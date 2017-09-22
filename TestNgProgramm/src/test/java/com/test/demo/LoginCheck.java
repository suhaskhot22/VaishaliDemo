package com.test.demo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginCheck {
	
	@DataProvider
	 public static Object[][] data()
	 {
		Object [][]test=new Object[5][3];
		
		test[0][0]="admin";
		test[0][1]="admin123";
		test[0][2]="Success";
		
		test[1][0]="";
		test[1][1]="admin123";
		test[1][2]="Failed";
		
		test[2][0]="admin";
		test[2][1]="";
		test[2][2]="Failed";
		
		test[3][0]="";
		test[3][1]="";
		test[3][2]="Failed";
		
		test[4][0]="asdn";
		test[4][1]="admin123";
		test[4][2]="Failed";
		
		return test;
		
	 }
	
	
	
  @Test(dataProvider="data")
  public void user_authenticate(String u,String p,String e) {
	  LoginExample log=new LoginExample();
	  Assert.assertEquals(log.authenticate(u, p), e);
	  
   }
 /* @Test
  public void userfail_authenticate() {
	  LoginExample log=new LoginExample();
	  Assert.assertEquals(log.authenticate("admin123", "admin"), "Failed");
	  
  }
  @Test
  public void usernull_authenticate() {
	  LoginExample log=new LoginExample();
	  Assert.assertEquals(log.authenticate("", "admin"), "Failed");
	  
  }
  @Test
  public void pwdnull_authenticate() {
	  LoginExample log=new LoginExample();
	  Assert.assertEquals(log.authenticate("admin123", ""), "Failed");
	  
  }
  @Test
  public void userpwdnull_authenticate() {
	  LoginExample log=new LoginExample();
	  Assert.assertEquals(log.authenticate("", ""), "Failed");
	  
  }*/
}
