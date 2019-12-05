package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsTest extends BaseTest{

    @Test
    public void actionsTest() {
        driver.get("http://en.wikipedia.org");

        WebElement searchInput = driver.findElement(By.xpath("//input[@id='searchInput']"));

        Actions actions = new Actions(driver);

        actions.sendKeys(searchInput, "test text")
                .keyDown(Keys.CONTROL).sendKeys("a")
                .sendKeys("x")
                .sendKeys("v")
                .keyUp(Keys.CONTROL).sendKeys(Keys.ENTER)
                .build().perform();
    }
}
