package com.qa.opencart.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.util.AppConstants;

//import Com.QA.Opencart.pages.LoginPage;
//import Com.QA.Opencart.pages.AccountsPage;

public class AccountsPageTest extends BaseTest {

	@BeforeClass
	public void accSetup() {
		accountspage = loginPage.doLogin("phani.pv1@gmail.com", "phani.pv1");
	}
	
	@Test
	public void getAccPageTitleTest () {
		String actAccPageTitle = accountspage.getAccountsPageTitle();
		Assert.assertEquals(actAccPageTitle, "My Account"); //Both Assert. are correct 
		//Assert.assertTrue(actAccPageTitle.contains("coun"));
		}
	
	@Test
	public void getAccountPageUrlTest() {
		String actUrl = accountspage.getAccountPageUrl();
		Assert.assertTrue(actUrl.contains("route=account"));
	}
	
	@Test
	public void isLogoutPageExistTest(){
		Assert.assertTrue(accountspage.isLogoutExist());
		}	
	
	@Test
	public void getPageSectionsHeadersTest() {
		List<String>SecHeadersValueList = accountspage.getPageSectionsHeaders(); // why 
		Assert.assertEquals(SecHeadersValueList, AppConstants.EXPECTED_ACC_HEADERS_LIST);/*can use any variable name  to store the list returned in this method*/
		}
	
	@Test
	public void productSearchTest() {
		
		//String productName = "macbook";
		resultsPage = accountspage.performSearch("macbook");
		String actTitle = resultsPage.getSearchPageTitle();
		Assert.assertTrue(actTitle.contains("Search"), "Search -");
		
	}
	
	
	
//	@Test
//	public void accSetup() {
//		//Assert.assertEquals(loginPage.doLogin("phani.pv1@gmail.com", "phani.pv1"));
//	}
	
}
