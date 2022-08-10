package maven_amazon_signin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven_amazon_signin.handlers.CommonMethods;

public class SigninPage {

	CommonMethods commonMethods;
	
	@FindBy(name = "q")
	WebElement textbox1;
	
	@FindBy(name = "q")
	WebElement textbox2;
	
	@FindBy(xpath = "(//input[@id='ap_email']")
	WebElement firstSearchResult;
	
	@FindBy(xpath = "(//input[@id='ap_password']")
	WebElement secondSearchResult;
	
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement ContinueButton;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement signinButton;
	
	
	public SigninPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	public void enterElement1(String mobile_nomber) {
		commonMethods = new CommonMethods();
		commonMethods.enterText(textbox1, mobile_nomber);
		commonMethods.hitEnter(textbox1);
	}
	
	public void openFirstTextResult() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(ContinueButton);
	}
	
	public void enterElement2(String password) {
		commonMethods = new CommonMethods();
		commonMethods.enterText(textbox2, password);
		commonMethods.hitEnter(textbox2);
	}

	public void openSecondTextResult() {
		commonMethods = new CommonMethods();
		commonMethods.clickOnElement(signinButton);
	}

	public static WebElement findElement(By linkText) {
		return null;
	}

	public static boolean contains(String string) {
		// TODO Auto-generated method stub
		return false;
	}

}

