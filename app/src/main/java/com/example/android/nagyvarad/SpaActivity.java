package com.example.android.nagyvarad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SpaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.general_list);


        ArrayList<Content> content = new ArrayList<Content>();

        content.add(new Content("Aqua Park Nymphea", "Aleea Strandului 13B", "0770366388","www.aquapark-nymphaea.ro", R.drawable.nymphea ));
        content.add(new Content("Lotus Therm", "Str. Victoria 20 - Baile Felix", "0359414474", "www.lotustherm.ro", R.drawable.spathermal));
        content.add(new Content("Strand Apollo", "Str. Victoria 30", "0259318204", "www.bailefelix.net", R.drawable.felix));
        content.add(new Content("Nevis", "Str. Lapusului 2", "0259407970", "www.hotelnevis.ro", R.drawable.nevisspa
        ));

        ContentAdapter adapter = new ContentAdapter(SpaActivity.this, content);

        ListView listView = (ListView) findViewById(R.id.general_item);

        listView.setAdapter(adapter);
    }
}
