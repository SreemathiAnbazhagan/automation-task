package task.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajithkumar\\Desktop\\testing\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();	
		driver.get("https://www.atlassian.com/");
		Thread.sleep(4000);
		List<WebElement> listOfElement = driver.findElements(By.tagName("a"));
		for (WebElement eachlink:listOfElement) {
			System.out.println(eachlink.getText());
		}
		driver.findElement(By.xpath("/html/body/header/div/div[1]/div/div[1]/div[2]/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdown-f018b8eb\"]/div/div/div[1]/div/div/div[2]/div/a[2]")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/header/div/div[1]/div/div[1]/div[2]/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdown-f018b8eb\"]/div/div/div[1]/div/div/div[3]/div/a[3]")).click();
		Thread.sleep(4000);
		driver.close();
     }

   }
