package Day2Code.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyOfAlbkbkEMI_Relativepath_operation {

	public static void main(String[] args) {
		
//		open app
		FirefoxDriver ff =new FirefoxDriver();
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
//		enter amount
//		Xpath And Operation
//		ff.findElement(By.xpath("//input[@name='principal' and @size='20']")).sendKeys("10000");
//		Css  And Operation
//		ff.findElement(By.cssSelector("input[name='principal'][size='20']")).sendKeys("10000");
		
		//		Xpath OR operation
//		ff.findElement(By.xpath("//input[@name='principal' or @size='20']")).sendKeys("10000");
		
//		Css OR Operation
		ff.findElement(By.cssSelector("input[name='principal'],input[size='20'][id='one']")).sendKeys("10000");
		
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
