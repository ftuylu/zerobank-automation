package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PayBillsPage extends BasePage{
    public PayBillsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id ="sp_payee" )
    public WebElement payeeDropdown;

    @FindBy(xpath = "//select[@name='payee']/option")
    public List<WebElement> payeeDropdownLst;

    @FindBy(id = "sp_account")
    public WebElement AccountDropdown;

    @FindBy(xpath = "//select[@name='account']/option")
    public List<WebElement> AccountDropdownLst;

    @FindBy(id= "sp_amount")
    public WebElement amountBox;

    @FindBy(id = "sp_date")
    public  WebElement dateBox;

    @FindBy(id = "sp_description")
    public WebElement descriptionbox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement payBtn;

    @FindBy(id = "alert_content")
    public WebElement payBillAlert;








}

