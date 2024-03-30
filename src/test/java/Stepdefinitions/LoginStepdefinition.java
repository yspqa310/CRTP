package Stepdefinitions;
import Basepackage.*;
import Pages.LoginPage;
import io.cucumber.java.en.*;
public class LoginStepdefinition {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        LoginPage lp = new LoginPage(browser.getDriver());
        lp.clickOnLogin();
    }
}
