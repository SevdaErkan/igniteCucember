@eif
Feature: Registration Enrollment InquiryForm successfully

Scenario: completing the Happy Path
	Given user get EnrollmentInquiryForm page
#	When user click on accept check
#	And user click on next button
#	Then user go to parent page
	Then user completes a happy path

@intro
Scenario: completing intro page
	Given user get EnrollmentInquiryForm page with url
	When When user click on accept check
	And user click on next button
	Then user go to parent page
#	Then verify go to next page

@parent
Scenario: completing parent page
	Given user get EnrollmentInquiryForm page with no intro url
	When write parent first name
	Then write parent last name
	And clicking how did you hear about us
	When writing parent email with parent pojo class
	Then writing phone number with parent pojos
	And writing parent address information
	When click how many students enrolment
	Then go to student page


@student
Scenario: completing student page
	Given user get EnrollmentInquiryForm page with no intro url
	When write parent first name
	Then write parent last name
	And clicking how did you hear about us
	When writing parent email with parent pojo class
	Then writing phone number with parent pojos
	And writing parent address information
	When click how many students enrolment
	Then go to student page
	And select parent relation
	When writing student first name with student pojos
	Then writing student last name with student pojos
	And select date of birth year
	Then select date of birth month
	And select date of bith day
	When selecting gender
	Then clicking current academic year
	And select 4th grade level
	When go to school page
#	Then verify go to school page

@school
Scenario: completing school page
	Given user get EnrollmentInquiryForm page with no intro url
	When write parent first name
	Then write parent last name
	And clicking how did you hear about us
	When writing parent email with parent pojo class
	Then writing phone number with parent pojos
	And writing parent address information
	When click how many students enrolment
	Then go to student page
	And select parent relation
	When writing student first name with student pojos
	Then writing student last name with student pojos
	And select date of birth year
	Then select date of birth month
	And select date of bith day
	When selecting gender
	Then clicking current academic year
	And select 4th grade level
	When go to school page
	Then click Ignore 113
	And click next button
#	Then verify go to finish page

@finish
Scenario: complete finish page
	Given user get EnrollmentInquiryForm page with no intro url
	When write parent first name
	Then write parent last name
	And clicking how did you hear about us
	When writing parent email with parent pojo class
	Then writing phone number with parent pojos
	And writing parent address information
	When click how many students enrolment
	Then go to student page
#	Then verify go to next page
	And select parent relation
	When writing student first name with student pojos
	Then writing student last name with student pojos
	And select date of birth year
	Then select date of birth month
	And select date of bith day
#	Then click first name
	When selecting gender
	Then clicking current academic year
	And select 4th grade level
	When go to school page
	Then click Ignore 113
	And click next button
	Then click finish button
    Then configuration page is displayed

	@StudentApplications
	Scenario: check student name on applications
		Given user get UI page with UIurl
		When write username
		Then write password
		And click log in as button
		And click Staff Memeber
		Then click login button
		When click my work place
		And click studend information
		Then click applications button
		Then user verify parent firstname
		And user select parent firstName  and parentIdfrom studentapplications














