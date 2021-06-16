package base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;

public class BaseTest {


    DriverManager driverManager;
    WebDriver driver;

    @BeforeScenario
    public void setup() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterScenario
    public void tearDown() {
        driverManager.quitDriver();

    }

}
