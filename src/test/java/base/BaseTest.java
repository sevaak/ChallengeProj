package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CatalogPage;
import pages.HomePage;


public class BaseTest {
    private WebDriver driver;
    protected HomePage homepage;
    protected CatalogPage catalogPage;


    //will run before classes
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://udacity.com/");
        System.out.println(driver.getTitle());
        homepage = new HomePage(driver);
        catalogPage = new CatalogPage(driver);


    }

    @AfterClass
    public void tearDown() {
        driver.quit();//closing session and browser
    }


}
