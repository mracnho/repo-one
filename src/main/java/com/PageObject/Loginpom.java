package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {

	
	@FindBy(how=How.XPATH,using="//input[@name='mail']")
	private WebElement txt_Email;
	
	@FindBy(how=How.XPATH,using="//input[@name='pass']")
	private WebElement txt_pass;
	
	
	@FindBy(how=How.XPATH,using="//button[contains(@id,'u_0_5_')]")
	private WebElement btn_login;


	public WebElement getTxt_Email() {
		return txt_Email;
	}

	
	public WebElement getTxt_pass() {
		return txt_pass;
	}


	public WebElement getBtn_login() {
		return btn_login;
	}


	
	
	
	
	
	
	
}
