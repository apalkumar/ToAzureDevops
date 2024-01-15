package com.test.maenprj;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mavenprj.App;

public class AppTest {

	@Test
	public void logincheck() {
		App ap = new App();
		Assert.assertEquals(0,ap.userLOgin("abc", "abc123"));
	}
	
	@Test
	public void logincheck1() {
		App ap = new App();
		Assert.assertEquals(1,ap.userLOgin("abc", "abc@123"));
	}
}
