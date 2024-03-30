package Basepackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class browser extends PropertyFilesLoader {

    public static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<WebDriver>();

    public static WebDriver initiateDriver()  {

        String browserName = getPropertyValue("browser");
        System.out.println("The browser name is : "+browserName );

        if(browserName.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            threadLocalDriver.set(new ChromeDriver());
        }
        else if (browserName.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            threadLocalDriver.set(new FirefoxDriver());
        }

        else if (browserName.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            threadLocalDriver.set(new EdgeDriver());
        }
        else {
            System.out.println("The browser name entered is not correct "+browserName);
        }
        getmyDriver().manage().deleteAllCookies();
        getmyDriver().manage().window().maximize();
        getmyDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return getmyDriver();
    }

    public static synchronized WebDriver getmyDriver() {
        return threadLocalDriver.get();
    }

    public static WebDriver getDriver(){
        return initiateDriver();
    }

}
