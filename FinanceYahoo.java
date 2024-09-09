package week4.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
						
		driver.get("https://finance.yahoo.com/ ");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		driver.manage().window().maximize();
		
		
		
		Actions action =new Actions(driver);
		
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("Cryp");
		
		WebElement crypto = driver.findElement(By.xpath("(//div/strong)[1]"));
		
		action.moveToElement(crypto).click().perform();
		
		int rowCount = driver.findElements(By.xpath("//div/table[@class='markets-table freeze-col yf-42jv6g fixedLayout']/tbody/tr")).size();
		
		System.out.println("Total number of Cyrpto currencies : "+rowCount);
		
		System.out.println("***************************************************************************");
		
		System.out.println("Crypto Names are :");
		
		for (int i = 1; i < rowCount; i++) {
			
			String cryptoNames = driver.findElement(By.xpath("//div/table[@class='markets-table freeze-col yf-42jv6g fixedLayout']/tbody/tr["+i+"]/td[1]")).getText();
			
			System.out.println(cryptoNames);
		}
		
		
		
		

	}

}
