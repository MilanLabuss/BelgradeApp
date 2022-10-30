package com.example.belgradeapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class EntertainmentFragment extends Fragment {



    RecyclerView recycleview;

    //arrays for our string arrays
    String entNames[],entDescriptions[];
    int entimages[] = {R.drawable.northserbiawalkingtour, R.drawable.monsteriestour,
    R.drawable.winetasting, R.drawable.cruise, R.drawable.danubetour,R.drawable.laketour};


    public EntertainmentFragment(){
        // require a empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v  = inflater.inflate(R.layout.fragment_entertainment, container, false);
        recycleview = (RecyclerView) v.findViewById(R.id.entertainmentrecycle);
        entNames = getResources().getStringArray(R.array.activities_names);
        entDescriptions = getResources().getStringArray(R.array.activities_descriptions);


        RAdapter myadapter = new RAdapter(getContext(),entNames,entDescriptions,entimages);
        recycleview.setAdapter(myadapter);
        recycleview.setLayoutManager(new LinearLayoutManager(getContext()));

        return v;
    }
}