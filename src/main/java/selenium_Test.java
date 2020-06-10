//package com.mf.seleniumsrl;



import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium_Test
{
  //  private static WebDriver driver;


    //WebDriver driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());

    @BeforeClass
    public static void setUpBeforeClass()
            throws Exception
    {


       // driver = new ChromeDriver();
    }

    @AfterClass
    public static void setUpAfterClass()
            throws Exception
    {
        //driver.quit();
    }

    @Test
    public void Home_Page()
            throws Exception
    {
        //driver.navigate().to("http://www.hpe.com");

        System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

       // Dwebdriver.chrome.driver=

        driver.navigate().to("http://www.microfocus.com");

        /* driver.manage().window().maximize(); */
        String x = driver.getTitle();

        System.out.println(x);




      //Assert.assertTrue("Homepage Title Name", driver.findElement(By.visibleText("Our Top-Trending Digital Transformation Solutions"));

        //        driver.findElement(By.visibleText("Our Top-Trending Digital Transformation Solutions"));

        Assert.assertTrue("Homepage Title Name", driver.getTitle().startsWith("Digital Transformation and Enterprise Software Modernization | Micro Focus"));

     //   WebDriverWait wait = new WebDriverWait(driver, 60L);


       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV/DIV/DIV/DIV/DIV/A[normalize-space()=\"Support\"]")));

        //driver.findElement(By.xpath("//DIV/DIV/DIV/DIV/DIV/A[normalize-space()=\"Support\"]")).click();

       //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //DIV[@id=\"support-product\"]/DIV/DIV/DIV/H2[normalize-space()=\"We're Here for You\"]")));




    }
}



