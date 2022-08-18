package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class GoAutomation extends Base{

    @Test
    public void firstTest(){
        driver.findElement(By.cssSelector(".card.mt-4.top-card")).click();
    }
}
