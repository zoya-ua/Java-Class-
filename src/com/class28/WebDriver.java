package com.class28;

public interface WebDriver {
	void openBrowser();
	void closeBrowser(); 
	void maximizeWindow(); 
	void findElement();

}
class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
	System.out.println("Open ChromeDriver");
		
	}

	@Override
	public void closeBrowser() {
	
		System.out.println("Close ChromeDriver");
		
	}

	@Override
	public void maximizeWindow() {
		
		System.out.println("Maximize window with ChromeDriver");
		
	}

	@Override
	public void findElement() {
		
		System.out.println("Find element with ChromeDriver");
			
	}
	
}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
	System.out.println("Open FirefoxDriver");
		
	}

	@Override
	public void closeBrowser() {
	
		System.out.println("Close FirefoxDriver");
		
	}

	@Override
	public void maximizeWindow() {
		
		System.out.println("Maximize window with FirefoxDriver");
		
	}

	@Override
	public void findElement() {
		
		System.out.println("Find element with WebDriver");
		
	}
	
}

