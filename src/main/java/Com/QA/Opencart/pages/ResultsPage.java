package Com.QA.Opencart.pages;

import org.openqa.selenium.WebDriver;

public class ResultsPage {

	WebDriver driver;
	
	public ResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public String getSearchPageTitle() {
		String searchPgTitle = driver.getTitle();
		return searchPgTitle;		
	}
	
	
	


}
