package com.example.android.nagyvarad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WeddingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.general_list);

        ArrayList<Content>content = new ArrayList<Content>();
        content.add(new Content("Castello", "Baile Felix", "0744160945", "www.castello-events.ro",R.drawable.castello ));
        content.add(new Content("Grand'Or Deluxe","Str. Vasile Alecsandi", "0773873632", "www.grandordeluxe.ro", R.drawable.grand));
        content.add(new Content("Hanul Pescarilor", "Saldabagiu de Munte", "0259210045", "www.hanulpescarilor.ro", R.drawable.hanul));
        content.add(new Content("Opera", "Calea Aradului FN", "0721123099", "www.operaevents.ro", R.drawable.opera));
        content.add(new Content("Palazzo", "Ciheiului 67", "0740205282", "www.palazzo-oradea.ro", R.drawable.palazzo));
        content.add(new Content("Ambasador", "Calea Aradului 87", "0741222000", "www.ambasadororadea.ro", R.drawable.ambasador));


        ContentAdapter adapter = new ContentAdapter(WeddingActivity.this, content);

        ListView listView = (ListView) findViewById(R.id.general_item);

        listView.setAdapter(adapter);
    }
}
