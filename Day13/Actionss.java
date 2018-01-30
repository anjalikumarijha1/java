package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {
	
	public static void main(String[] args) throws Exception {		
			
			FirefoxDriver ff =new FirefoxDriver();
			ff.get("https://www.burbank.com.au/victoria");
			ff.manage().window().maximize();
			
			Actions act = new Actions(ff);
			WebElement aboutburbank = ff.findElement(By.id("p_lt_ctl01_Submenunav_lblaboutburbank"));
			WebElement awards = ff.findElement(By.xpath("//li[@id='p_lt_ctl01_Submenunav_about_awards']/a/span[1]"));
			
//			mouse events
			act.moveToElement(aboutburbank).perform();
			
			Thread.sleep(3000);
			
			act.moveToElement(awards).click().build().perform();
		
//			keyboard events
			act.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.chord(Keys.CONTROL,"a")).build().perform();
		
		
		
		
	}

}
