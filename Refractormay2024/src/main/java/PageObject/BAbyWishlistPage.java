package PageObject;

import org.openqa.selenium.WebDriver;

public class BAbyWishlistPage {

  WebDriver driver;
  public BAbyWishlistPage(WebDriver driver){
    this.driver = driver;
  }

  public String getPageTitle(){
    return driver.getTitle();

  }
}
