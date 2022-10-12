package com.example.laptopstore;

import java.util.List;

public class News {

    String text;                // текст новости
    String url1, url2;           // url для фото

    public News(String text, String url1, String url2) {
        this.text = text;
        this.url1 = url1;
        this.url2 = url2;
    }
}
