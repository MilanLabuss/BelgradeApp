package com.example.belgradeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);


    }
    HomeFragment homefragment= new HomeFragment();
    CuisineFragment cuisinefragment = new CuisineFragment();
    EntertainmentFragment entertainmentfragment = new EntertainmentFragment();
    AttractionsFragment attractionsfragment = new AttractionsFragment();
    FavouritesFragment favouritesfragment = new FavouritesFragment();



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home:
                //getSupportFragmentManager().beginTransaction().replace(R.id.container, homefragment).commit();

                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.slide_in,  // enter
                                R.anim.fade_out,  // exit
                                R.anim.fade_in,   // popEnter
                                R.anim.slide_out  // popExit
                        )
                        .replace(R.id.container, homefragment)
                        .addToBackStack(null)
                        .commit();
                return true;

            case R.id.cuisine:
             //   getSupportFragmentManager().beginTransaction().replace(R.id.container, cuisinefragment).commit();
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.slide_in,  // enter
                                R.anim.fade_out,  // exit
                                R.anim.fade_in,   // popEnter
                                R.anim.slide_out  // popExit
                        )
                        .replace(R.id.container, cuisinefragment)
                        .addToBackStack(null)
                        .commit();
                return true;

            case R.id.attractions:
                //getSupportFragmentManager().beginTransaction().replace(R.id.container, attractionsfragment).commit();
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.slide_in,  // enter
                                R.anim.fade_out,  // exit
                                R.anim.fade_in,   // popEnter
                                R.anim.slide_out  // popExit
                        )
                        .replace(R.id.container, attractionsfragment)
                        .addToBackStack(null)
                        .commit();
                return true;
            case R.id.entertainment:
              //  getSupportFragmentManager().beginTransaction().replace(R.id.container, entertainmentfragment).commit();
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.slide_in,  // enter
                                R.anim.fade_out,  // exit
                                R.anim.fade_in,   // popEnter
                                R.anim.slide_out  // popExit
                        )
                        .replace(R.id.container, entertainmentfragment)
                        .addToBackStack(null)
                        .commit();
                return true;
            case R.id.favourites:
                // getSupportFragmentManager().beginTransaction().replace(R.id.container, favouritesfragment).commit();
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.slide_in,  // enter
                                R.anim.fade_out,  // exit
                                R.anim.fade_in,   // popEnter
                                R.anim.slide_out  // popExit
                        )
                        .replace(R.id.container, favouritesfragment)
                        .addToBackStack(null)
                        .commit();
                return true;
        }
        return false;
    }
}