package Day2Code.Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoosearch {
	
	public static void main(String[] args) {
		
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("https://search.yahoo.com/");
		ff.manage().window().maximize();
		
		
		ff.findElement(By.tagName("input")).sendKeys("selenium");
		ff.findElement(By.className("sbb")).click();
//		one way
//		String output = ff.findElement(By.xpath("//div[@class='compPagination']/span")).getText();
		
		
//		second way Xpath using contains
		String output = ff.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
		
		
		
		System.out.println(output);
		
		
		
		
		
	}	

}
