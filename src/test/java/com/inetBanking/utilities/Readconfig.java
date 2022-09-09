package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	
	
	public Readconfig()
	
	{
	File src =new File("C:\\Users\\madhu\\Desktop\\net\\inetBankingV1\\Configuration\\Config.properties");
	
	try
	{
	FileInputStream fis =new FileInputStream(src);
	pro=new Properties();
	pro.load(fis);
	}
	catch (Exception e) 
	{
		System.out.println("Exception is"+ e.getMessage());
	}
	}
	
	public String getApplicationURL() 
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername() 
	{
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getPassWord() 
	{
		String password=pro.getProperty("Password");
		return password;
	}
	
	

}
