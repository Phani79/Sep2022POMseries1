package Com.QA.Opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	private By emailID = By.id("input-email");
	private By password = By.id("input-password");
	private By loginBtn = By.xpath("//input[@value = 'Login']");
	private By forgotpwdlink = By.linkText("Forgotten Password");

		public LoginPage(WebDriver driver) {
		this.driver = driver;
		}
		
	public String getLoginPageTitle() {
		String titleName = driver.getTitle();
		System.out.println("The login page title is" + titleName);
		return titleName;
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public boolean isForgetPwdLinkExist() {
		return driver.findElement(forgotpwdlink).isDisplayed();
	}

	public AccountsPage doLogin(String un, String pwd) {
		driver.findElement(emailID).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		System.out.println("login completed");
		//driver.findElement(By .linkText("Logout")).isDisplayed();
		
		return new AccountsPage(driver);
		
		}

}
