package com.example.landofgods;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class HillStationFragment extends Fragment {

    public HillStationFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.word_list, container, false);
        ArrayList<item> itemList= new ArrayList<>();

        itemList.add(new item(" Nainital"," Known as the Lake District.It shines as a glittering jewel in the Himalayan Mountains and is surrounded with lakes and nature's bounty.",R.drawable.nainital));
        itemList.add(new item(" Auli"," Auli is considered among the best skiing destinations of India, it is situated in Chamoli district covering an elevation of  3,050 mts above sea level",R.drawable.auli));
        itemList.add(new item(" Ranikhet",  " The hill station is Ranikhet, literally meaning - Queens Land. Ranikhet is a place that reflects the best of the great Himalayas.",R.drawable.ranikhet));
        itemList.add(new item(" Kausani"," Kausani is known for offering a panoramic view of the massive Himalayan peaks such as Trishul, Nanda Devi ",R.drawable.kausani));
        itemList.add(new item(" Pithoragarh"," Located at an average elevation of 1,514 meters above sea level, Pithoragarh is a Himalayan town famous for it's heavenly beauty ",R.drawable.pithoragarh));
        itemList.add(new item(" Chaukori"," As the name suggest Chaukori ia tiny hamlet shaped like  bowl that is enveloped in the heart of Himalaya ",R.drawable.chaukori));
        itemList.add(new item(" Mussoorie"," The muse of a romantic, a loner’s wonderland and a nature lover’s paradise ",R.drawable.mussoorie));
        ListView listView=rootView.findViewById( R.id.list);
        itemAdapter adapter=new itemAdapter(getActivity(),itemList);
        listView.setAdapter(adapter);
        return rootView;
    }


    }



