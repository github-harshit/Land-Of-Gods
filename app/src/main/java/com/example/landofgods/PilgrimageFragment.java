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


public class PilgrimageFragment extends Fragment {


    public PilgrimageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        ArrayList<item> itemList = new ArrayList<>();
        itemList.add(new item(getString(R.string.kedarnath), getString(R.string.aboutKedarnath), R.drawable.kedarnath));
        itemList.add(new item(getString(R.string.badrinath), getString(R.string.aboutBadriNath), R.drawable.badrinath));
        itemList.add(new item(getString(R.string.gangotri), getString(R.string.aboutGangotri), R.drawable.gangotri));
        itemList.add(new item(getString(R.string.yamunotri), getString(R.string.aboutYamunotri), R.drawable.yamunotri));
        itemList.add(new item(getString(R.string.devprayag), getString(R.string.aboutDevprayag), R.drawable.devprayag));
        itemList.add(new item(getString(R.string.haridwar), getString(R.string.aboutHaridwar), R.drawable.haridwar));
        itemList.add(new item(getString(R.string.ukhimath), getString(R.string.aboutUkhimath), R.drawable.ukhimath));
        itemList.add(new item(getString(R.string.rishikesh), getString(R.string.aboutRishikesh), R.drawable.rishikesh_new));
        itemList.add(new item(getString(R.string.adiKailash), getResources().getString(R.string.aboutAdikailash), R.drawable.adikailashjpeg));
        ListView listView = rootView.findViewById(R.id.list);
        itemAdapter adapter = new itemAdapter(getActivity(), itemList);
        listView.setAdapter(adapter);
        return rootView;
    }
}




