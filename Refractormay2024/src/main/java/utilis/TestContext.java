package utilis;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContext {

    WebDriverManager WebDriverManager;
     public PageObjectManager PageObjectMAnager;

    public TestContext() throws IOException {
        WebDriverManager = new WebDriverManager();
        PageObjectMAnager = new PageObjectManager(WebDriverManager.getDriverDetails());
    }


}
