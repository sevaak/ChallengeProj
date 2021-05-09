package pages;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HomePageTests extends BaseTest {

    @Test
    public void programButtonTest() {
//        assertEquals(homepage.getTitleText(),"The latest digital skills, within reach.","Text is incorrect");
        homepage.clickProgramButton();

    }

    @Test
    public void catalogButtonTest() {
        homepage.clickProgramButton();
        CatalogPage catalogpage = homepage.clickCatalogButton();
        assertEquals(catalogpage.getTitleText(),"Program Catalog","text is incorrect");

    }

}
