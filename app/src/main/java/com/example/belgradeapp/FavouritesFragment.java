package com.example.belgradeapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.EditText;
import android.widget.TextView;



public class FavouritesFragment extends Fragment {


    TextView displayfav;
    EditText inputtxt;
    String input;

    public FavouritesFragment(){
        // require a empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_favourites, container, false);

        displayfav = v.findViewById(R.id.displayFavstxt);
        inputtxt = v.findViewById(R.id.editTextfav);
        View submitbtn = v.findViewById(R.id.addfavbtn);
        submitbtn.setOnClickListener(v1 -> {
                input = inputtxt.getText().toString();
                displayfav.append(input + "\n");
        });



        return v;
    }

}