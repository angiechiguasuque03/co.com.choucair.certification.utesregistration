package co.com.choucair.certification.utestresgistration.stepdefinitions;

import co.com.choucair.certification.utestregistration.taks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestRegistrationStepdefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Nikol wants to sign up for Utest$")
    public void nikolWantsToSignUpForUtest() {

        OnStage.theActorCalled("Nikol").wasAbleTo(OpenUp.thePage());
    }


    @When("^she finds \"([^\"]*)\", click and fill in the requires fields\\.$")
    public void sheFindsClickAndFillInTheRequiresFields(String arg1) {

    }

    @Then("^confirm the user creation\\.$")
    public void confirmTheUserCreation() {

    }
}
