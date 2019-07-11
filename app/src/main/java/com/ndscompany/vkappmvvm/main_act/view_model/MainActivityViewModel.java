package com.ndscompany.vkappmvvm.main_act.view_model;

import com.ndscompany.vkappmvvm.App;
import com.ndscompany.vkappmvvm.main_act.repository.INewsRepository;
import com.ndscompany.vkappmvvm.main_act.view.IMainAct;

import java.util.ArrayList;

public class MainActivityViewModel implements IMainActViewModel {

    private IMainAct view;
    private INewsRepository repository;

    public MainActivityViewModel(IMainAct view) {
        this.view = view;
        repository = App.mInstance.getRepository();
    }

    @Override
    public void activityCreated() {
        ArrayList<String> news = repository.getNews();
        view.showNews(news);
    }
}
