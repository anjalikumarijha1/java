package Day2Code.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlbkbkEMI_Absolutepath_Css {

	public static void main(String[] args) {
		
//		open app
		FirefoxDriver ff =new FirefoxDriver();
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
//		enter amount
//		ff.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/span/div/div[2]/div[1]/div[3]/input")).sendKeys("100000");		
//CSS
		ff.findElement(By.cssSelector("html>body>form>div:nth-of-type(3)>div:nth-of-type(1)>div:nth-of-type(2)>span>div>div:nth-of-type(2)>div:nth-of-type(1)>div:nth-of-type(3)>input")).sendKeys("100000");
		
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
