package com.example.android.nagyvarad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.general_list);

        ArrayList<HistoryContent>content = new ArrayList<HistoryContent>();
        content.add(new HistoryContent("Tour virtual", "www.youtube.com/watch?v=1hGtHkG79Y4", R.drawable.turvirtual));
        content.add(new HistoryContent("City Center", "www.youtube.com/watch?v=0WoQduq0WjE", R.drawable.kozpont));
        content.add(new HistoryContent("Black Eagle Palace", "www.youtube.com/watch?v=uu-r4VfNJ6Y", R.drawable.sas));
        content.add(new HistoryContent("Fortress", "www.youtube.com/watch?v=tifkm7nnPJE", R.drawable.var));
        content.add(new HistoryContent("Mushroom", "www.youtube.com/watch?v=K_b_uVAB4KU", R.drawable.ciuperca));
        content.add(new HistoryContent("Lotus Center", "www.youtube.com/watch?v=fKnNiD9FAEc", R.drawable.lotus));


        HistoryContentAdapter adapter = new HistoryContentAdapter(HistoryActivity.this, content);

        ListView listView = (ListView) findViewById(R.id.general_item);

        listView.setAdapter(adapter);



    }
}
