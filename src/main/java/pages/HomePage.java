package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private By programsButton = By.xpath("//header/nav[1]/div[1]/button[1]");
    private By homePageTitle= By.tagName("h1");
    private By catalogButton= By.xpath("//a[contains(text(),'Full Catalog')]");



    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickProgramButton() {
        clickButton(programsButton);
    }

    public CatalogPage clickCatalogButton() {
        driver.findElement(catalogButton).click();
        return new CatalogPage(driver);

    }

    private void clickButton(By by){
        driver.findElement(by).click();
    }

    public String getTitleText(){
       return driver.findElement(homePageTitle).getText();
    }



}
