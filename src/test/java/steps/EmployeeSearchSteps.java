package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.client5.http.async.methods.ConfigurableHttpRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.EmployeeSearchPage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Constants;

import java.util.concurrent.TimeUnit;

public class EmployeeSearchSteps extends CommonMethods{
    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        openBrowserAndLaunchApplication();
    }

    @When("user enters valid admin credentials")
    public void user_enters_valid_admin_credentials() {
        sendText(login.usernamebox, ConfigReader.getPropertyValue("username"));
        sendText(login.passwordbox, ConfigReader.getPropertyValue("password"));
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(login.loginBtn);
    }

    @When("user navigated to employee list page")
    public void user_navigated_to_employee_list_page() {
        click(EmpSearchPage.pimOption);
        click(EmpSearchPage.employeeList);
    }
    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        sendText(EmpSearchPage.employeeID,"8510142");
    }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        click(EmpSearchPage.searchButton);
    }
    @Then("user is able to see employee information")
    public void user_is_able_to_see_employee_information() {
        System.out.println("Result displayed");
        tearDown();
    }
    @When("user enters valid employee name")
    public void userEntersValidEmployeeName() {
        sendText(EmpSearchPage.employeeName, "Zubair");
    }
}
