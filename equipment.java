package org.equp;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.input.Input;
import org.openqa.selenium.interactions.Actions;

public class equipment {

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
		WebElement Equipment = driver.findElement(By.xpath("//div[text()='Equipment']"));
		Equipment.click();

		Thread.sleep(3000);
//		WebElement add = driver.findElement(By.xpath("(//span[@class='v-btn__content'])[5]"));
//		add.click();
//		WebElement locationname = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
//		locationname.click();
//		WebElement locationnamee = driver.findElement(By.xpath("//div[text()='NEW LOC TEST']"));
//		locationnamee.click();
//		WebElement locationnameconfirm = driver.findElement(By.xpath("//span[text()='Confirm']"));
//		locationnameconfirm.click();
//		WebElement equipmentname = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
//		equipmentname.sendKeys("HHT Pannel");
//		WebElement equipmentcode = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
//		equipmentcode.sendKeys("008");
//		List<WebElement> forms = driver.findElements(By.cssSelector(".v-treeview-node__content"));
//		int count = forms.size();
//		System.out.println(count);
//		WebElement assetcategory = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
//		assetcategory.click();
//		WebElement assetcategoryy = driver.findElement(By.xpath("//div[text()='Fire and safety']"));
//		assetcategoryy.click();
//		WebElement assetcategoryconfirm = driver.findElement(By.xpath("(//span[text()='Confirm'])[2]"));
//		assetcategoryconfirm.click();
//		WebElement assetmanager = driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]"));
//		assetmanager.click();
//		WebElement assetmanagerr = driver.findElement(By.xpath("//div[text()='Manager']"));
//		assetmanagerr.click();
//		WebElement save = driver.findElement(By.xpath("//span[text()='Save']"));
//		save.click();

		// Edit the equipment
		WebElement editequip = driver.findElement(By.xpath("(//span[@class='v-btn__content'])[19]"));
		editequip.click();
		Actions actions = new Actions(driver);
		WebElement editdescription = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		actions.sendKeys(Keys.DELETE).perform();
		for (int i = 0; i < 4; i++) {
        editdescription.sendKeys(Keys.BACK_SPACE);
		}
		editdescription.clear();
		WebElement editdescriptionn = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		editdescriptionn.sendKeys("ram tester");
//		WebElement Assetowner = driver.findElement(By.xpath(""));
		Thread.sleep(5000);
		WebElement editradio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		Actions actionss = new Actions(driver);
		actionss.moveToElement(editradio).perform();
		WebElement savee = driver.findElement(By.xpath("//span[text()='Save']"));
		savee.click();

	}
}
