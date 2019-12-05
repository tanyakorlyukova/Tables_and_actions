package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TablePage {

    WebDriver driver;

    By columnsHeaders = By.xpath("//table[@id='customers']//tr[1]/th");
    By tableLines = By.cssSelector("#customers tr");
    String[] listOfHeaders;

    public TablePage (WebDriver driver) {
        this.driver = driver;
        getColumnsHeaders();
    }

    private void getColumnsHeaders() {
        List<WebElement> headers = driver.findElements(columnsHeaders);
        listOfHeaders = new String[headers.size()];
        for(int i=0; i<headers.size(); i++) {
            listOfHeaders[i] = headers.get(i).getText();
        }
    }

    public void printColumnsHeaders() {
        System.out.println("Headers of table columns are...");
        for(int i = 0; i<listOfHeaders.length; i++) {
           System.out.println(listOfHeaders[i]);
        }
    }

    public void printCountOfLines() {
        List<WebElement> lines = driver.findElements(tableLines);
        System.out.println("Count of lines in table is " + lines.size());
    }

    public String getValueFromCell(int i, int j) {
        if(i!=1) {
            By cell = By.xpath("//table[@id='customers']//tr[" + i + "]/td[" + j + "]");
            return driver.findElement(cell).getText();
        } else {
            By cell = By.xpath("//table[@id='customers']//tr[" + i + "]/th[" + j + "]");
            return driver.findElement(cell).getText();
        }
    }

    public String getValueFromCell(int x, String nameOfColumn) {
        int numberOfColumn = 0;
        for(int i=0; i < listOfHeaders.length; i++) {
            if(listOfHeaders[i].equals(nameOfColumn)) {
                numberOfColumn = i+1;
            }
        }
        String value = getValueFromCell(x, numberOfColumn);
        return value;
    }

}
