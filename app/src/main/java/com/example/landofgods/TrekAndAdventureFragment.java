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


public class TrekAndAdventureFragment extends Fragment {


    public TrekAndAdventureFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View rootView=inflater.inflate(R.layout.word_list, container, false);
        ArrayList<item> itemList = new ArrayList<>();
        itemList.add(new item(getString(R.string.kedarkantha), getString(R.string.aboutKedarkantha), R.drawable.kedarkantha));
        itemList.add(new item(getString(R.string.kedartal), getString(R.string.aboutKedartal), R.drawable.kedartal));
        itemList.add(new item(getString(R.string.pindari), getString(R.string.aboutPindari), R.drawable.pindari));
        itemList.add(new item(getString(R.string.chopata), getString(R.string.aboutChopata), R.drawable.chopata));
        itemList.add(new item(getString(R.string.deoriTal), getString(R.string.aboutDeoriTal), R.drawable.deoria));
        itemList.add(new item(getString(R.string.bungee), getString(R.string.aboutBungee), R.drawable.bungeejpg));
        itemList.add(new item(getString(R.string.riverRafting), getString(R.string.aboutRiverRAFTING), R.drawable.rafting));
        itemList.add(new item(getString(R.string.paragliding), getString(R.string.aboutParaggliding), R.drawable.paragliding));
        itemList.add(new item(getString(R.string.skiing), getResources().getString(R.string.aboutSkiing), R.drawable.skiing));
        ListView listView = rootView.findViewById(R.id.list);
        itemAdapter adapter = new itemAdapter(getActivity(), itemList);
        listView.setAdapter(adapter);
         return rootView;
    }


}
