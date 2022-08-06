package selenium_intro.browserInteraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeInteraction {
	public static void main(String[] args) {
		String projectLocation = System.getProperty("user.dir");
		String chromedrivelocaion = "/driver/chromedriver.exe";
		String driverPath = projectLocation + chromedrivelocaion;
		System.out.println(driverPath);
		System.setProperty("webDriver.Chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
	}

}
