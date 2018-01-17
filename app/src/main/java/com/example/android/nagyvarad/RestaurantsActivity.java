package com.example.android.nagyvarad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.general_list);

        ArrayList<Content> content = new ArrayList<Content>();
        content.add(new Content("Baretti", "Str. Bulevardul Decebal 60", "0771208323", "www.baretti.ro", R.drawable.baretti));
        content.add(new Content("Spoon", "Aleea Emanuil Ghojdu", "0259708989", "www.spoonrestaurant.ro", R.drawable.spoon));
        content.add(new Content("Coquette", "Piata 1 Decembrie 12", "0748228822", "www.grandpalace.ro/coquette/", R.drawable.coquette));
        content.add(new Content("Corsarul", "Piata Ion Creanga 1", "0259449494", "www.restaurantcorsarul.ro", R.drawable.corsaru));
        content.add(new Content("Vinotera","Str. Caii Ferate 9", "0753999900", "www.ristorante-vinotera.ro", R.drawable.vinotera));

        ContentAdapter adapter = new ContentAdapter(RestaurantsActivity.this, content);

        ListView listView = (ListView) findViewById(R.id.general_item);

        listView.setAdapter(adapter);
    }
}
