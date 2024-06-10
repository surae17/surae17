package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;

    }
    public void enterProductName(String ProductName){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys();
    }

    public void clickSearchIcon(){
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    public void clickBabyWishlist(){
        WebElement accountElement = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(accountElement).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).click();
    }
}
