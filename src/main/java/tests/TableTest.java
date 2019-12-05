package tests;

import org.testng.annotations.Test;
import pages.TablePage;

public class TableTest extends BaseTest {
    /*1. Работа с таблицами:
 - перейти по url http://www.w3schools.com/html/html_tables.asp
 - найти там таблицу с id='customers'
 - вывести в консоль все заголовки столбцов таблицы
 - вывести в консоль количество строк таблицы
 - вывести в консоль значение из ячейки (2, 3) и (4, 1)
 - вывести  в консоль значение из ячейки (4, "Company"), (1, "Country") и (2, "Contact")
 - реализовать вспомогательные методы для работы с элементами таблицы в отдельном классе Table*/

    @Test
    public void tableTest() {
        TablePage tablePage = new TablePage(driver);
        tablePage.printColumnsHeaders();
        tablePage.printCountOfLines();
        System.out.println("Value from cell (2,3) is \"" + tablePage.getValueFromCell(2,3) + "\"");
        System.out.println("Value from cell (4,1) is \"" + tablePage.getValueFromCell(4,1) + "\"");

    }

}
