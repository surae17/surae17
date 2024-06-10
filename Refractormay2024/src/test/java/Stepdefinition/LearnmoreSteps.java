package Stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilis.PageObjectManager;
import utilis.TestContext;

public class LearnmoreSteps {

    TestContext Context ;
    public LearnmoreSteps(TestContext context){
        this.Context = context;
    }

    @Given("User click on conformation box button")
    public void clickConfirmation(){
        Context.PageObjectMAnager.getLearnMoreAlertPage().clickConfirmBoXButton();

    }

    @Then("user validate the alert message")
    public void ValidateTheAlertMessage() {
        String ActualMessage = Context.PageObjectMAnager.getLearnMoreAlertPage().getAlertBoxText();
        Assert.assertEquals("Press a Button !",ActualMessage);
    }

    @And("user validate the UIMessage")
    public void ValidateTheUIMessage() {
        Context.PageObjectMAnager.getLearnMoreAlertPage().clickCancelAlert();
        Assert.assertEquals("You Pressed Cancel",Context.PageObjectMAnager.getLearnMoreAlertPage().getCancelTextMessageFromUI());
    }

    @Then("validate the change Text value")
    public void validateTheChangeTextValue() {
       Assert.assertEquals(" ",Context.PageObjectMAnager.getLearnMoreExplicitPage().getChangeText());
    }
     @Given("user clicks on Change Text Button")
    public void ClicksOnChangeTextButton() {
        Context.PageObjectMAnager.getLearnMoreExplicitPage().clickChangeTextButton();
    }

}
