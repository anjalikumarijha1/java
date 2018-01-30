package Day12;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AlbkbkEMI {

	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability("browserName", "chrome");
		dcap.setCapability("version", "46");
		dcap.setCapability("platform", "WINDOWS");
		
		WebDriver ff = new RemoteWebDriver(new URL("http://192.168.0.101:4444/wd/hub"),dcap);
		
		
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
//		enter amount
		ff.findElement(By.id("one")).sendKeys("100000");		
//		enter rate
		ff.findElement(By.id("two")).sendKeys("10");		
//		enter tenure
		ff.findElement(By.name("instalment")).sendKeys("120");	
//		click on calculate
		ff.findElement(By.name("B1")).click();
		
//		extract EMI
		String act_output = ff.findElement(By.id("four")).getAttribute("value");
		System.out.println(act_output);
//		close app
		ff.close();
		
		
		
		
		
		
		
	}	
	
}
