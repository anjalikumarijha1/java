package Day5;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dropdown {
	
	public static void main(String[] args) {
		
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("https://www.carwale.com/");
		ff.manage().window().maximize();	
		
		ff.findElement(By.xpath("//li[@data-tabs='usedCars']")).click();
		ff.findElement(By.id("budgetBtn")).click();
		System.out.println(ff.findElement(By.xpath("//ul[@id='minPriceList']/li[2]")).getText());
		List<WebElement> options = ff.findElements(By.xpath("//ul[@id='minPriceList']/li"));
		
		
		Iterator<WebElement> it = options.iterator();
		while(it.hasNext()){
			
			WebElement ele = it.next();
			
			System.out.println(ele.getText());
			
		}
		
		
		
		
		
		
	}

}





