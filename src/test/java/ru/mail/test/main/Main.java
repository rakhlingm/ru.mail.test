package ru.mail.test.main;

import java.io.IOException;

import ru.mail.test.constants.Constants;
import ru.mail.test.drivers.WebDrivers;
import ru.mail.test.login.LoginFireFox;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		Constants con = new Constants();
		WebDrivers driver = new WebDrivers();
	//	driver.fireFoxDriver(con.url);
	//	driver.chromeDriver(con.url);
		LoginFireFox login = new LoginFireFox();
		login.correctLogin(con.user, con.password, con.email);
	}
}
