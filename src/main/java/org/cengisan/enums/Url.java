package org.cengisan.enums;

public enum Url {
    CODILITY("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
    private final String urlInfo;
    Url(String url) {
        this.urlInfo = url;
    }
    public String getUrlInfo() {
        return urlInfo;
    }
}
