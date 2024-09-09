package week4.homeassignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.id("ext-gen643")).click();
		
		driver.findElement(By.id("ext-gen862")).click();
		
		driver.findElement(By.id("ext-gen601")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> window = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(window.get(1));
		
		driver.findElement(By.id("ext-gen305")).click();
		
		driver.switchTo().window(window.get(0));
		
		driver.findElement(By.id("ext-gen599")).click();
		
		
		
		
		

	}

}
