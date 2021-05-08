package catalog;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.CatalogPage;

import static org.testng.Assert.assertTrue;

public class CatalogPageTests extends BaseTest {

    @Test
    public void testResults() {
        catalogPage.searchKeyword();
        assertTrue(catalogPage.getTitleText().contains("Program Catalog"), "Text is Incorrect");
        catalogPage.getSearchedResults();


    }


}
