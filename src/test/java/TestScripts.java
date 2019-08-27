import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScripts {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinidhi\\Desktop\\Jars\\chromedriver.exe");
	}
	
	@Test
	public void testOne()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
