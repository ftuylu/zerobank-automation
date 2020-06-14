package com.zerobank.stepdefinitions;

import com.zerobank.pages.Account_ActivityPage;
import com.zerobank.pages.Account_SummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Account_Activity_Defs {

    @Then("Account activity page should be displayed")
    public void account_activity_page_should_be_displayed() {
        Account_ActivityPage activityPage= new Account_ActivityPage();
        activityPage.accountActivityBtn.click();
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        System.out.println("actual title:"+actualTitle);
        Assert.assertEquals("Verify title", "Zero - Account Activity", actualTitle);

    }

    @Then("Account drop down default option should be savings")
    public void account_drop_down_default_option_should_be_savings() {
       Account_ActivityPage activityPage= new Account_ActivityPage();
        //activityPage.accountActivityBtn.click();
        BrowserUtils.waitFor(3);
        Select select= new Select(activityPage.dropDown);
        String actualdrop= select.getFirstSelectedOption().getText();
        System.out.println("actualdrop:"+actualdrop);
        Assert.assertEquals("verify the default drop down","Savings",actualdrop);
    }
    @Then("Account drop down have following options")
    public void account_drop_down_have_following_options(List<String> dropdownList) {
        BrowserUtils.waitFor(2);
        Account_ActivityPage activityPage=new Account_ActivityPage();
        List<String> actualOptions = BrowserUtils.getElementsText(activityPage.dropDownList);

        Assert.assertEquals("Verify the menu elements",dropdownList,actualOptions);
    }

    @Then("Transaction table have following column names")
    public void transaction_table_have_following_column_names(List<String> colnames) {
        BrowserUtils.waitFor(2);
        Account_ActivityPage activityPage=new Account_ActivityPage();
        List<String> actualOptions = BrowserUtils.getElementsText(activityPage.columNames);

        Assert.assertEquals("Verify the menu elements",colnames,actualOptions);

    }


}
