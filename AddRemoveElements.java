package elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddRemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepika\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement url = driver.findElement(By.xpath("//a[text()='Add/Remove Elements']"));
		wait.until(ExpectedConditions.visibilityOf(url));
		url.click();
		WebElement addElement = driver.findElement(By.xpath("//button[text()='Add Element']"));
		wait.until(ExpectedConditions.visibilityOf(addElement));
		//Adding multiple elements
		for(int i=0; i<5;i++) {
		addElement.click();
		}
		//removing multiple elements
		List<WebElement> delete = driver.findElements(By.xpath("//button[contains(text(),'Delete')]"));
		System.out.print(delete.size());
		for(WebElement e:delete) {
			e.click();
		}
		// deleting one element
//		WebElement delete = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
//		wait.until(ExpectedConditions.visibilityOf(delete));
//		if(delete.isDisplayed()) {
//			delete.click();
//		}
//		driver.close();
	}

}
