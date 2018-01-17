package com.example.android.nagyvarad;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.general_list);


        final ArrayList<Content> content = new ArrayList<Content>();

        content.add(new Content("Ramada", "Calea Aradului 9", "0359403333", "www.ramadaoradea.ro",R.drawable.ramada ));
        content.add(new Content("Hilton Double Tree", "Aleea Strandului 9", "0259259259", "www.hiltonhotels.com", R.drawable.hilton));
        content.add(new Content("Lotus Therm", "Str. Victoria 20 - Baile Felix", "0359414474","www.lotustherm.ro", R.drawable.lotus_therm));
        content.add(new Content("Astoria", "Str. Teatrului 1 - 2", "0259430508", "www.astoriaoradea.ro", R.drawable.astoria));

        ContentAdapter adapter = new ContentAdapter(HotelsActivity.this, content);

        ListView listView = (ListView) findViewById(R.id.general_item);

        listView.setAdapter(adapter);

    }

}

