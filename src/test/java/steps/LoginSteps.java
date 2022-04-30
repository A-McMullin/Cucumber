package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @Then("admin user is sucessfully logged in")
    public void admin_user_is_sucessfully_logged_in() {
        System.out.println("test passed");
        tearDown();
    }
    @When("user enters valid ESS username and password")
    public void user_enters_valid_ess_username_and_password() {
      //  LoginPage login = new LoginPage();

        sendText(login.usernamebox, "tts12345");

        sendText(login.passwordbox, "Hum@nhrm123");
    }

    @Then("ESS user is successfully logged in")
    public void ess_user_is_successfully_logged_in() {
        tearDown();
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
       // LoginPage login = new LoginPage();

        sendText(login.usernamebox, "tts12345");

        sendText(login.passwordbox, "Hum@nhrm");
    }

    @Then("user see error message on the screen")
    public void user_see_error_message_on_the_screen() {
        //homework
        tearDown();
    }

    }
