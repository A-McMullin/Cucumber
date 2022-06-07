Feature: Adding employee skills in HRMS application

  Scenario: As an admin user should be able to add employee's skills
    Given user is on HRMS application page
    When user logs in with valid admin credentials
    And user clicks on PIM tab
    When user selects the employee by the Employee ID link and is taken to the Personal Details page
    When user clicks on Qualifications under the photo and is navigated to the Qualifications page
    When user clicks on Add under Skills and the Skill dropdown is available
    And user is able to select the skill from the dropdown
    And user can input under Years of Experience and Comments
    When user clicks Save
    Then skills are added to the user profile
