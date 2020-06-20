package com.ignite.eif_pages;

import com.ignite.utilities.BrowserUtils;
import com.ignite.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finish_Pg {
    public Finish_Pg() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id = "studenthdr1")
    public WebElement studentFullName;

    @FindBy(id = "studentyearinfo1")
    public WebElement academicYear;

    @FindBy(id = "studentgradeinfo1")
    public WebElement gradeLevel;

    @FindBy(id = "studentageinfo1")
    public WebElement studentAgeInfo;

    @FindBy(id = "tableSchools_1")
    public WebElement schoolTable;

    @FindBy(linkText = "Finish")
    public WebElement finish_Btn;

    @FindBy(xpath = "(//span[@data-langkey='ffinish'])[1]")
    public WebElement finishPageTitle;

    @FindBy(xpath = "//*[@id=\"reviewApplication\"]/section[1]/div[4]/span")
    public WebElement PEmail;

    @FindBy(xpath = "//*[@id=\"reviewApplication\"]/section[1]/div[5]/div[1]/span")
    public WebElement Parentphone;



}
