package com.optum.executor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    @BeforeTest
    public void browserStart() throws MalformedURLException {
        //WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
       //driver=new ChromeDriver(options);
        driver=new RemoteWebDriver(new URL("http://hub:4444/wd/hub"),options);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("https://www.google.com/");
    }

    @AfterTest
    public void browserClose()
    {
      driver.quit();
    }
}
