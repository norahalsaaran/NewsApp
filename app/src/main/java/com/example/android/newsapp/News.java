package com.example.android.newsapp;

public class News {

    String NewsTitle;
    String NewsAuthor;
    String NewsUrl;
    String NewsDatePublished;
    String NewsSection;

    public News(String title, String author, String url, String datePublished, String section) {
         NewsTitle= title;
        NewsAuthor = author;
        NewsUrl = url;
        NewsDatePublished = datePublished;
        NewsSection = section;
    }

    public String getNewsTitle() {
        return NewsTitle;
    }

    public String getNewsAuthor() {
        return NewsAuthor;
    }

    public String getNewsUrlUrl() {
        return NewsUrl;
    }

    public String getNewsDatePublished() {
        return NewsDatePublished;
    }

    public String getNewsSection() {
        return NewsSection;
    }

}