package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Amazon_Home_Page {
	
	@FindBy(how=How.XPATH,using="//a[@id='nav-link-accountList']")
	private WebElement drp_drpsignup;
	
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/header/div/div[3]/div[13]/div[2]/a/span")
	private WebElement btn_signup;
	
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement txt_mobile_no;
	
	
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	private WebElement btn_amazon;


	@FindBy(how=How.XPATH,using="//input[@name='password']")
	private WebElement txt_password;

	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	private WebElement btn_pass;

	//moveto Elemenet
	@FindBy(how=How.XPATH,using="//input[@type='text']")
	private WebElement txt_SearchText;
	
	@FindBy(how=How.XPATH,using="//div[@role='button']")
	private WebElement sel_value;
	
	
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	private WebElement txt_Sendiphone;
	
	
	@FindBy(how=How.XPATH,using="//input[@name='submit.add-to-cart']")
	private WebElement txt_Addtocart;
	
	
	@FindBy(how=How.XPATH,using="//a[@id='attach-close_sideSheet-link']")
	private WebElement btn_btncross;
	
	
	@FindBy(how=How.XPATH,using="//span[@class='nav-cart-icon nav-sprite']")
	private WebElement btn_gotocart;
	
	
	@FindBy(how=How.XPATH,using="//input[@value='Delete']")
	private WebElement btn_deletebtn;

	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	private WebElement btn_submit;

	public WebElement getDrp_drpsignup() {
		return drp_drpsignup;
	}



	public WebElement getBtn_signup() {
		return btn_signup;
	}




	public WebElement getTxt_mobile_no() {
		return txt_mobile_no;
	}



	public WebElement getBtn_amazon() {
		return btn_amazon;
	}



	public WebElement getTxt_password() {
		return txt_password;
	}




	public WebElement getBtn_pass() {
		return btn_pass;
	}


	


	public WebElement getTxt_SearchText() {
		return txt_SearchText;
	}


	

	public WebElement getTxt_Sendiphone() {
		return txt_Sendiphone;
	}


	

	public WebElement getTxt_Addtocart() {
		return txt_Addtocart;
	}


	


	public WebElement getBtn_btncross() {
		return btn_btncross;
	}





	public WebElement getBtn_gotocart() {
		return btn_gotocart;
	}




	public WebElement getBtn_deletebtn() {
		return btn_deletebtn;
	}



	public WebElement getSel_value() {
		return sel_value;
	}



	public WebElement getBtn_submit() {
		return btn_submit;
	}











	


	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
