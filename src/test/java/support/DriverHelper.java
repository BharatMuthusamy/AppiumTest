package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bharat on 14/12/2015.
 */
public class DriverHelper {

    public static final String DEFAULT_BROWSER = "Firefox";

    public static final String CHROME_DRIVER_LOCATION = System.getProperty("user.dir")+"/chromedriver/";

    public static final String browserName=System.getenv("BROWSER") != null ? System.getenv("BROWSER"): DEFAULT_BROWSER;

    public static WebDriver getDriverToUse(){
        return getDriverToUse(browserName);
    }

    public static WebDriver getDriverToUse(String browserName){
        WebDriver driver = null;

        if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }else if(browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOCATION);
            driver = new ChromeDriver();
        }
        return driver;
    }


}

