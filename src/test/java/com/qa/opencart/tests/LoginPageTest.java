package com.qa.opencart.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

//import Com.QA.Opencart.pages.LoginPage;


public class LoginPageTest extends BaseTest {

	@Test
	public void loginPageTitleTest() {
		String actTitle = loginPage.getLoginPageTitle();
		//Assert.assertEquals(actTitle, "Account Login");
	Assert.assertEquals(actTitle, "Account Login");
		
	}
	
	@Test
	public void loginPageUrlTest() {
		String actUrl = loginPage.getPageUrl();
		System.out.println("the current URL of this webpage is " + actUrl);
		Assert.assertTrue(actUrl.contains("login"));
	}
	
	@Test
	public void isForgetPwdExistTest() {
		 Assert.assertTrue(loginPage.isForgetPwdLinkExist());
	}
	
//	@Test
//	public boolean doLoginTest() {
//		Assert.assertEquals(loginPage.doLogin("phani.pv1@gmail.com", "phani.pv1"));
//	}
}
