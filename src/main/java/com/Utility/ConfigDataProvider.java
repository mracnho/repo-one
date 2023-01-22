package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	public static Properties pro;
	
   public ConfigDataProvider() throws Exception {
	
	
	String conpath="E:\\java\\FrameWork2023\\config\\config.properties";
    FileInputStream file=new FileInputStream(conpath);
    pro=new Properties();
    pro.load(file);
    
}
   
   
	public static String get_BaseUrl_QA1() {
		
		return pro.getProperty("BaseUrl_QA1");
		
		
	}
	
	public static String get_BaseUrl_QA2() {
		
		return pro.getProperty("BaseUrl_QA2");
		
		
	}
	
	
	public static String get_BaseUrl_QA3() {
		
		return pro.getProperty("BaseUrl_QA3");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
