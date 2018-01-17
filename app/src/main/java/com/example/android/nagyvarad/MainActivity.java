package com.example.android.nagyvarad;

import android.app.Activity;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setCustomView(R.layout.appbar);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        ImageView spaImage = (ImageView)findViewById(R.id.image_spa);
        spaImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent spaimageIntent = new Intent(MainActivity.this, SpaActivity.class);
                startActivity(spaimageIntent);
            }
        });

        TextView spanameTextView = (TextView) findViewById(R.id.spa_name);
        spanameTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent spanameIntent = new Intent(MainActivity.this, SpaActivity.class);
                startActivity(spanameIntent);
            }
        });

        TextView spadeserveTextView = (TextView)findViewById(R.id.spa_deserve);
        spadeserveTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent spadeserveIntent = new Intent(MainActivity.this, SpaActivity.class);
                startActivity(spadeserveIntent);
            }
        });

        ImageView hotelImage = (ImageView) findViewById(R.id.iamge_hotel);
        hotelImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelImageIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelImageIntent);
            }
        });

        TextView hotelNameTextView = (TextView)findViewById(R.id.hotels_name);
        hotelNameTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelNameIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelNameIntent);
            }
        });

        TextView hotelDeserveTextView = (TextView) findViewById(R.id.hotels_deserve);
        hotelDeserveTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelDeserveIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelDeserveIntent);
            }
        });

        ImageView restaurantImage = (ImageView)findViewById(R.id.image_restaurants);
        restaurantImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantImageIntent = new Intent (MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantImageIntent);
            }
        });

        TextView restaurantNameTextView = (TextView)findViewById(R.id.restaurants_name);
        restaurantNameTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resturantNameIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(resturantNameIntent);
            }
        });

        TextView restaurantDeserveTextView = (TextView) findViewById(R.id.restaurants_deserve);
        restaurantDeserveTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resturantDeserveIntet = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(resturantDeserveIntet);
            }
        });

        ImageView weddingImage = (ImageView) findViewById(R.id.wedding_image);
        weddingImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent weddingImageIntent = new Intent(MainActivity.this, WeddingActivity.class);
                startActivity(weddingImageIntent);
            }
        });

        TextView weddingNameTextView = (TextView) findViewById(R.id.weding_name);
        weddingNameTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent weddingNameIntent = new Intent(MainActivity.this, WeddingActivity.class);
                startActivity(weddingNameIntent);
            }
        });

        TextView weddingDeserveTextView = (TextView) findViewById(R.id.wedding_deserve);
        weddingDeserveTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent weddingDeserveIntent = new Intent(MainActivity.this, WeddingActivity.class);
                startActivity(weddingDeserveIntent);
            }
        });


        ImageView historyImage = (ImageView) findViewById(R.id.image_history);
        historyImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historyImageIntent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(historyImageIntent);
            }
        });

        TextView historyNameTextView = (TextView) findViewById(R.id. history_name);
        historyNameTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historyNameIntent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(historyNameIntent);
            }
        });

        TextView historyDeserveTextView = (TextView) findViewById(R.id.history_deserve);
        historyDeserveTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historyDeserveIntent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(historyDeserveIntent);
            }
        });

        TextView translateNameTextView = (TextView)findViewById(R.id.translate_name);
        translateNameTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent translateNameIntent = new Intent( MainActivity.this, RomanActivity.class);
                startActivity(translateNameIntent);
            }
        });

        TextView translateDeserveTextView = (TextView)findViewById(R.id.translate_deserve);
        translateDeserveTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent translateDeserveIntent = new Intent(MainActivity.this, RomanActivity.class);
                startActivity(translateDeserveIntent);
            }
        });

        final ImageView imageTranslate = (ImageView)findViewById(R.id.image_translate);
        imageTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent translateImage = new Intent(MainActivity.this, RomanActivity.class);
                startActivity(translateImage);
            }
        });




    }
}
