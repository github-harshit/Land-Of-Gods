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
        itemList.add(new item(" Kedarkantha", " A trekker’s delight and rookie’s rite of passage,at a towering peak of 3800 meters,Kedarkantha is located in Govind Wildlife Sancttuary ", R.drawable.kedarkantha));
        itemList.add(new item(" Kedartal", " Kedartal also known as ‘Shiva’s Lake’ is one of the highest lakes(4912) metres above sea level in Uttarkashi district.", R.drawable.kedartal));
        itemList.add(new item(" Pindari", " Situated in the mesmerizing Kumaon Himalayas, Pindari Glacier is a most accessible of all glacier treks", R.drawable.pindari));
        itemList.add(new item(" Chopata", " Also known as Switzeerland of Uttrakhand Chopta is a evergreen forest area which is a part of kedarnath wildlife sanctuary", R.drawable.chopata));
        itemList.add(new item(" DeoriTal", " Devariyatal is an emerald lake perched at a height of 2438 mts above sea level , it falls under Kedarnath Musk Deer Wildlife Sanctuary .", R.drawable.deoria));
        itemList.add(new item(" Bungee Jumping", " Located at a distance of 15 km from Lakshman Jhula in Rishikesh, a small village named Mohan Chatti is a hotspot for bungee jumping in India.", R.drawable.bungeejpg));
        itemList.add(new item(" River Rafting", " The enticing city of Rishikesh hosts a range of rafting activities With Grade I to V rapids, this place is an ideal destination for both amateurs and professionals", R.drawable.rafting));
        itemList.add(new item(" Paragliding ", " Uttarakhand offers abundant operations for paragliding for those looking for the rush of flying paragliding flights are offered via  specialists at Mukteshwar and Ranikhet.", R.drawable.paragliding));
        itemList.add(new item(" Skiing", " Skiing is one of the most enthralling  activities in Uttarakhand . The snow-covered mountain peaks of Auli are the best to experience this thrilling activity.", R.drawable.skiing));
        ListView listView = rootView.findViewById(R.id.list);
        itemAdapter adapter = new itemAdapter(getActivity(), itemList);
        listView.setAdapter(adapter);
         return rootView;
    }


}
