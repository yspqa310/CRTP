package Basepackage;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


public class Hooks {
    WebDriver driver;
    @Before
    public void launchUrl(){
        driver = browser.initiateDriver();
        driver.get(PropertyFilesLoader.getPropertyValue("url"));
    }
}
