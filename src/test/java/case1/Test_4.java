package case1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Utility.BaseClass;

public class Test_4  extends BaseClass{
	
	
	@Test
	public void normal() {
		
		String ParentwinAdd=driver.getWindowHandle();
		System.out.println(ParentwinAdd);
		
		Set<String> allwindAdd=driver.getWindowHandles();
		System.err.println(allwindAdd);
		
		Iterator<String> it=allwindAdd.iterator();
		while(it.hasNext()) {
			String ChidlwinAdd=it.next();
			if(!ParentwinAdd.equals(ChidlwinAdd)) {
				driver.switchTo().window(ChidlwinAdd);
				driver.findElement(By.xpath(ChidlwinAdd));
				driver.close();
				}
			driver.switchTo().window(ParentwinAdd);
			driver.quit();
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
