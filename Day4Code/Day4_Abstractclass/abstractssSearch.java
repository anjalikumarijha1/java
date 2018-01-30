package Day4Code.Day4_Abstractclass;

import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class abstractssSearch {
	
	
	
	FirefoxDriver fd;
	
	public void openApp(String Url) {
		// TODO Auto-generated method stub
		fd = new FirefoxDriver();
		fd.get(Url);
		fd.manage().window().maximize();
	}
	
	
	public abstract String extractresult(String search);
	
	
	
	public void Close() {
		// TODO Auto-generated method stub
		fd.close();
	}
	
	
	
	
	

}
