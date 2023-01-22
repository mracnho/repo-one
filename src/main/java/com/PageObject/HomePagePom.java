package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePom {

	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement txt_mobile_no;
	
	
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	private WebElement btn_amazon;


	@FindBy(how=How.XPATH,using="//input[@name='password']")
	private WebElement txt_password;

	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	private WebElement btn_pass;

	
	
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






	
	
	
	
	
	
	
	
	
	
}
