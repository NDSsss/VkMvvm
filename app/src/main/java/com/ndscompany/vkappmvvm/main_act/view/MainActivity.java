package com.ndscompany.vkappmvvm.main_act.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ndscompany.vkappmvvm.NewsAdapter;
import com.ndscompany.vkappmvvm.R;
import com.ndscompany.vkappmvvm.main_act.view_model.IMainActViewModel;
import com.ndscompany.vkappmvvm.main_act.view_model.MainActivityViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IMainAct {

    private NewsAdapter adapter;
    private IMainActViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new MainActivityViewModel(this);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new NewsAdapter();
        recyclerView.setAdapter(adapter);
        viewModel.activityCreated();
    }

    @Override
    public void showNews(ArrayList<String> news) {
        adapter.setNews(news);
    }
}
