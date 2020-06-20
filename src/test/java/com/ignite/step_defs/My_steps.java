package com.ignite.step_defs;

import com.ignite.eif_pages.*;
import com.ignite.pojos.Parent;
import com.ignite.pojos.Student;

import static com.ignite.utilities.BrowserUtils.*;
import static org.junit.Assert.assertEquals;

import com.ignite.utilities.BrowserUtils;
import com.ignite.utilities.ConfigReader;
import com.ignite.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


public class My_steps {
    Parent myParent = new Parent();
    Student myStudent = new Student();

    Introduction_Pg introduction_pg=new Introduction_Pg();
    Parent_Pg ppObj = new Parent_Pg();
    Student_Pg spObj = new Student_Pg();
    Schools_Pg sclpObj = new Schools_Pg();
    Finish_Pg fpObj = new Finish_Pg();
    Confirmation_Pg cpObj = new Confirmation_Pg();


    @Given("user get EnrollmentInquiryForm page with url")
    public void user_get_EnrollmentInquiryForm_page() {
        Driver.getDriver().get(ConfigReader.getKey("url"));
    }

    @Given("user get EnrollmentInquiryForm page with no intro url")
    public void user_get_EnrollmentInquiryForm_page_with_no_intro_url() {
        Driver.getDriver().get(ConfigReader.getKey("noIntro"));
    }

    @When("When user click on accept check")
    public void when_user_click_on_accept_check() {

        waitFor(6);
        introduction_pg.acceptButton.click();
    }


    @When("user click on next button")
    public void user_click_on_next_button() {
        waitForVisibility(introduction_pg.next_Btn, 4);
        introduction_pg.next_Btn.click();

    }
    @Then("user go to parent page")
    public void user_go_to_parent_page() {
        ppObj.next_Btn.click();



    }
    @Then("verify go to next page")
    public void verify_go_to_next_page() {
        waitForVisibility(ppObj.parentPageTitle,10);
        Assert.assertEquals(introduction_pg.pageVerify("parent"),ppObj.parentPageTitle);

    }

    @When("write parent first name")
    public void write_parent_first_name() {
        waitForVisibility(ppObj.parentFirstName,10);
      ppObj.parentFirstName.sendKeys(myParent.firstName);
    }

    @Then("write parent last name")
    public void write_parent_last_name() {
        ppObj.parentLastName.sendKeys(myParent.lastName);
    }
    @Then("clicking how did you hear about us")
    public void clicking_how_did_you_hear_about_us() {
       ppObj.howDidYouHear.sendKeys(myParent.hdyhau);
    }
    @When("writing parent email with parent pojo class")
    public void writing_parent_email_with_parent_pojo_class() {
       ppObj.email.sendKeys(ppObj.Pemail);
    }
    @Then("writing phone number with parent pojos")
    public void writing_phone_number_with_parent_pojos() {
        ppObj.homePhone.sendKeys(ppObj.phoneHomeNumber);
    }
    @Then("writing parent address information")
    public void writing_parent_address_information() {
        ppObj.pStreet.sendKeys(myParent.street);
        ppObj.pCity.sendKeys(myParent.city);
        ppObj.pState.sendKeys(myParent.state);
        ppObj.pZip.sendKeys(Integer.toString(myParent.zipCode));
    }
    @When("click how many students enrolment")
    public void click_how_many_students_enrolment() {
        ppObj.howManyStudents.sendKeys(Integer.toString(myParent.howManyStnds));
    }
    @Then("go to student page")
    public void go_to_student_page() {
        ppObj.next_Btn.click();

    }

    @Then("select parent relation")
    public void select_parent_relation() {

        spObj.parentRelation.sendKeys(myStudent.parentRelation);
    }


    @When("writing student first name with student pojos")
    public void writing_student_first_name_with_student_pojos() {
        spObj.firstName.sendKeys(myStudent.firstName);
    }
    @Then("writing student last name with student pojos")
    public void writing_student_last_name_with_student_pojos() {
        spObj.lastName.sendKeys(myStudent.lastName);
    }

    @Then("select date of birth year")
    public void select_date_of_birth_year() {
        Select select=new Select(spObj.dateOfBirthYear);
        select.selectByIndex(10);
    }

    @Then("select date of bith day")
    public void select_date_of_bith_day() {
        Select select1=new Select(spObj.dateOfBirthMonth);
        select1.selectByIndex(10);
    }

    @Then("select date of birth month")
    public void select_date_of_birth_month() {
        Select select2=new Select(spObj.dateOfBirthDay);
        select2.selectByIndex(10);
    }

    @When("selecting gender")
    public void selecting_gender() {
        spObj.genderSelect.sendKeys(myStudent.gender);

        BrowserUtils.waitForClickablility(spObj.currentAcademicYear,10);
    }
    @Then("clicking current academic year")
    public void clicking_current_academic_year() {

        spObj.currentAcademicYear.click();
    }
    @Then("select 4th grade level")
    public void select_4th_grade_level() {
        spObj.gradeLevel.sendKeys("04");
    }
    @When("go to school page")
    public void go_to_school_page() {
        spObj.next_Btn.click();


    }

//    @Then("verify go to school page")
//    public void verify_go_to_school_page() {
//        waitFor(6);
//        assertEquals(introduction_pg.pageVerify("sschool"),sclpObj.schoolsPageTitle);
//
//    }

    @Then("click Ignore {int}")
    public void click_Ignore(Integer int1) {
        sclpObj.radio_button7.click();
    }
    @Then("click next button")
    public void click_next_button() {
       sclpObj.next_Btn.click();



    }
    @Then("verify go to finish page")
    public void verify_go_to_finish_page() {
        waitForVisibility(fpObj.finishPageTitle,5);
        assertEquals(introduction_pg.pageVerify("ffinish"),fpObj.finishPageTitle);

    }


    @Then("click finish button")
    public void click_finish_button() {
        fpObj.finish_Btn.click();

//        assertEquals(fpObj.PEmail.getText(),ppObj.Pemail.toString());
    }

    @Then("configuration page is displayed")
    public void configuration_page_is_displayed() {
        waitForVisibility(cpObj.confirmation_no,15);
        Assert.assertTrue(cpObj.confirmation_no.isDisplayed());
    }

    @Then("click first name")
    public void click_first_name() {
       spObj.firstName.click();
    }





}
