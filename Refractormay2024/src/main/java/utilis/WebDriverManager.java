package utilis;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebDriverManager {

    public WebDriver driver;

    public WebDriver getDriverDetails() throws IOException {
        if (driver == null) {
            FileInputStream fis = new FileInputStream(new File("src/main/resources/Configurations/FrameworkConfig.properties"));
            Properties prob = new Properties();
            prob.load(fis);
            switch (prob.getProperty("browser").toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    throw new InvalidArgumentException("enter valid browser name");
            }
            driver.get(prob.getProperty("testEnvironment"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
}


