package case1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.Loginpom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_1 extends BaseClass {

	@Test
	public void Verify_login() {
		

		Loginpom login=PageFactory.initElements(driver, Loginpom.class);
		Library.Custom_Sendkeys(login.getTxt_Email(), excel.getStringData("Sheet1", 0, 0), "Email");
		Library.Custom_Sendkeys(login.getTxt_pass(), excel.getStringData("Sheet1", 0, 1), "password");
		Library.Custom_Click(login.getBtn_login(), "button_login");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
