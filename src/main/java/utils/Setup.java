package utils;

import com.github.javafaker.Faker;
import datafactory.SearchFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Setup {

    public static ChromeDriverService service;
    public WebDriver driver;
    public WebDriverWait wait = (new WebDriverWait(driver, Duration.ofSeconds(10)));
    public static final Faker brFk = new Faker();
    public static final String START_AUTOMATIONS = "\n\n###################   AUTOMATED TESTING STARTED   ###################\n\n";
    public static final String FINISH_AUTOMATIONS = "\n\n###################   AUTOMATED TESTING FINISHED   ###################\n\n";


    @BeforeClass
    public static void createAndStartService() throws IOException {

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("src/main/java/drivers/chromedriver.exe"))
                .usingAnyFreePort()
                .build();
        service.start();
        System.out.println(START_AUTOMATIONS);
    }

    @AfterClass
    public static void stopService() {
        service.stop();
        System.out.println(FINISH_AUTOMATIONS);
    }

    @Before
    public void createDriver() {
        driver = new RemoteWebDriver(service.getUrl(), new ChromeOptions());
        driver.get("https://blogdoagi.com.br/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("\n\n***** Test Scenario Started *****\n\n");
    }

    @After
    public void quitDriver() {
        driver.quit();
        System.out.println("\n\n***** Test Scenario Finished *****\n\n");
    }

}
