package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsTest extends BaseTest{
    /*2. Работа с Actions:
 - перейти по url http://en.wikipedia.org
 - по примеру класса KeysClass реализовать алгоритм с использованием Actions*/

    @Test
    public void actionsTest() {
        driver.get("http://en.wikipedia.org");

        WebElement searchInput = driver.findElement(By.xpath("//input[@id='searchInput']"));

        Actions actions = new Actions(driver);

        actions.sendKeys(searchInput, "test text")
                .keyDown(Keys.CONTROL).sendKeys("a")
                .keyDown(Keys.CONTROL).sendKeys("x")
                .keyDown(Keys.CONTROL).sendKeys("v")
                .sendKeys(Keys.ENTER)
                .build().perform();
    }
}
