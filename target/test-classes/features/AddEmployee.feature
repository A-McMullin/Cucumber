Feature: Adding the employees in HRMS application


  Background:
    Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option

  @regression @test123
  Scenario: Adding one employee from feature file
    And user enters firstname middlename and lastname
    And user clicks on save button
    Then employee added successfully

    @test123
    Scenario: Adding one employee using cucumber feature file
      And user enters "zuhoor" "Mujeeb" and "Silvia"
      And user clicks on save button
      Then employee added successfully

    @test456
  Scenario Outline: Adding multiple employees
      And user provides "<firstName>" "<middleName>" and "<lastName>"
      And user clicks on save button
      Then employee added successfully
      Examples:
      |firstName|middleName|lastName|
      |a        |a         |a       |
      |b        |b         |b       |
      |c        |c         |c       |
      |d        |d         |d       |

      @test @datatable @excel123
  Scenario: Add employee using data table
      When user provides multiple employee data and verify they are added
      |firstName|middleName|lastName|
      |a123        |a         |a321       |
      |b123        |b         |b321       |
      |c123        |c         |c321       |

        @excel
  Scenario: Adding multiple employees from excel file
    When user add multiple employees from excel file using "EmployeeData" sheet and verify the user added

  @e2eTest1
  Scenario: Adding one employee using cucumber feature file
    And user enters "Taylor" "Shakira" and "Swift"
    And user grabs the employee id
    And user clicks on save button
    And user query the database for same employee id
    Then user verifies the results