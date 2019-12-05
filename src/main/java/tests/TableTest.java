package tests;

import org.testng.annotations.Test;
import pages.TablePage;

public class TableTest extends BaseTest {

    @Test
    public void tableTest() {
        driver.get("http://www.w3schools.com/html/html_tables.asp");
        TablePage tablePage = new TablePage(driver);

        tablePage.printColumnsHeaders();

        tablePage.printCountOfLines();

        System.out.println("Value from cell (2,3) is \"" + tablePage.getValueFromCell(2,3) + "\"");
        System.out.println("Value from cell (4,1) is \"" + tablePage.getValueFromCell(4,1) + "\"");

        System.out.println("Value from cell (4,Company) is \"" + tablePage.getValueFromCell(4,"Company") + "\"");
        System.out.println("Value from cell (1,Country) is \"" + tablePage.getValueFromCell(1,"Country") + "\"");
        System.out.println("Value from cell (2,Contact) is \"" + tablePage.getValueFromCell(2,"Contact") + "\"");
    }

}
