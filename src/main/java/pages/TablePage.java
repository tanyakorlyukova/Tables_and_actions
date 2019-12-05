package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TablePage {

    WebDriver driver;
    private String tablePageURL =  "http://www.w3schools.com/html/html_tables.asp";

    By customersTable = By.id("customers");
    By columnsHeader = By.xpath("//table[@id='customers']//tr[1]/th");
    By tableLines = By.cssSelector("#customers tr");

    public TablePage (WebDriver driver) {
        this.driver = driver;
        driver.get(tablePageURL);
    }

    public void printColumnsHeaders() {
        List<WebElement> headers = driver.findElements(columnsHeader);
        System.out.println("Headers of table columns are...");
        for(int i=0; i<headers.size(); i++) {
            System.out.println(headers.get(i).getText());
        }
    }

    public void printCountOfLines() {
        List<WebElement> lines = driver.findElements(tableLines);
        System.out.println("Count of lines in table is " + lines.size());
    }

    public String getValueFromCell(int i, int j) {
        By cell = By.xpath("//table[@id='customers']//tr[" + i + "]/td[" + j + "]");
        return driver.findElement(cell).getText();
    }

    public String getValueFromCell(int i, String nameOfColumn) {
        By cell = By.xpath("//table[@id='customers']//tr[" + i + "]/td[]");
        return driver.findElement(cell).getText();
    }

    public void getTableValues() {
        List<WebElement> rows = driver.findElements(tableLines);
        for (WebElement row: rows) {
            List<WebElement> cells = row.findElements(By.cssSelector("td"));
            for (WebElement cell: cells) {
                System.out.println(cell.getText());
            }
        }
    }

}
