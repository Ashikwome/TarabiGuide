package com.example.trabiguide;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

public class SecondActivity extends AppCompatActivity {


    SliderLayout imageSlider;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnnavigationItemSelectedlistner
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem menuItem) {

            switch (menuItem.getItemId()) {

                case R.id.item1:
                    Toast.makeText(SecondActivity.this, "You are on the Home Activity", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.item2:
                    Intent i = new Intent(SecondActivity.this, SurahActivity.class);
                    startActivity(i);
                    return true;

                case R.id.item3:
                    Intent l = new Intent(SecondActivity.this, Hadis.class);
                    startActivity(l);
                    return true;

                case R.id.item4:
                    Intent m = new Intent(SecondActivity.this, More.class);
                    startActivity(m);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnnavigationItemSelectedlistner);


        imageSlider = findViewById(R.id.imageslider);
        imageSlider.setIndicatorAnimation(IndicatorAnimations.FILL);
        imageSlider.setScrollTimeInSec(1);

        setImageSliderView();
    }

    private void setImageSliderView() {

        for (int i = 0; i <= 3; i++) {

            DefaultSliderView sliderView = new DefaultSliderView(this);

            switch (i) {
                case 0:
                    sliderView.setImageDrawable(R.drawable.iftar);
                    sliderView.setDescription("First One");
                    break;

                case 1:
                    sliderView.setImageDrawable(R.drawable.iftertwo);
                    sliderView.setDescription("Seocnd one");
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.ramadan);
                    sliderView.setDescription("Third One");
                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.ramdantwo);
                    sliderView.setDescription("Fourth One");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);

            final int finall = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(SecondActivity.this, "this is slider" + (finall + 1), Toast.LENGTH_SHORT).show();
                }
            });

            imageSlider.addSliderView(sliderView);
        }

    }
}
