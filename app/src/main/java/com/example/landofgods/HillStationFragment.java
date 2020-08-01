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

        itemList.add(new item(getResources().getString(R.string.Nainital),getResources().getString(R.string.aboutNainital),R.drawable.nainital));
        itemList.add(new item(getResources().getString(R.string.Auli),getResources().getString(R.string.AboutAuli),R.drawable.auli));
        itemList.add(new item(getString(R.string.Ranikhet),  getString(R.string.aboutRanikhet),R.drawable.ranikhet));
        itemList.add(new item(getString(R.string.Kausani),getString(R.string.aboutKausani),R.drawable.kausani));
        itemList.add(new item(getString(R.string.Pithoragarh),getString(R.string.aboutPithoragarh),R.drawable.pithoragarh));
        itemList.add(new item(getString(R.string.Chaukori),getString(R.string.aboutChaukori),R.drawable.chaukori));
        itemList.add(new item(getString(R.string.Mussoorie),getResources().getString(R.string.aboutMussoorie),R.drawable.mussoorie));
        ListView listView=rootView.findViewById( R.id.list);
        itemAdapter adapter=new itemAdapter(getActivity(),itemList);
        listView.setAdapter(adapter);
        return rootView;
    }


    }



