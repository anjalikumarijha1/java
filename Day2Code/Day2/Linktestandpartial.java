package Day2Code.Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linktestandpartial {
	
	public static void main(String[] args) {
		
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://www.bing.com/");
		ff.manage().window().maximize();
		
//		ff.findElement(By.linkText("Office Online")).click();
		
		ff.findElement(By.partialLinkText("Online")).click();
		
		
		
	}

}
