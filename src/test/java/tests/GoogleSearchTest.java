package tests;

import com.codeborne.selenide.Configuration;
import config.ConfigHelper;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchTest {

    @Test
    void selenideSearchTest() {
        Configuration.remote = ConfigHelper.getWebdriverRemote();

        String searchItem = ConfigHelper.getSearchItem();
        String searchResult = ConfigHelper.getSearchResult();
        String searchSite = ConfigHelper.getSearchSite();

        open(searchSite);

        $(byName("q")).val(searchItem ).pressEnter();

        $("html").shouldHave(text(searchResult));
    }
}
