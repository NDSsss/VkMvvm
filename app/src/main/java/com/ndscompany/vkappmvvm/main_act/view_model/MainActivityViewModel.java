package com.ndscompany.vkappmvvm.main_act.view_model;

import com.ndscompany.vkappmvvm.App;
import com.ndscompany.vkappmvvm.main_act.view.IMainAct;

public class MainActivityViewModel implements IMainActViewModel {

    private IMainAct view;

    public MainActivityViewModel(IMainAct view) {
        this.view = view;
    }

    @Override
    public void activityCreated() {
        view.showNews(App.mInstance.getRepository().getNews());
    }
}
