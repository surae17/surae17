package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilis.TestContext;

public class HomepageSteps {

    TestContext Context;

    public HomepageSteps(TestContext Context) {
        this.Context = Context;
    }

    @Given("user clicks the baby wishlist from Accounts & lists")
    public void ClicksTheBabyWishlist() {
        Context.PageObjectMAnager.getHomePage().clickBabyWishlist();
    }

    @Then("user verify the navigation")
    public void userVerifyTheNavigation() {
        String actualTitle = Context.PageObjectMAnager.GetBabyWishListPage().getPageTitle();
        Assert.assertEquals("abc", actualTitle);
    }
}
