package selenium_intro.browserInteraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxInteraction {

	public static void main(String[] args) {
		String projectLocation = System.getProperty("user.dir");
		String chromedrivelocaion = "/driver/geckodriver.exe";
		String driverPath = projectLocation + chromedrivelocaion;
		System.out.println(driverPath);
		System.setProperty("webDriver.gecko.driver", driverPath);
		WebDriver driver = new FirefoxDriver();
		driver.get("www.google.com");
		driver.close();
	}

}
