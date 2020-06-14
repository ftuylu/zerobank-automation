package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Account_ActivityPage extends BasePage {
    public Account_ActivityPage(){
        PageFactory.initElements(Driver.get(), this);
    }
    //@FindBy(linkText = "Account Activity")
    //public WebElement accountActivityBtn;

    @FindBy(id="aa_accountId")
        public WebElement dropDown;
    @FindBy(xpath = "//option[@value]")
        public List<WebElement> dropDownList;
    @FindBy (xpath = "//table/thead/tr/th")
        public List<WebElement> columNames;



}
