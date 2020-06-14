package com.zerobank.stepdefinitions;
import com.zerobank.pages.Account_ActivityPage;
import com.zerobank.pages.Account_SummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        LoginPage loginPage=new LoginPage();
        loginPage.signinBtn.click();
    }

    @Given("the user enter the valid information")
    public void the_user_enter_the_valid_information() {
        LoginPage loginPage=new LoginPage();
        loginPage.userName.sendKeys("username");
        loginPage.password.sendKeys("password");
        loginPage.submit.click();
    }


    @When("the user logs in using {string} and {string} in following credentials")
    public void the_user_logs_in_using_and_in_following_credentials(String userType, String password) {
        LoginPage loginPage=new LoginPage();
        loginPage.login(userType,password);
    }

    @Then("{string} is displayed")
    public void is_displayed(String message) {
        LoginPage loginPage=new LoginPage();
        if(message.equals("Zero - Account Summary")){
            Assert.assertEquals("Verify title", message, Driver.get().getTitle());

        }else
            Assert.assertEquals(message,loginPage.errorMessage.getText());

    }


    @When("the user click page {string}")
    public void the_user_click_page(String expectedTitle) {
        Account_ActivityPage activityPage=new Account_ActivityPage();
        activityPage.accountActivityBtn.click();
        Assert.assertEquals(expectedTitle,activityPage.accountActivityBtn.getText());


        }

    @Then("the page is displayed {string}")
    public void the_page_is_displayed(String title) {
       // Account_ActivityPage activityPage=new Account_ActivityPage();

        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals("Verify title", title, actualTitle);

    }




}
