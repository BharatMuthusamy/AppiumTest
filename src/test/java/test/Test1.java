package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Bharat on 14/12/2015.
 */
public class Test1 {

    @Test
    public void test(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://beta.prospects.co.uk");
        System.out.println(driver.getPageSource());
    }

}
