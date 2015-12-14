package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Bharat on 14/12/2015.
 */
public class Test1 {

    protected WebDriver driver;

    @Test
    public void test() {


        String driverToUse = System.getenv("BROWSER") != null ? System.getenv("BROWSER") : System.setProperty("BROWSER", "Firefox");
        System.out.println(driverToUse);
        //String driverToUse = "Chrome";

        if (driverToUse.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }else if(driverToUse.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver/");
            driver = new ChromeDriver();
        }
            driver.get("http://google.co.uk");

            System.out.println("***********Console output message********");
            System.out.println(driver.getTitle());
            driver.quit();
        }

    }
