package ru.mail.test.tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import ru.mail.test.constants.Constants;
import ru.mail.test.login.LoginChrome;

public class LoginChromeTest {

	Constants con = new Constants();
	LoginChrome login = new LoginChrome();
	
	@Test
	public void correctLoginPassword() throws InterruptedException, IOException {
		login.correctLogin(con.user, con.password, con.email);
	}
	@Test
	public void invalidLogin() throws InterruptedException, IOException {
		login.invalidLogin(con.password, con.email);
	}
	@Test
	public void invalidPassword() throws InterruptedException, IOException {
		login.invalidLogin(con.user, con.email);
	}
	@Test
	public void invalidLoginPassword() throws InterruptedException, IOException {
		login.invalidLoginPassword(con.email);
	}
	@Test
	public void withoutLogin() throws InterruptedException, IOException {
		login.withoutLogin(con.password, con.email);
	}
	@Test
	public void withoutPassword() throws InterruptedException, IOException {
		login.withoutLogin(con.user, con.email);
	}
	@Test
	public void withoutLoginPassword() throws InterruptedException, IOException {
		login.withoutLoginPassword(con.email);
	}
}
