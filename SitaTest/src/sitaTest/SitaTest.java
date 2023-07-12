package sitaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SitaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//setting the driver executable
				System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");

				//WebElements
				WebDriver driver = new ChromeDriver();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				//open browser with desired URL
				driver.get("https://sitatesting.github.io/AutomationTest/index.html");
				driver.manage().window().maximize();
				System.out.println("Opened Test site");
				
				//Start
				WebElement caribbean = driver.findElement(By.xpath("//div[@class='col-lg-8 col-sm-7']"));
				js.executeScript("arguments[0].scrollIntoView(true);", caribbean);
				System.out.println("Scrolled down to Caribbean");
				Thread.sleep(2000);
				
				
				WebElement carExploreMore = driver.findElement(By.xpath("//a[@href='about.html']"));
				carExploreMore.click();
				System.out.println("Clicked on Explore more Next to Caribbean");
				Thread.sleep(2000);
				
				//WebElement kingston = driver.findElement(By.className("owl-next"));
				WebElement kingston = driver.findElement(By.xpath("//h4[contains(text(), 'Kingston')]"));
				js.executeScript("arguments[0].scrollIntoView(true);", kingston);
				System.out.println("Moved to Kingston");
				Thread.sleep(2000);
				
				WebElement kingstonMakeAReservation = driver.findElement(By.xpath("//a[@href='reservation.html']"));
				kingstonMakeAReservation.click();
				System.out.println("Clicked on Make A Reservation on Kingston");
				Thread.sleep(2000);
				
				WebElement yourNametxt = driver.findElement(By.name("Name"));
				WebElement phoneNumbertxt = driver.findElement(By.name("Number"));
				WebElement guests = driver.findElement(By.name("Guests"));
				WebElement checkInDate = driver.findElement(By.name("date"));
				WebElement destination = driver.findElement(By.name("Destination"));
				
				js.executeScript("arguments[0].scrollIntoView(true);", phoneNumbertxt);
				Thread.sleep(2000);
				yourNametxt.sendKeys("Thomas Comiskey");
				phoneNumbertxt.sendKeys("00353868496982");
				guests.sendKeys("2");
				checkInDate.sendKeys("15/07/2023");
				destination.sendKeys("Engaland, London");
				System.out.println("Filled in Reservation details");
				Thread.sleep(5000);
				
				WebElement makeYourReservationBtn = driver.findElement(By.cssSelector("button[class*='main-button']"));
				makeYourReservationBtn.click();
				System.out.println("Clicked Make Your Reservation Now button");
				
				Thread.sleep(2000);
				System.out.println("PASSED");

				//closing the browser
				driver.close();
				System.out.println("Browser Closed");
	}

}
