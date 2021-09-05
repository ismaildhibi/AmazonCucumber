package com.redsea.base;

import com.Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;
    public static Properties props = new Properties();
    public static LoginPage login;

    public static void lunchBrowser() throws IOException {

        File file = new File(
                "src/test/java/com/properties/config.properties");
        FileInputStream fis = new FileInputStream(file);
        props.load(fis);

        if (props.getProperty("browser").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (props.getProperty("browser").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get(props.getProperty("url"));
        driver.manage().window().maximize();
        System.out.println("the navigator is : "+props.getProperty("browser"));
 
    }
}
