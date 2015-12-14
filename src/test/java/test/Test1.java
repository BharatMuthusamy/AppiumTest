package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Bharat on 14/12/2015.
 */
public class Test1 {

    protected WebDriver driver;

    @Test
    public void test(){


        String driverToUse = System.getProperty("BROWSER","chrome");

        if(driverToUse.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }
        driver.get("http://google.co.uk");

        System.out.println("***********Console output message********");
        System.out.println(driver.getPageSource());
        driver.quit();
    }

}
