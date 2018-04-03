package com.example.android.newsapp;

/**
 * Created by bruno on 28/03/2018.
 */

public class News {

    private String sectionName;
    private String webTitle;
    private String webPublicationDate;
    private String webUrl;
    private String author;

    public News(String secName, String wTitle, String wPublicationDate, String wUrl, String wAuthor) {
        sectionName = secName;
        webTitle = wTitle;
        webPublicationDate = wPublicationDate;
        webUrl = wUrl;
        author = wAuthor;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getAuthor() {
        return author;
    }
}


