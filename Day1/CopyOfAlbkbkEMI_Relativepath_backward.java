package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyOfAlbkbkEMI_Relativepath_backward {

	public static void main(String[] args) {
		
//		open app
		//FirefoxDriver ff =new FirefoxDriver();
		String exePath = "D:\\software\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver ff = new ChromeDriver();
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
//		enter amount
		
//		ff.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/span/div/div[2]/div[1]/div[3]/input")).sendKeys("100000");
//		ff.findElement(By.xpath("//input[@name='principal']")).sendKeys("10000");
		ff.findElement(By.xpath("//input[@id='two']/../../../div[1]//input")).sendKeys("10000");
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
