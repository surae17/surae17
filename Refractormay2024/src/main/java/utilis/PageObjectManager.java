package utilis;

import PageObject.BAbyWishlistPage;
import PageObject.HomePage;
import PageObject.LearnMoreAlertPage;
import PageObject.LearnMoreExplicitPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public BAbyWishlistPage bAbyWishlistPage;
    public HomePage homePage;
    public WebDriver driver;
    public LearnMoreAlertPage LearnMoreAlertPage;
    public LearnMoreExplicitPage LearnMoreExplicitPage;


    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public BAbyWishlistPage GetBabyWishListPage() {
        bAbyWishlistPage = new BAbyWishlistPage(driver);
        return bAbyWishlistPage;
    }

    public HomePage getHomePage() {
        homePage = new HomePage(driver);
        return homePage;
    }

    public PageObject.LearnMoreAlertPage getLearnMoreAlertPage() {
        LearnMoreAlertPage = new LearnMoreAlertPage(driver);
        return LearnMoreAlertPage;
    }

    public PageObject.LearnMoreExplicitPage getLearnMoreExplicitPage(){
        LearnMoreExplicitPage = new LearnMoreExplicitPage(driver);
        return LearnMoreExplicitPage;
    }

}
