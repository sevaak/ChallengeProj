package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogPage {
    public WebDriver driver;
    public By searchInput = By.tagName("input");
    public By title = By.tagName("h1");
    public By javaTitle = By.tagName("h2");


    public CatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchKeyword() {
        driver.findElement(searchInput).sendKeys("Java" + Keys.ENTER);
    }

    public void getSearchedResults() {
        List<WebElement> listOfElements = driver.findElements(javaTitle);

        for (int i = 0; i < listOfElements.size(); i++) {
            List<String> list = new ArrayList<>();
            listOfElements = driver.findElements(By.tagName("h2"));
            if (listOfElements.get(i).getText().contains("Java")) {
                list.add(listOfElements.get(i).getText());
            }

            for (int j = 0; j < list.size(); j++) {
                System.out.println(list);
            }
        }
    }

    public String getTitleText() {

        return driver.findElement(title).getText();
    }


}




