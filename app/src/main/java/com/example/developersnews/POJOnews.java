package com.example.developersnews;

public class POJOnews {

    private String img_news;
    private String news_source;
    private String news_title;
    private String news_desc;
    private String news_category;
    private String news_date;


    public POJOnews(String img_main, String news_source, String news_title, String news_desc, String news_category, String news_date) {
        this.img_news = img_main;
        this.news_source = news_source;
        this.news_title = news_title;
        this.news_desc = news_desc;
        this.news_category = news_category;
        this.news_date = news_date;

    }

    public String getImg_news() {
        return img_news;
    }

    public String getNews_source() {
        return news_source;
    }

    public String getNews_title() {
        return news_title;
    }

    public String getNews_desc() {
        return news_desc;
    }

    public String getNews_category() {
        return news_category;
    }

    public String getNews_date() {
        return news_date;
    }


}
