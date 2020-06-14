package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Account_SummaryPage extends BasePage{
    public Account_SummaryPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//h2[@class='board-header']")
    public List<WebElement> accountSummarymenu;

    @FindBy(xpath = "(//table)[3]//th")
    public List<WebElement> creditAccountColumns;
}
