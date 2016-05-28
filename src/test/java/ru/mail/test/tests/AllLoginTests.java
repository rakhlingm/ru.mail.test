package ru.mail.test.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LoginChromeTest.class, LoginFireFoxTest.class })
public class AllLoginTests {

}
