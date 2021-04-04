package com.example.developersnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.net.URI;
import java.net.URL;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private List<POJOnews> pojOnewsList;
    private Context context;

    public RecyclerAdapter(List<POJOnews> pojOnewsList, Context context) {
        this.pojOnewsList = pojOnewsList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.news_layout,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        try {
            URL img_news_txt = new URL(pojOnewsList.get(position).getImg_news() + "");
            RequestOptions options=new RequestOptions().centerCrop().placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher);
            Glide.with(context).load(img_news_txt).apply(options).into(holder.img_news);


            POJOnews pojOnews=pojOnewsList.get(position);
            holder.news_source.setText(pojOnews.getNews_source());
            holder.news_title.setText(pojOnews.getNews_title());
            holder.news_desc.setText(pojOnews.getNews_desc());
            holder.news_date.setText(pojOnews.getNews_date());
            holder.news_category.setText(pojOnews.getNews_category());

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount() {
        return pojOnewsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView img_news;
        TextView news_title,news_source,news_desc,news_category,news_date;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_news=itemView.findViewById(R.id.news_img);

            news_title=itemView.findViewById(R.id.news_title);
            news_category=itemView.findViewById(R.id.news_category);
            news_desc=itemView.findViewById(R.id.news_desc);
            news_date=itemView.findViewById(R.id.news_date);
            news_source=itemView.findViewById(R.id.news_medium);
        }
    }
}
