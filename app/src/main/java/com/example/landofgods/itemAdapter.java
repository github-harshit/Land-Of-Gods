package com.example.landofgods;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


    public class itemAdapter extends ArrayAdapter<item> {
        public itemAdapter(Activity context, ArrayList<item> itemList) {

            super(context, 0, itemList);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            item currentItem = getItem(position);
            View listItemView = convertView;
            if(listItemView==null){
                listItemView= LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item,parent,false);

            }
            TextView itemTextView=listItemView.findViewById(R.id.itemName);
            itemTextView.setText(currentItem.getLoaction());
            TextView decriptionTextView=listItemView.findViewById(R.id.descriptionName);
            decriptionTextView.setText(currentItem.getDescription());
            ImageView imageView=listItemView.findViewById(R.id.imageName);
            imageView.setImageResource(currentItem.getImageResourceId());
            return listItemView;




        }
    }
