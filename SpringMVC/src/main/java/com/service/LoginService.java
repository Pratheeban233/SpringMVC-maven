package com.service;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class LoginService {
		
	String username="Prathi";
	String password="12345";
	public boolean check(String uname,String pass) {
		if(uname.equals(username)&&pass.equals(password))
		{
			return true ;
		}
		else
		{
			return false;
		}
		
		
	}	
}
