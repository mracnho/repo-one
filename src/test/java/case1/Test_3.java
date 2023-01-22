package case1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.Amazon_Home_Page;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_3 extends BaseClass {

	
	@Test
	public static void Amazon() {
		
		Amazon_Home_Page home=PageFactory.initElements(driver, Amazon_Home_Page.class);
	    Library.Custom_mouseMoment(driver, home.getDrp_drpsignup());
		Library.Custom_Click(home.getBtn_signup(), "sign up"); 
		Library.Custom_Sendkeys(home.getTxt_mobile_no(),excel.getStringData("Sheet1", 1, 0), "login in ID");
		Library.Custom_Click(home.getBtn_amazon(), "btn_login");
		Library.Custom_Sendkeys(home.getTxt_password(), excel.getStringData("Sheet1", 1,1), "llogin pass");
		Library.Custom_Click(home.getBtn_pass(), "btn_pass");
		Library.Custom_Click(home.getTxt_SearchText(), "Click");
		Library.Custom_mouseMoment(driver, home.getSel_value());
		Library.Custom_Sendkeys(home.getTxt_SearchText(), excel.getStringData("Sheet1", 2, 0), "Search Field");
		Library.Custom_Click(home.getBtn_submit(), "btn_submit");
	//	Library.Custom_Click(, "click");
		Library.Custom_HandalChildBrowser(driver,home.getTxt_Sendiphone(), home.getTxt_Addtocart(), home.getBtn_btncross());
		Library.Custom_Click(home.getTxt_Addtocart(), "add");
		
		//Library.Custom_Click(, "add_to_cart");
		//Library.Custom_Click(home.getBtn_btncross(), "Cross");
		Library.Custom_Click(home.getBtn_gotocart(), "cart");
		Library.Custom_Click(home.getBtn_deletebtn(), "Delete");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
