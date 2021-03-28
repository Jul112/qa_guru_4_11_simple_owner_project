package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {

    /* private static SearchConfig getConfig() {
    *       return ConfigFactory.newInstance().create(SearchConfig.class, System.getProperties());*/

    private static final SearchConfig config = ConfigFactory.create(SearchConfig.class, System.getProperties());

    public static String getSearchSite() {
        return config.searchSite();
    }

    public static String getSearchItem() {
        return config.searchItem();
    }

    public static String getSearchResult() {
        return config.searchResult();
    }

    public static String getWebdriverRemote() {
        return config.webdriverRemote();
    }


}
