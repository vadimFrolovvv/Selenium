package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class Base {

    WebDriver driver;

    @BeforeEach
    void setupDriver(){
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
}
