package com.ndscompany.vkappmvvm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsVh> {

    private ArrayList<String> news = new ArrayList<>();

    public void setNews(ArrayList<String> newNews){
        news = newNews;
    }

    @NonNull
    @Override
    public NewsVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false);
//        NewsVh newsVh = new NewsVh(view);
//        return newsVh;
        return new NewsVh(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NewsVh holder, int position) {
        holder.tvNumber.setText(String.valueOf(position));
        holder.tvInfo.setText(news.get(position));
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public class NewsVh extends RecyclerView.ViewHolder{

        TextView tvNumber;
        TextView tvInfo;

        public NewsVh(@NonNull View itemView) {
            super(itemView);
            tvNumber = itemView.findViewById(R.id.item_news_tv_number);
            tvInfo = itemView.findViewById(R.id.item_news_tv_info);
        }
    }
}
