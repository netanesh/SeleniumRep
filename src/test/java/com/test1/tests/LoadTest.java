package com.test1.tests;



import java.util.concurrent.TimeUnit;



//--
import org.openqa.selenium.By;
//--
import org.openqa.selenium.WebDriver;
//--
import org.openqa.selenium.WebElement;
//--
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
//--
import org.testng.Assert;
//--
import org.testng.annotations.AfterClass;
//--
import org.testng.annotations.BeforeClass;
//--
import org.testng.annotations.Test;

public class LoadTest {

    private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
//        FirefoxProfile profile = new FirefoxProfile();
//        
//        String PROXY = "gproxy.corp.amdocs.com:8080";
//
//        org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
//
//        proxy.setHttpProxy(PROXY).setFtpProxy(PROXY).setSslProxy(PROXY);
//
//        DesiredCapabilities cap = new DesiredCapabilities();
//
//        cap.setCapability(CapabilityType.PROXY, proxy); 
//
//         driver = new FirefoxDriver(cap);
//        
        
        
//        
//        profile.setPreference("network.proxy.type", 1);
//        profile.setPreference("network.proxy.socks", "gproxy.corp.amdocs.com");
//        profile.setPreference("network.proxy.socks_port", 8080);
        driver = new FirefoxDriver();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test
    public void verifySearchButton() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/?hl=en");

        String search_text = "Google Search";
        WebElement search_button = driver.findElement(By.name("btnK"));

        String text = search_button.getAttribute("value");

        Assert.assertEquals(text, search_text, "Text not found!");
    }
}
