package com.base2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig2 {
	
	FileInputStream input ;
	Properties prop = new Properties();
		
	
	public ReadConfig2() {
	
		try {
			input = new FileInputStream("C:\\Users\\Mohammad\\eclipse-workspace\\TryTestNG2\\src\\test\\resources\\properties\\Test2.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					}
		try {
			prop.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public String getUrl() {
		String myUrl = prop.getProperty("url");
		return myUrl;
		
		
	}
	public String getUser() {
		String myUser = prop.getProperty("username");
		return myUser;
	}
	


public String getpassword() {
	String myPass = prop.getProperty("password");
	return myPass;
}
}