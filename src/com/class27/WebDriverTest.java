package com.class27;

public class WebDriverTest {

	public static void main(String[] args) {
		
		WebDriver driver1=new ChromeDriver();
		driver1.openBrowser();
		driver1.closeBrowser();
		driver1.maximizeWindow();
		driver1.findElement();
		
		WebDriver driver2=new FirefoxDriver();
		driver2.openBrowser();
		driver2.closeBrowser();
		driver2.maximizeWindow();
		driver2.findElement();

	}

}
