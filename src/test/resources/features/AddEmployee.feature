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
    And user enters first, middle, and last name
    And user click on save button
    Then employee added successfully

    @test123
    Scenario: Adding one employee using cucumber feature file
      And user enters "zuhoor" "Mujeeb" and "Silvia"
      And user click on save button
      Then employee added successfully

    @test456
  Scenario Outline: Adding multiple employees
      And user provides "<firstName>" "<middleName>" and "<lastName>"
      And user click on save button
      Then employee added successfully
      Examples:
      |firstName|middleName|lastName|
      |a        |a         |a       |
      |b        |b         |b       |
      |c        |c         |c       |
      |d        |d         |d       |

      @test @datatable
  Scenario: Add employee using data table
      When user provides multiple employee data and verify they are added
      |firstName|middleName|lastName|
      |a        |a         |a       |
      |b        |b         |b       |
      |c        |c         |c       |

        @excel
  Scenario: Adding multiple employees from excel file
    When user add multiple employees from excel file using "EmployeeData" sheet and verify the user added