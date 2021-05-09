package pages;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.CatalogPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CatalogPageTests extends BaseTest {

    @Test
    public void testResults() {
        homepage.clickProgramButton();
        homepage.clickCatalogButton();
        catalogPage.searchKeyword();
        catalogPage.getSearchedResults();
        assertEquals(catalogPage.getResultTitle(),"Results (91)","Title is incorrect");

    }


}
