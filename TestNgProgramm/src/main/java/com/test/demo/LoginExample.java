package com.test.demo;

public class LoginExample {

	String authenticate(String username,String password)
	{
		if(username.equals("admin") && password.equals("admin123"))
		{
			return "Success";
		}
		else
		
		return "Failed";
		
		
		
	}
	
	
}
