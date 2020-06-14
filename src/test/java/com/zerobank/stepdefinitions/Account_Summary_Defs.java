package com.zerobank.stepdefinitions;

import com.zerobank.pages.Account_SummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Account_Summary_Defs {

    @When("Account Summary Page should have to following account types")
    public void account_Summary_Page_should_have_to_following_account_types(List<String> account_Summarymenu) {
        BrowserUtils.waitFor(2);
        Account_SummaryPage account_summaryPage=new Account_SummaryPage();
        //get the list of webelement and convert them to list of string with the help of ready method.
        List<String> actualOptions = BrowserUtils.getElementsText(account_summaryPage.accountSummarymenu);

       Assert.assertEquals("Verify the menu elements",account_Summarymenu,actualOptions);


    }

    @When("Credit account table have following columns")
    public void credit_account_table_have_following_columns(List<String > columns) {
        BrowserUtils.waitFor(2);
        Account_SummaryPage account_summaryPage=new Account_SummaryPage();
        List<String> actualOptions=BrowserUtils.getElementsText(account_summaryPage.creditAccountColumns);
        Assert.assertEquals("Verify the menu elements",columns,actualOptions);
       // System.out.println("actual:"+actualOptions);
       //System.out.println("menu options:"+columns);
    }

}
