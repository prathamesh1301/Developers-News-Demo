package com.example.developersnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;
    private List<POJOnews> pojOnews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        pojOnews=new ArrayList<>();

        pojOnews.add(new POJOnews("https://i.ytimg.com/vi/8lXOkdvc9NM/maxresdefault.jpg","YOUTUBE","Now in Android: 37 - Android 12, MAD Skills WorkManager, AndroidX, and more!","Welcome back to Now in Android, your ongoing guide to what’s new and notable in the world of Android development. In this episode, Chet Haase covers an update on Android 12, MAD Skills WorkManager, AndroidX, Articles, Training, and a brand new ADB.....",
                "Android Developers","April 2, 2021"));

        pojOnews.add(new POJOnews("https://i.ytimg.com/vi/y6bEQ84PHH0/maxresdefault.jpg","YOUTUBE","WorkManager: Live Q&A - MAD Skills","Welcome to the live Q&A of the WorkManager for MAD Skills series hosted by Android Developer Relations Engineer Chet Haase. This time, Chet is joined by Caren Chang, Ben Weiss, Rahul Ravikumar, and Sumir Kataria to answer your WorkManager questions!.....","Android Developers",
                "April 1, 2021"));

        pojOnews.add(new POJOnews("https://cdn-images-1.medium.com/max/1024/1*n5pW2DYxV2CVczFxTMPcpQ.jpeg","MEDIUM","Working with Package Visibility","In Android, we are making changes to enhance user privacy and platform security to provide our users with a safer experience. Apps targeting Android 11 (API level 30) or higher will only see a filtered list of apps that are installed on a device. In.....","Android Developers","April 1, 2021"));

        pojOnews.add(new POJOnews("https://1.bp.blogspot.com/-X2RRLRFr0ZA/YFjP1ccU1wI/AAAAAAAAQRs/YyLABCxLVp0BUUHKg_onEYEDEcyXtHawQCLcBGAsYHQ/s0/Android-high-performance-game-audio-with-oboe-header.png","BLOG","High Performance Game Audio with Oboe","We've added the Oboe C++ audio library to the Android Game SDK. Oboe's support of high-performance, low-latency audio across the widest range of Android devices is the right choice for most game developers. Single API On Android devices running.....","Android Developers","March 23, 2021"));
        pojOnews.add(new POJOnews("https://cdn-images-1.medium.com/max/1024/1*HlbECHXE61TCbfnWqAbcjw.png","MEDIUM","\n" +
                "Google Play subscriptions boost engagement for games","Learn how Japanese game developers find success introducing a subscription business model to ensure regular revenue and boost engagement. For many game developers, the introduction of a subscription business model helps ensure regular revenue and","Google Play Apps & Games","March 19, 2021"));

        recyclerAdapter=new RecyclerAdapter(pojOnews,MainActivity.this);
        recyclerView.setAdapter(recyclerAdapter);
    }
}