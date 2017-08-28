package portal.utils.enums;

public enum Driver {

    CHROME("chrome"),
    FIREFOX("firefox");

    String browser;

    Driver(String browser) {
        this.browser = browser;
    }

    public static String getBroserKey(String browser) {
        String key = "webdriver." + browser.toLowerCase() + ".driver";
        return key;
    }


}
