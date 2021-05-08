package base;

import catalog.CatalogPageTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CatalogPage;
import pages.HomePage;


import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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


    @Test
    public void programButtonTest() {
        homepage.clickProgramButton();


    }


    @Test
    public void catalogButtonTest() {
        homepage.clickProgramButton();
        CatalogPage catalogpage = homepage.clickCatalogButton();
        assertTrue(catalogpage.getTitleText()
                        .contains("Program Catalog"),
                "text is incorrect");

    }


}
