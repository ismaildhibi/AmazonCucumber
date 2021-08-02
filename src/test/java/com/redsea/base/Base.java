package com.redsea.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties props = new Properties();

	public static void lunchdriver() throws IOException {
		File file = new File(
				"C:/Users/ismail/eclipse-workspace/RedSea-PageFactory/src/test/java/properties/config.properties");
		FileInputStream fis = new FileInputStream(file);
		props.load(fis);
//		if (props.getProperty("browser").equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		} else if (props.getProperty("browser").equalsIgnoreCase("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//
//		}
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get(props.getProperty("url"));
		System.out.println(props.getProperty("browser"));
	}
}
