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


public class TopCusineFragment extends Fragment {

    public TopCusineFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.word_list, container, false);
        ArrayList<item> itemList=new ArrayList<>();
        itemList.add(new item(getString(R.string.Kafuli),getString(R.string.aboutKafuli),R.drawable.kafuli));
        itemList.add(new item(getString(R.string.uradBada),getString(R.string.aboutUradBada),R.drawable.kumaonibada));
        itemList.add(new item(getString(R.string.Raita),getString(R.string.aboutRaita),R.drawable.kumaoniraita));
        itemList.add(new item(getString(R.string.manduaKiRoti),getString(R.string.aboutManduaKiRoti)
                ,R.drawable.mandua));
        itemList.add(new item(getString(R.string.gahatKaParatha),getString(R.string.aboutGahatKaPratha),R.drawable.gahatparatha));
        itemList.add(new item(getString(R.string.Singhal),getString(R.string.aboutSinghal),R.drawable.singhal));
        itemList.add(new item(getString(R.string.phaanu),getString(R.string.aboutPhaanu),R.drawable.phaanu));
        itemList.add(new item(getString(R.string.Singhori),getString(R.string.aboutSinghori),R.drawable.singori));
        itemList.add(new item(getString(R.string.dubuk),getString(R.string.aboutDubuk),R.drawable.dubuk));
        itemList.add(new item(getString(R.string.gulgula),getResources().getString(R.string.aboutGulgula),R.drawable.gulgula));

        ListView listView=rootView.findViewById(R.id.list);
        itemAdapter adapter=new itemAdapter(getActivity(),itemList);
        listView.setAdapter(adapter);
        return rootView;
    }


}
