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
        itemList.add(new item(" Kafuli","Taste the famous blend of green leafy vegetables in the form of Kafuli ",R.drawable.kafuli));
        itemList.add(new item(" Urad Bada"," Kumaoni Dal Bade are crispy, flavoursome, gluten free urad dal fritters",R.drawable.kumaonibada));
        itemList.add(new item(" Kheere Ka Raita","A side dish prepared from curd, turmeric, grated cucumber, green chillies and mustard seeds, this raita can be had with just about everything",R.drawable.kumaoniraita));
        itemList.add(new item("Mandua Ki Roti","These delicious and nutritious chapatis are made from Mandua Flour (Finger\n" +
                "Millet )",R.drawable.mandua));
        itemList.add(new item(" Gahat Ka Paratha","Gahat ke Paranthe is healthy and nutritious paratha stuffed with horse gram.",R.drawable.gahatparatha));
        itemList.add(new item(" Singhal","Singhals are part and parcel of Kumaon culture, a healthy delicacy made with semolina, banana, curd, milk, sugar, and cardamom.",R.drawable.singhal));
        itemList.add(new item(" Phaanu","A combination of different lentils like arhar, moong and urad soaked overnight, is what gives a unique taste to this complex dish",R.drawable.phaanu));
        itemList.add(new item(" Singori","This is a sweetmeat moulded in an indigenous leaf called malla ka patta that results in little cones fragrant with the elusive scent of cardamom",R.drawable.singori));
        itemList.add(new item(" Dubuk","This very traditional Kumaoni recipe is made of lentils, either bhatt, gehat or arhar, which are boiled and later separated from the stock.",R.drawable.dubuk));
        itemList.add(new item(" Gulgula","Gulgula is a delectable sweet of Uttarakhand. It is a sweet local snack made of jaggery which traces its origin to the Garhwal region.",R.drawable.gulgula));

        ListView listView=rootView.findViewById(R.id.list);
        itemAdapter adapter=new itemAdapter(getActivity(),itemList);
        listView.setAdapter(adapter);
        return rootView;
    }


}
