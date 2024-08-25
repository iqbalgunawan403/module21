package stepDef;

import Base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDef extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToSauceDemo();
    }

    @Then("user will redirect to homepage")
    public void userWillRedirectToHomepage() {
        homePage = new HomePage(driver);
        homePage.checkFirstBackpackisDisplayed();
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @When("user input email text box with {string}")
    public void userInputEmailTextBoxWith(String username) {
        loginPage.inputUsername(username);
    }

    @Then("user will see error message {string}")
    public void userWillSeeErrorMessage(String errorMsg) {
        loginPage.seeErrorMessage(errorMsg);
    }

    @And("user input password text box with {string}")
    public void userInputPasswordTextBoxWith(String password) {
        loginPage.inputPassword(password);
    }
}