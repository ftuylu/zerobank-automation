package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class PayBills_StepDef {

    @When("the user enter payee dropdownBox")
    public void the_user_enter_payee_dropdownBox() {
        BrowserUtils.waitFor(2);
        PayBillsPage payBillsPage=new PayBillsPage();
        payBillsPage.payeeDropdown.click();
    }

    @When("the user enter account dropdownbox")
    public void the_user_enter_account_dropdownbox() {
        BrowserUtils.waitFor(2);
        PayBillsPage payBillsPage=new PayBillsPage();
        payBillsPage.AccountDropdown.click();

    }

    @When("the user enter amount box")
    public void the_user_enter_amount_box() {
        BrowserUtils.waitFor(2);
        PayBillsPage payBillsPage=new PayBillsPage();
        payBillsPage.amountBox.sendKeys("100");

    }

    @When("the user enter date box")
    public void the_user_enter_date_box() {
        BrowserUtils.waitFor(2);
        PayBillsPage payBillsPage=new PayBillsPage();
        payBillsPage.dateBox.sendKeys("2020-06-09");

    }

    @When("the user enter description")
    public void the_user_enter_description() {
        BrowserUtils.waitFor(2);
        PayBillsPage payBillsPage=new PayBillsPage();
        payBillsPage.descriptionbox.sendKeys("Trying savings");

    }

    @When("the user enter submit button")
    public void the_user_enter_submit_button() {
        BrowserUtils.waitFor(2);
        PayBillsPage payBillsPage=new PayBillsPage();
        payBillsPage.payBtn.sendKeys(Keys.ENTER);

    }

    @Then("the message The payment was successfully submitted should be displayed")
    public void the_message_The_payment_was_successfully_submitted_should_be_displayed() {
        BrowserUtils.waitFor(2);
        PayBillsPage payBillsPage=new PayBillsPage();
        String expectedStr="The payment was successfully submitted.";
        Assert.assertEquals(expectedStr,payBillsPage.payBillAlert.getText());
    }
    @When("the user enter amount box empty")
    public void the_user_enter_amount_box_empty() {
        BrowserUtils.waitFor(2);
        PayBillsPage payBillsPage=new PayBillsPage();
        payBillsPage.amountBox.sendKeys(" ");

    }

    @Then("the alert message displays Please fill in this field")
    public void the_alert_message_displays_Please_fill_in_this_field() {
        PayBillsPage payBillsPage=new PayBillsPage();
        WebElement field = payBillsPage.amountBox;
        JavascriptExecutor js = (JavascriptExecutor)Driver.get();
        Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", field);
        String message = (String)js.executeScript("return arguments[0].validationMessage;", field);
        //String message = payBillsPage.amountBox.getAttribute("validationMessage");
        System.out.println("Message:"+message);



    }


}
