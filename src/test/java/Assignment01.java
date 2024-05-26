
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment01 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");
		
		
		
		
		
		
		
		
		
		
		//wait.until(ExpectedConditions.alertIsPresent());
		/*FileInputStream fis = new FileInputStream("./campaign.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String url = workbook.getSheet("virat").getRow(0).getCell(0).getStringCellValue();
		System.out.println(url);
        driver.get(url);
        driver.findElement(By.xpath("//span[text()='Login']")).click();
        driver.findElement(By.xpath("(//input[@class='mdc-text-field__input'])[1]")).sendKeys("9535420596");
        driver.findElement(By.xpath("(//input[@class='mdc-text-field__input'])[2]")).sendKeys("test@1234");
        driver.findElement(By.id("loginButton")).click();
        WebElement pofile = driver.findElement(By.xpath("//div[@class='dropdown-menu dropdown-menu-right']"));
       // WebElement profile = driver.findElement(By.xpath("//span[text()='Profile']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
	    //jse.executeScript("arguments[0].click()",pofile );
          jse.executeScript("window.scrollBy(100,1000)", "");
          TakesScreenshot tcs = (TakesScreenshot)driver;
          File tempfile = tcs.getScreenshotAs(OutputType.FILE);
          System.out.println(tempfile.getAbsolutePath());*/
          
        }

}
