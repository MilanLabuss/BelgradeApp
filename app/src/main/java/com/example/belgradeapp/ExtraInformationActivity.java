package com.example.belgradeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


//this activity will react to a click on the recycleview in the Fragment and will show futher information about that particular item
//Make these 3 activities into 1 class to follow Java best practices*
public class ExtraInformationActivity extends AppCompatActivity {


    ImageView Imageview;
    TextView name,description;
    String nm, ds;
    int img;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_information);

        Imageview = findViewById(R.id.ActImgview);
        name = findViewById(R.id.restActName);
        description = findViewById(R.id.ActDesc);

        getData();
        setData();


    }

//getting the data from intent
    private void getData() {
        if (getIntent().hasExtra("Name") && getIntent().hasExtra("Description") && getIntent().hasExtra("myImg") ){
            nm = getIntent().getStringExtra("Name");
            ds = getIntent().getStringExtra("Description");
            img = getIntent().getIntExtra("myImg",1);

        } else{
            Toast.makeText(this,"No data was found",Toast.LENGTH_SHORT).show();
        }




    }
    private void setData() {
        name.setText(nm);
        description.setText(ds);
        Imageview.setImageResource(img);
    }


}