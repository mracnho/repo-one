package com.Utility;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import net.bytebuddy.utility.RandomString;

public class Library {
	
	public static ExtentTest test;
	
	public static void Custom_Sendkeys(WebElement element, String Value, String FieldName ) {
		try {
		element.sendKeys(Value);
		test.log(Status.PASS, FieldName+"=Values succesfullly send="+Value);
		
		
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		
		}
	
	}
	
	public static void Custom_Click(WebElement element, String FieldName) {
		
		try {
		     element.click();
		     test.log(Status.PASS, "=Value successfully send........="+FieldName);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		
		}
		
	}
	
	public static void Capture_Screenshot(WebDriver driver ) throws Exception {
		try {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String rm=RandomString.make(4);
		File file=new File("E:\\java\\FrameWork2023\\Screenshot\\"+rm+".png");
		
		FileUtils.copyFile(file, file);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		
	}
	
	public static void Custom_mouseMoment(WebDriver driver, WebElement element ) {
		
		try {
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void Custom_enter(WebDriver driver) {
		try {
		Actions act=new Actions(driver);
		act.keyDown(Keys.ENTER);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	public static Alert Custom_HandalAlert(WebDriver driver) {
		
		Alert alt=driver.switchTo().alert();
		return alt ;
		
		
	}
	
	public static void Custom_HandalDropdown(WebElement element, String value ) {
		
		try {
		Select sel=new Select(element);;
		sel.selectByVisibleText("value");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void Custom_HandalChildBrowser(WebDriver driver ,WebElement element , WebElement element1,WebElement element2 ) {
		try {
		String parentwindAdd=driver.getWindowHandle();
		System.out.println(parentwindAdd);
		
		driver.findElement(By.xpath("element"));
		
		
		Set<String> AllwinAdrs=driver.getWindowHandles();
		System.out.println(AllwinAdrs);
		
		java.util.Iterator<String> it=AllwinAdrs.iterator();
		while(it.hasNext()) {
			
			String chilWinAdd=it.next();
			if(!parentwindAdd.equals(chilWinAdd)) {
				
				driver.switchTo().window(chilWinAdd);
				driver.findElement(By.xpath("element1")).click();
				driver.findElement(By.xpath("element2")).click();
				driver.close();
				}
			
			driver.switchTo().window(parentwindAdd);
			driver.quit();
		
		}}catch(Exception e) {
			
			System.out.println(e.getMessage());
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
