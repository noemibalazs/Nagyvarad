package com.example.android.nagyvarad;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Noemi on 12/4/2017.
 */

public class ContentAdapter extends ArrayAdapter<Content> {

    public ContentAdapter(Context context, ArrayList<Content>content){
        super(context, 0, content);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.general, parent, false);}

            Content myContent = getItem(position);

            TextView textView1 = (TextView)listItemView.findViewById(R.id.textview1);
            textView1.setText(myContent.getNameId());

            TextView textView2 = (TextView)listItemView.findViewById(R.id.textview2);
            textView2.setText(myContent.getAddressId());

            TextView textView3 = (TextView)listItemView.findViewById(R.id.textview3);
            textView3.setText(myContent.getTelephoneId());
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView textViewPhone = (TextView) view.findViewById(R.id.textview3);
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + textViewPhone.getText()));
                    if (intent.resolveActivity(getContext().getPackageManager()) != null) {
                        getContext().startActivity(intent);
                    }


                }
            });

            final TextView textView4 = (TextView)listItemView.findViewById(R.id.textview4);
            textView4.setText(myContent.getWebPageId());
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                     TextView textViewWeb = (TextView) view.findViewById(R.id.textview4);
                     Intent intent = new Intent(Intent.ACTION_VIEW);
                     intent.setData(Uri.parse("http:" + textViewWeb.getText()));
                    if (intent.resolveActivity(getContext().getPackageManager()) != null) {
                        getContext().startActivity(intent);
                    }

                }
            });

            ImageView imageViewG = (ImageView)listItemView.findViewById(R.id.general_image);
            imageViewG.setImageResource(myContent.getImageResourceId());


        return listItemView;
    }
}
