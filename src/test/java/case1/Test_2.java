package case1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.HomePagePom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_2 extends BaseClass{
	
	@Test
	public void Verify_Amazon() {
		
		HomePagePom pom=PageFactory.initElements(driver, HomePagePom.class);
		Library.Custom_Sendkeys(pom.getTxt_mobile_no(), excel.getStringData("Sheet1", 1, 0), "Mobile");
		Library.Custom_Click(pom.getBtn_amazon(),"Btn");
		Library.Custom_Sendkeys(pom.getTxt_password(), excel.getStringData("Sheet1", 1, 1), "passField");
		Library.Custom_Click(pom.getBtn_pass(), "Btn_pass");
		
		
		
		
	}
	
	
	
	
	
	
	

}
