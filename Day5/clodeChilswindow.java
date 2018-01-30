package Day5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class clodeChilswindow {
	
	public static void main(String[] args) {
		
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://in.rediff.com/");
		ff.manage().window().maximize();
		
		String parent = ff.getWindowHandle();
		
		Set<String> windowHandles = ff.getWindowHandles();
		
		Iterator<String> it = windowHandles.iterator();
		
		while(it.hasNext()){
			String handle = it.next();
			System.out.println(handle);
			if(!handle.equals(parent)){
				
				ff.switchTo().window(handle);
				System.out.println(ff.getTitle());
				System.out.println(ff.getCurrentUrl());
				ff.close();
				ff.switchTo().window(parent);
				
				
			}		
			
		}	
		
		
	}

}
