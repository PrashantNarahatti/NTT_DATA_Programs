package selenium_intro.browserInteraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeInteraction {

	public static void main(String[] args) {
		String projectLocation = System.getProperty("user.dir");
		System.out.println(projectLocation);
		String chromedrivelocaion = "/driver/msedgedriver.exe";
		System.out.println(chromedrivelocaion);
		String driverPath = projectLocation + chromedrivelocaion;
		System.out.println(driverPath);
		System.setProperty("webDriver.edge.driver", driverPath);
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com");
		driver.close();

	}

}
