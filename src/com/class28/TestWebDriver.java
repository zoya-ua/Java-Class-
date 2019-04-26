package com.class28;

public class TestWebDriver {
	public static void main(String[] args) {
		WebDriver obj;
		obj=new ChromeDriver();
		obj.openBrowser();
		obj.closeBrowser();
		obj.maximizeWindow();
		obj.findElement();
		obj=new FirefoxDriver();
		obj.openBrowser();
		obj.closeBrowser();
		obj.maximizeWindow();
		obj.findElement();
		
		
	}

}
