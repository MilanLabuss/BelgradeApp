package com.example.belgradeapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CuisineFragment extends Fragment {

    RecyclerView recycleview;

//arrays for our string arrays
    String resNames[],resDescriptions[];
    int resimages[] = {R.drawable.durmitor,R.drawable.littlebaybelgrade, R.drawable.radosthouse,R.drawable.tojeto
    ,R.drawable.enso, R.drawable.amb, R.drawable.frans};




    public CuisineFragment(){
        // require a empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_cuisine, container, false);
        recycleview = (RecyclerView) v.findViewById(R.id.restaurantRecycle);

        //Storing the String arrays in resNames and resDescriptions
        resNames = getResources().getStringArray(R.array.restaurant_names);
        resDescriptions = getResources().getStringArray(R.array.restaurant_descriptions);

        //If i get a bug it could be this getContext
        RAdapter myadapter = new RAdapter(getContext(),resNames,resDescriptions,resimages);
        recycleview.setAdapter(myadapter);
        //If i get a bug it could be this getContext
        recycleview.setLayoutManager(new LinearLayoutManager(getContext()));


        // Inflate the layout for this fragment
        return v;





    }

}