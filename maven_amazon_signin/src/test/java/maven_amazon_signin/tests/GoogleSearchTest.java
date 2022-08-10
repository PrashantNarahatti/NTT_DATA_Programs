package maven_amazon_signin.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;

import maven_amazon_signin.browserSetup.BrowserSetup;
import maven_amazon_signin.pages.AmazonPage;
import maven_amazon_signin.pages.GoogleSearchPage;
import maven_amazon_signin.pages.SigninPage;
import maven_amazon_signin.utils.PropertiesReader;

public class GoogleSearchTest {

	public static void main(String[] args) {
		PropertiesReader pr = new PropertiesReader();
		BrowserSetup browserSetup = new BrowserSetup();
		String browser = pr.getBrowserName();
		String url = pr.getAppURL();
		WebDriver driver = browserSetup.setBrowser(browser);
		driver.get(url);

		GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

		googleSearchPage.searchInText("Amazon");
		googleSearchPage.openFirstSearchResult();

		AmazonPage amazonPage = new AmazonPage(driver);
		amazonPage.openSignin();

		driver.findElement(By.linkText("Sign in")).click();

		SigninPage signinPage = new SigninPage(driver);
		signinPage.enterElement1("6362762260");
		signinPage.enterElement2("@Pacchu37");
		signinPage.openFirstTextResult();

		signinPage.findElement(By.linkText("Continue")).click();

		if (SigninPage.contains("6362762260")) {
			System.out.println("User Verified,Test case Passed");
		} else {
			System.out.println("User Verification Failed,Test case Failed");
		}

		signinPage.findElement(By.linkText("Sign-in")).click();
		if (SigninPage.contains("@Pacchu37")) {
			System.out.println("User Verified,Test case Passed");
		} else {
			System.out.println("User Verification Failed,Test case Failed");
		}

	}
}