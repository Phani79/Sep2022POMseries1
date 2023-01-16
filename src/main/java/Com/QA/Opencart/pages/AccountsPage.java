package Com.QA.Opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {

	private WebDriver driver;

	private By search = By.name("search");
	private By accSecHeaders = By.cssSelector("div#content h2");
	private By searchIcon = By.cssSelector("div#search button");
	private By logoutLink = By.linkText("Logout");
	private By searchList = By.xpath("//div[@class = \"image\"]");
	

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getAccountsPageTitle() {
		return driver.getTitle();
	}

	public String getAccountPageUrl() {
		return driver.getCurrentUrl();
	}

	// public void perfomSearch()

	public boolean isLogoutExist() {
		return driver.findElement(logoutLink).isDisplayed();
	}

	public boolean isSearchExist() {
		return driver.findElement(searchIcon).isDisplayed();
	}

	public List<String> getPageSectionsHeaders() {
		List<WebElement> SecHaedersList = driver.findElements(accSecHeaders);
		List<String> SecHeadersValueList = new ArrayList<String>();
		for (WebElement e : SecHaedersList) {
			String text = e.getText();
			SecHeadersValueList.add(text);
		}
		return SecHeadersValueList;
	}

// By using TestDrivenDevelopment approach
	
	public ResultsPage performSearch(String macbook) {
		System.out.println("product search for : " + macbook);
		if (isSearchExist()) {
			driver.findElement(search).sendKeys(macbook);
			driver.findElement(searchIcon).click();
			return new ResultsPage(driver);
		}
		return null;
		
		

//			List<WebElement> searchProd = driver.findElements(searchList);
//			List<String> searchProdList = new ArrayList<String>();
//			for (WebElement e : searchProd) {
//				String text1 = e.getText();
//				searchProdList.add(text1);
//			}

	}
	
	
	

	// it means if search fails return null;

}
