package com.class27;

public interface WebDriver {

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
	
}
class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Chrome driver open browser");	
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome driver close browser");	
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome driver maximize window");
	}

	@Override
	public void findElement() {
		System.out.println("Chrome driver find element");
	}
	
}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Firefox driver open browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Firefox driver close browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Firefox driver maximize window");
	}

	@Override
	public void findElement() {
		System.out.println("Firefox driver find element");
	}
	
}