package com.ignite.siscoolUI_pages;

import com.ignite.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_pg {

    public Login_pg(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id='isc_13']")
    public WebElement username;

    @FindBy (xpath = "//*[@id='isc_17']")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"isc_1D\"]")
    public WebElement loginas;

    @FindBy(id = "isc_PickListMenu_0_row_3")
    public WebElement staffMember;

    @FindBy(xpath = "//*[@id=\"isc_1M\"]/span")
    public WebElement rememberMe;

    @FindBy(xpath = "//div[@id='isc_M']//table//tbody//tr//td//td[1]")
    public WebElement loginbttn;

    @FindBy(xpath = "//*[@id=\"isc_Y\"]")
    public WebElement myWorkPlace;

    @FindBy(xpath = "//*[@id='isc_19']")
    public WebElement studentInfo;

    @FindBy(xpath = "//tbody/tr[5]/td[2]/div[contains(text(),\"Applications\")]")
    public WebElement applicationbtn;




}
