package com.example.android.newsapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News>{

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        News currentNews = getItem(position);

        TextView TitleView = (TextView) listItemView.findViewById(R.id.title);
        TitleView.setText(currentNews.getNewsTitle());
        TitleView.setTextSize(16);

        TextView AuthorView = (TextView) listItemView.findViewById(R.id.author);
        AuthorView.setText(currentNews.getNewsAuthor());

        TextView DatePublishedView = (TextView) listItemView.findViewById(R.id.date);
        DatePublishedView.setText(currentNews.getNewsDatePublished());

        TextView SectionView = (TextView) listItemView.findViewById(R.id.section);
        SectionView.setText(currentNews.getNewsSection());


        return listItemView;
    }
}


