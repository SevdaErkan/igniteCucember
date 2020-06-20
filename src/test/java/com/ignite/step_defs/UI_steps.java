package com.ignite.step_defs;

import com.ignite.siscoolUI_pages.Applications_pg;
import com.ignite.siscoolUI_pages.Login_pg;
import com.ignite.utilities.BrowserUtils;
import com.ignite.utilities.ConfigReader;
import com.ignite.utilities.DBconnection;
import com.ignite.utilities.Driver;
import io.cucumber.java.en.*;

import static com.ignite.utilities.BrowserUtils.*;

public class UI_steps {
    Login_pg login_pg=new Login_pg();
    Applications_pg applications_pg=new Applications_pg();

    @Given("user get UI page with UIurl")
    public void user_get_UI_page_with_UIurl() {
        Driver.getDriver().get(ConfigReader.getKey("UIurl"));

    }

    @When("write username")
    public void write_username() {
        waitForClickablility(login_pg.username,20);
        login_pg.username.sendKeys("serkan");
    }
    @Then("write password")
    public void write_password() {
        waitForVisibility(login_pg.password,4);
       login_pg.password.sendKeys("S123456E");
    }
    @Then("click Staff Memeber")
    public void click_Staff_Memeber() {
        waitForVisibility(login_pg.staffMember,4);
        login_pg.staffMember.click();
    }
    @Then("click login button")
    public void click_login_button() {
        login_pg.loginbttn.click();
    }
    @Then("click log in as button")
    public void click_log_in_as_button() {
       login_pg.loginas.click();
    }

    @Then("click studend information")
    public void click_studend_information() {
        waitForVisibility(login_pg.studentInfo,20);
        login_pg.studentInfo.click();
    }



    @Then("click applications button")
    public void click_applications_button() {
        waitForVisibility(login_pg.applicationbtn,20);
        login_pg.applicationbtn.click();
    }

    @When("click my work place")
    public void click_my_work_place() {
        waitFor(7);
       login_pg.myWorkPlace.click();
    }





    @Then("user verify parent firstname")
    public void user_verify_parent_firstname() {
        BrowserUtils.waitFor(4);
       applications_pg.user_check_parent_first_name(1,6);

    }

    @Then("user select parent firstName  and parentIdfrom studentapplications")
    public void user_select_parent_firstName_and_parentIdfrom_studentapplications() {
    DBconnection.SQLquery("select firstName, parentId from stdApplications","parentName","parentId");

    }



}
