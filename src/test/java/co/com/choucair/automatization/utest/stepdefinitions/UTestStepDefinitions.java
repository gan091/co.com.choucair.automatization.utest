package co.com.choucair.automatization.utest.stepdefinitions;

import co.com.choucair.automatization.utest.model.UTestData;
import co.com.choucair.automatization.utest.questions.Answer;
import co.com.choucair.automatization.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class UTestStepDefinitions {

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}

    @Given("^than bill wants to create a new user$")
    public void thanBillWantsToCreateANewUser() {
        OnStage.theActorCalled("Bill").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fill out the form on the platform UTest$")
    public void heFillOutTheFormOnThePlatformUTest(List<UTestData> uTestDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddBasicInformation.onThePage(uTestDataList.get(0)),
                AddAdress.onThePage(uTestDataList.get(0)),
                AddDevices.onThePage(uTestDataList.get(0)),
                Finalize.createUser(uTestDataList.get(0))
        );
    }

    @Then("^he create a new user$")
    public void heCreateANewUser(List<UTestData> uTestDataList) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestDataList.get(0))));
    }
}
