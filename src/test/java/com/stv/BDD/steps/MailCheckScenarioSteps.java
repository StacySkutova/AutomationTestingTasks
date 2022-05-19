package com.stv.BDD.steps;

import com.stv.factory.factorypages.MyTestFactoryPage;
import com.stv.factory.factorypages.RegistrationPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;


public class MailCheckScenarioSteps extends BasicFactoryTest {
    MyTestFactoryPage myTestFactoryPage = new MyTestFactoryPage();

    @Given("^The page with 2 input forms Sign in and New customer opened$")
    public void setup() throws Throwable {
        getDriver().get(START_URL);
        getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
    }

    @When("^Enter \"([^\"]*)\" in the field Email address inside the input form New customer$")
    public void enterInTheFieldEmailAddressInsideTheInputFormNewCustomer(String email) {
        myTestFactoryPage.clickOnInputField(email);
    }

    @And("^Press the button Continue$")
    public void pressContinueButton() {
        myTestFactoryPage.clickOnContinueButton();
    }

    @Then("The full registration input form New customer opened")
    public void FullRegistrationNewCustomerPageIsOpened() {
        getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        new RegistrationPage().isRegistrationContainerDisplayed();
    }
}
