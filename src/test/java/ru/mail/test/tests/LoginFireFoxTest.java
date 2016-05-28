package ru.mail.test.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ru.mail.test.constants.Constants;
import ru.mail.test.login.LoginFireFox;

public class LoginFireFoxTest {

	Constants con = new Constants();
	LoginFireFox login = new LoginFireFox();
	
	@Test
	public void correctLoginPassword() throws InterruptedException {
		login.correctLogin(con.user, con.password, con.email);
	}
	@Test
	public void invalidLogin() throws InterruptedException {
		login.invalidLogin(con.password, con.email);
	}
	@Test
	public void invalidPassword() throws InterruptedException {
		login.invalidLogin(con.user, con.email);
	}
	@Test
	public void invalidLoginPassword() throws InterruptedException {
		login.invalidLoginPassword(con.email);
	}
	@Test
	public void withoutLogin() throws InterruptedException {
		login.withoutLogin(con.password, con.email);
	}
	@Test
	public void withoutPassword() throws InterruptedException {
		login.withoutLogin(con.user, con.email);
	}
	@Test
	public void withoutLoginPassword() throws InterruptedException {
		login.withoutLoginPassword(con.email);
	}
}
