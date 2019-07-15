package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        return (platform.toUpperCase().indexOf("MAC") > -1) &&(browser.toUpperCase().indexOf("IE") > -1)?"IE on Mac?":"banner";
    }
}
