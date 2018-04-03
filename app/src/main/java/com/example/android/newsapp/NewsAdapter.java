package com.example.android.newsapp;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;


/**
 * Created by bruno on 28/03/2018.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    private static final String STRING_SEPARATOR = "T";

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    public View getView(int position, View convertView, ViewGroup parent) {


        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID sectionName_Text_View
        TextView sectionNameView = listItemView.findViewById(R.id.sectionName_Text_View);
        // Display the section name of the current news in that TextView
        sectionNameView.setText(currentNews.getSectionName());

        // Find the TextView with view ID weTitle_Text_View
        TextView sectionWebTitleView = listItemView.findViewById(R.id.weTitle_Text_View);
        // Display the web title of the current news in that TextView
        sectionWebTitleView.setText(currentNews.getWebTitle());

        String webPublicationDateString = currentNews.getWebPublicationDate();
        String[] webPublicationDateSplit = webPublicationDateString.split(STRING_SEPARATOR);

        // Find the TextView with view ID date
        TextView dateView = listItemView.findViewById(R.id.date_Text_View);
        // Display the date of the current news in that TextView
        dateView.setText(webPublicationDateSplit[0]);

        // Find the TextView with view ID time
        TextView timeView = listItemView.findViewById(R.id.time_Text_View);

        // Display the time of the current news in that TextView
        timeView.setText(webPublicationDateSplit[1].substring(0, webPublicationDateSplit[1].length() - 4));


        if (!currentNews.getAuthor().equals("")){
            // Find the TextView with view ID author_Text_View
            TextView authorView = listItemView.findViewById(R.id.author_Text_View);
            // Display the author of the current news in that TextView

            String author = getContext().getString(R.string.author) + " " + currentNews.getAuthor();
            authorView.setText(author);
        }


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

}