package Day12;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertss {
	
	
	 @Test
	  public void f() {
//		 open app
			FirefoxDriver ff =new FirefoxDriver();
			ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
			SoftAssert Assert = new SoftAssert();
			Assert.assertEquals("EMI", ff.getTitle());
			
//			enter amount
			ff.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/span/div/div[2]/div[1]/div[3]/input")).sendKeys("100000");		
//			enter rate
			ff.findElement(By.id("two")).sendKeys("10");		
//			enter tenure
			ff.findElement(By.name("instalment")).sendKeys("120");	
//			click on calculate
			ff.findElement(By.name("B1")).click();
			Assert.assertFalse(true);
//			extract EMI
			String act_output = ff.findElement(By.id("four")).getAttribute("value");
			System.out.println(act_output);
//			close app
			ff.close();		  
		  
		  Assert.assertAll();
		  
	  } 
	
}
