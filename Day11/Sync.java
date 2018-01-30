package Day11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync {	
	
public static void main(String[] args) {		
//		open app
		FirefoxDriver ff =new FirefoxDriver();
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
//		implicit wait
		ff.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
//		enter amount
		ff.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/span/div/div[2]/div[1]/div[3]/input")).sendKeys("100000");		
//		enter rate
		ff.findElement(By.id("two")).sendKeys("10");		
//		enter tenure
		ff.findElement(By.name("instalment")).sendKeys("120");	
//		click on calculate
		ff.findElement(By.name("B1")).click();
		
//		Explicit wait
		WebDriverWait wait = new WebDriverWait(ff,60);
		wait.until(ExpectedConditions.visibilityOf(ff.findElement(By.id("four"))));
		
//		extract EMI
		String act_output = ff.findElement(By.id("four")).getAttribute("value");
				
		System.out.println(act_output);
//		close app
		ff.close();		
		
		
	}	
	

}
