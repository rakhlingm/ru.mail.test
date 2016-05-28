package ru.mail.test.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
import ru.mail.test.constants.Constants;
import ru.mail.test.drivers.WebDrivers;

public class LoginFireFox {

		Constants con = new Constants();
		WebDrivers wb = new WebDrivers();
		public void correctLogin(String user, String password, String  email) throws InterruptedException {
			WebDriver driver = wb.fireFoxDriver(con.url);
			driver.findElement(By.name("Login")).sendKeys(con.user);
			driver.findElement(By.name("Password")).sendKeys(con.password);
			driver.findElement(By.id("mailbox__auth__button")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Assert.assertTrue(driver.findElement(By.id("PH_user-email")).getText().equals(con.email));
			driver.close();
		}
		public void invalidLogin(String password, String  email) throws InterruptedException {
			WebDriver driver = wb.fireFoxDriver(con.url);
			driver.findElement(By.name("Login")).sendKeys("invalid");
			driver.findElement(By.name("Password")).sendKeys(con.password);
			driver.findElement(By.id("mailbox__auth__button")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			boolean element = true;
			try {
				if(driver.findElement(By.id("PH_user-email")).getText().equals(con.email))
					element = false;
			} catch (NoSuchElementException e) {
				element = true;
			}
			Assert.assertTrue(element);
			driver.close();
		}
		public void invalidPassword(String user, String  email) throws InterruptedException {
			WebDriver driver = wb.fireFoxDriver(con.url);
			driver.findElement(By.name("Login")).sendKeys(con.user);
			driver.findElement(By.name("Password")).sendKeys("invalid");
			driver.findElement(By.id("mailbox__auth__button")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			boolean element = true;
			try {
				if(driver.findElement(By.id("PH_user-email")).getText().equals(con.email))
					element = false;
			} catch (NoSuchElementException e) {
				element = true;
			}
			Assert.assertTrue(element);
			driver.close();
		}
		public void invalidLoginPassword(String  email) throws InterruptedException {
			WebDriver driver = wb.fireFoxDriver(con.url);
			driver.findElement(By.name("Login")).sendKeys("invalid");
			driver.findElement(By.name("Password")).sendKeys("invalid");
			driver.findElement(By.id("mailbox__auth__button")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			boolean element = true;
			try {
				if(driver.findElement(By.id("PH_user-email")).getText().equals(con.email))
					element = false;
			} catch (NoSuchElementException e) {
				element = true;
			}
			Assert.assertTrue(element);
			driver.close();
		}
		public void withoutLogin(String password, String  email) throws InterruptedException {
			WebDriver driver = wb.fireFoxDriver(con.url);
			driver.findElement(By.name("Login")).sendKeys("");
			driver.findElement(By.name("Password")).sendKeys(con.password);
			driver.findElement(By.id("mailbox__auth__button")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			boolean element = true;
			try {
				if(driver.findElement(By.id("PH_user-email")).getText().equals(con.email))
					element = false;
			} catch (NoSuchElementException e) {
				element = true;
			}
			Assert.assertTrue(element);
			driver.close();
		}
		public void withoutPassword(String user, String  email) throws InterruptedException {
			WebDriver driver = wb.fireFoxDriver(con.url);
			driver.findElement(By.name("Login")).sendKeys(con.user);
			driver.findElement(By.name("Password")).sendKeys("");
			driver.findElement(By.id("mailbox__auth__button")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			boolean element = true;
			try {
				if(driver.findElement(By.id("PH_user-email")).getText().equals(con.email))
					element = false;
			} catch (NoSuchElementException e) {
				element = true;
			}
			Assert.assertTrue(element);
			driver.close();
		}
		public void withoutLoginPassword(String  email) throws InterruptedException {
			WebDriver driver = wb.fireFoxDriver(con.url);
			driver.findElement(By.name("Login")).sendKeys("");
			driver.findElement(By.name("Password")).sendKeys("");
			driver.findElement(By.id("mailbox__auth__button")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			boolean element = true;
			try {
				if(driver.findElement(By.id("PH_user-email")).getText().equals(con.email))
					element = false;
			} catch (NoSuchElementException e) {
				element = true;
			}
			Assert.assertTrue(element);
			driver.close();
		}
		
}
