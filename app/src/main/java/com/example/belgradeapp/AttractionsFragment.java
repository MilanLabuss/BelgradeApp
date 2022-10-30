package com.example.belgradeapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AttractionsFragment extends Fragment {

    RecyclerView recycleview;

    //arrays for our string arrays
    String attNames[],attDescriptions[];
    int attimages[] = {R.drawable.avalatower, R.drawable.houseofflowers,R.drawable.gardostower,
    R.drawable.nikolateslamuseum,R.drawable.crkvasvetogmarka,R.drawable.knezmihajlova,
    R.drawable.saintsavatemple,R.drawable.belgradefortress};


    public AttractionsFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v  = inflater.inflate(R.layout.fragment_attractions, container, false);
        recycleview = (RecyclerView) v.findViewById(R.id.attractionsRecycle);
        attNames = getResources().getStringArray(R.array.attractions_names);
        attDescriptions = getResources().getStringArray(R.array.attractions_descriptions);

        //creating an adapter object
        RAdapter myadapter = new RAdapter(getContext(),attNames,attDescriptions,attimages);
        recycleview.setAdapter(myadapter);
        recycleview.setLayoutManager(new LinearLayoutManager(getContext()));

        return v;
    }
}