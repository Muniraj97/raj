package org.excute;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.page.LoginPage;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBaseClass {
	public static SeleniumBaseClass Baseclass=new SeleniumBaseClass();
	public static LoginPage login;
	public static WebDriver driver;
	@BeforeClass
	public static void Browserlaunch() {
	Baseclass.initCondition();
	Baseclass.luanchUrl("https://www.bookswagon.com/");
	Baseclass.maximize();
		 login =new LoginPage();
		 WebElement myAccount = login.getMyAccount();
		 Baseclass.SeleniumByJse(myAccount);
		WebElement userId = login.getUserId();
		Baseclass.SeleniumByJava(userId,"9597126845");
		WebElement userPassword = login.getUserPassword();
		Baseclass.SeleniumByJava(userPassword,"muni@55");
		WebElement clickLogin = login.getClickLogin();
		Baseclass.SeleniumByJse(clickLogin);
		Baseclass.navigate();
		WebElement clickFictionBook = login.getClickFictionBook();
		Baseclass.SeleniumByJse(clickFictionBook);
	    Baseclass.navigate();
	    WebElement addBook1 = login.getAddBook1();
	    Baseclass.doubleActions(addBook1);
	   WebElement addBook3 = login.getAddBook3();
	   Baseclass.SeleniumByJse(addBook3);
	   Baseclass.EnterBook();
	   WebElement clickCartButton = login.getClickCartButton();
	   Baseclass.SeleniumByJse(clickCartButton);
	   Baseclass.navigate();
	}
	public void initCondition() {
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	}
	public void luanchUrl(String Url) {
		driver.get(Url);
	}
public  void maximize() {
	driver.manage().window().maximize();

}
public void SeleniumByJava(WebElement element,String Key) {
	element.sendKeys(Key);

}
public void SeleniumByJse(WebElement element) {
	element.click();
}
public void navigate() {
	driver.navigate();

}
public void EnterBook() {
	try {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	} catch (Exception e) {
	
	}
}
	public  void doubleActions(WebElement element) {
	try {
		Actions ac=new Actions(driver);
		ac.doubleClick(element).perform();
		
	} catch (Exception e) {

	}
	}
	
public void Waits() {
	try {
		Thread.sleep(3000);
	} catch (Exception e) {
	}
	

}
	}
	


	


	

	


