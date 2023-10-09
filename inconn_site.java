package org.site;

import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InconnSite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramnivas R\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testing.inconn.in:8080/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement usernameField = driver.findElement(By.xpath("//input[@id='input-17']"));
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='input-20']"));
		usernameField.sendKeys("test@inconn.com");
		passwordField.sendKeys("Wynwy@123");
		WebElement loginButton = driver.findElement(By.xpath("//span[text()='Login']"));
		loginButton.click();

		WebElement site = driver.findElement(By.xpath("//div[text()='Business Setup']"));
		site.click();
		WebElement scroll = driver.findElement(By.xpath("//div[text()='Maintenance Setup']"));
		JavascriptExecutor scrollsite = (JavascriptExecutor) driver;
		scrollsite.executeScript("arguments[0].scrollIntoView(true)", scroll);

		WebElement sitem = driver.findElement(By.xpath("//div[text()='Site']"));
		sitem.click();

//		WebElement Button = driver.findElement(By.xpath("//span[text()='Add']"));
//		Button.click();
//
//		Thread.sleep(2000);
//		WebElement sitename = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		sitename.sendKeys("IITM");
//		WebElement sitcode = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//		sitcode.sendKeys("007");
//		WebElement sitezone = driver.findElement(By.xpath("(//button[@type='button'])[15]"));
//		sitezone.click();
//		Thread.sleep(2000);
//		WebElement sitezonee = driver.findElement(By.xpath("(//button[@type='button'])[17]"));
//		sitezonee.click();
//		WebElement sitezoneselect = driver.findElement(By.xpath("(//button[@type='button'])[19]"));
//		sitezoneselect.click();
//		WebElement sitezonesave = driver.findElement(By.xpath("(//span[@class='v-btn__content'])[14]"));
//		sitezonesave.click();
//		WebElement sitedescription = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
//		sitedescription.sendKeys("testing");
//		WebElement siteaddress = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
//		siteaddress.sendKeys("A07 wynwy technilogies");
//		WebElement sitecountry = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
//		sitecountry.sendKeys("india");
//		WebElement sitestate = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
//		sitestate.sendKeys("tamilnadu");
//		WebElement sitecity = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
//		sitecity.sendKeys("chennai");
//		WebElement sitetimezone = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
//		sitetimezone.click();
//		WebElement sitetimezonee = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
//		sitetimezonee.sendKeys("Asia/Kolkata UTC+5:30");
//		WebElement sitetimezoneee = driver.findElement(By.xpath("(//div[@class='v-list-item__title'])[11]"));
//		sitetimezoneee.click();
//		WebElement sitefirstname = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
//		sitefirstname.sendKeys("ram");
//		WebElement sitelastname = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
//		sitelastname.sendKeys("nivas");
//		WebElement sitedesignation = driver.findElement(By.xpath("(//input[@type='text'])[15]"));
//		sitedesignation.sendKeys("tester");
//		WebElement siteemail = driver.findElement(By.xpath("(//input[@type='text'])[16]"));
//		siteemail.sendKeys("ramnivasr1318@gmail.com");
//		WebElement sitemobile = driver.findElement(By.xpath("(//input[@type='text'])[17]"));
//		sitemobile.sendKeys("9944530726");
//		WebElement savesite = driver.findElement(By.xpath("(//span[@class='v-btn__content'])[12]"));
//		savesite.click();

		// Edit the equipment
		Thread.sleep(5000);
		WebElement editsite = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(editsite).perform();
		editsite.click();
		WebElement editsitee = driver.findElement(By.xpath("//span[text()='Edit']"));
		editsitee.click();
		Actions actions = new Actions(driver);
		WebElement editdescription = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		actions.sendKeys(Keys.DELETE).perform();
		for (int i = 0; i < 4; i++) {
			editdescription.sendKeys(Keys.BACK_SPACE);
		}
		editdescription.clear();
		WebElement editdescriptionn = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		editdescriptionn.sendKeys("ram tester");
		WebElement Assetowner = driver.findElement(By.xpath(""));
		Thread.sleep(5000);
		WebElement editradio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		Actions actionss = new Actions(driver);
		actionss.moveToElement(editradio).perform();
		WebElement savee = driver.findElement(By.xpath("//span[text()='Save']"));
		savee.click();

	}
}
