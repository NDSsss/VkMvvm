package com.ndscompany.vkappmvvm.main_act.repository;

import java.util.ArrayList;

public class NewsRepository implements INewsRepository {
    @Override
    public ArrayList<String> getNews() {
        ArrayList<String> news = new ArrayList<>();
        news.add("One");
        news.add("Two");
        news.add("Three");
        news.add("Four");
        return news;
    }
}
