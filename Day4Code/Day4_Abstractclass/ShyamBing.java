package Day4Code.Day4_Abstractclass;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShyamBing extends abstractssSearch {

	public String extractresult(String search) {
		// TODO Auto-generated method stub
		fd.findElement(By.id("sb_form_q")).sendKeys(search);
		fd.findElement(By.id("sb_form_go")).click();
		
		return fd.findElement(By.className("sb_count")).getText();	
	}

	
	public void Close() {
		// TODO Auto-generated method stub
		fd.close();
	}
	
	
}
