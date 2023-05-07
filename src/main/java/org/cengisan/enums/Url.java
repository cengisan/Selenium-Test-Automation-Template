package org.cengisan.enums;

public enum Url {
    AMAZON("https://www.amazon.com.tr/");
    private final String urlInfo;
    Url(String url) {
        this.urlInfo = url;
    }
    public String getUrlInfo() {
        return urlInfo;
    }
}
