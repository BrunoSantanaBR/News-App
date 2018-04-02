package com.example.android.newsapp;

/**
 * Created by bruno on 28/03/2018.
 */

public class News {

    private String sectionID;
    private String sectionName;
    private String webTitle;
    private String webPublicationDate;
    private String webUrl;

    public News(String SecID, String secName, String wTitle, String wPublicationDate, String wUrl){
        sectionID = SecID;
        sectionName = secName;
        webTitle = wTitle;
        webPublicationDate = wPublicationDate;
        webUrl = wUrl;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    public String getSectionID() {
        return sectionID;
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
}


