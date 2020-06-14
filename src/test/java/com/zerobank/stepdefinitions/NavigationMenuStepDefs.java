package com.zerobank.stepdefinitions;

import com.zerobank.pages.Account_ActivityPage;
import com.zerobank.pages.Account_SummaryPage;
import com.zerobank.pages.BasePage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NavigationMenuStepDefs {
    @Then("the user navigates to Account Summary page")
    public void the_user_navigates_to_Account_Summary_page() {
        new BasePage().accountSummaryBtn.click();
    }

    @Then("the user navigates to Account Activity page")
    public void the_user_navigates_to_Account_Activity_page() {
        new BasePage().accountActivityBtn.click();
    }

    @Then("the user navigates to Account Pay Bills page")
    public void the_user_navigates_to_Account_Pay_Bills_page() {
        new BasePage().payBillsBtn.click();
    }

    @Then("the user navigates to Transfer Funds page")
    public void the_user_navigates_to_Transfer_Funds_page() {
        new BasePage().transferFundsBtn.click();
    }
    @Then("the user navigates to following {string}")
    public void the_user_navigates_to_following(String page) {
        switch (page){
            case "Account Summary":
                new BasePage().accountSummaryBtn.click();
                break;
            case "Account Activity":
                new BasePage().accountActivityBtn.click();
                break;
            case "Account Pay Bills":
                new BasePage().payBillsBtn.click();
                break;
            case "Transfer Funds":
                new BasePage().transferFundsBtn.click();

        }

    }
    @Then("the title should be following {string}")
    public void the_title_should_be_following(String title) {
        switch (title){
            case "Zero - Account Summary":
                Account_SummaryPage summaryPage= new Account_SummaryPage();
                summaryPage.accountSummaryBtn.click();
                String actualTitle = Driver.get().getTitle();
                Assert.assertEquals("Verify title", title, actualTitle);
                break;
            case "Zero - Account Activity":
                Account_ActivityPage activityPage= new Account_ActivityPage();
                activityPage.accountActivityBtn.click();
                String actualTitle1= Driver.get().getTitle();
                Assert.assertEquals("Verify title", title, actualTitle1);
                break;
            case "Zero - Pay Bills":
                PayBillsPage payBillsPage=new PayBillsPage();
                payBillsPage.payBillsBtn.click();
                String actualStr2 = Driver.get().getTitle();
                Assert.assertEquals("Verify the title",title,actualStr2);
                break;
        }
    }
}
