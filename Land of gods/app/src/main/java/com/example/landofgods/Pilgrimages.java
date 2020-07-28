package com.example.landofgods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Pilgrimages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilgrimages);
        ArrayList <item> itemList=new ArrayList<>();
        itemList.add(new item("Kedarnath", "Lies amidst the majestic snow-capped Himalayan ranges on the banks of river Mandakini",R.drawable.kedarnath));
        itemList.add(new item("Badrinath", "Perched at an average elevation of 3,300 metres.The town of Badrinath lies between Nar and Narayan mountain ranges  ",R.drawable.badrinath));
        itemList.add(new item("Gangotri ", "Gangotri is a  town centered around the temple of Gangotri  it is belived that this is the place where river Ganga descended from heaven ",R.drawable.gangotri));
        itemList.add(new item("Yamunotri", "Located at a height of 3293 metre above sea level this temple is dedicated to Goddess Yamuna ",R.drawable.yamunotri));
        itemList.add(new item("Devprayag", "Devprayag is the last Prayag  of the Alaknanda River positioned at an elevation of 830 meters above sea level.",R.drawable.devprayag));
        itemList.add(new item("Haridwar", "Revered as one among seven holiest places of India , Haridwar literally suggests the \'Gateway to Lord Vishnu\' ",R.drawable.haridwar));
        itemList.add(new item("Ukhimath", "Situated at an elevation of 1317 mts above sea level revered as the home of Lord Kedarnath  during winters. ",R.drawable.ukhimath));
        itemList.add(new item("Rishikesh", "The celestial city of Rishikesh is a hermit’s hermitage, a sage’s abode The word Rishikesh literally suggests the \'locks or hairs of a sage\'",R.drawable.rishikesh_new));
        itemList.add(new item("Adi Kailash", "Adi Kailash also referred to as Chota Kailash or Little Kailash situated in the Indian Territory in Pithoragarh district",R.drawable.adikailashjpeg));
        ListView listView=findViewById(R.id.list);
        itemAdapter adapter=new itemAdapter(this,itemList);
        listView.setAdapter(adapter);



    }
}
