package com.ndscompany.vkappmvvm;

import android.app.Application;

import com.ndscompany.vkappmvvm.main_act.repository.INewsRepository;
import com.ndscompany.vkappmvvm.main_act.repository.NewsRepository;

public class App extends Application {
    public static App mInstance;
    private INewsRepository repository;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        repository = new NewsRepository();
    }

    public INewsRepository getRepository() {
        return repository;
    }
}
