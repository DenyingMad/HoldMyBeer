package com.example.holdmybeer;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {
    TextView brands;
    private Spinner color;
    private Button findBeer;
    private BeerExpert expert = new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        brands = findViewById(R.id.brands);
        color = findViewById(R.id.color);
        findBeer = findViewById(R.id.find_beer);

        findBeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String beerType = String.valueOf(color.getSelectedItem());
                List<String> beersBrands = expert.getBrands(beerType);
                StringBuilder brandsFormatted = new StringBuilder();
                for (String brand: beersBrands){
                    brandsFormatted.append(brand).append('\n');
                }
                brands.setText(brandsFormatted);
            }
        });
    }



//    public void onClickFindBeer(View view){
//        String beerType = String.valueOf(color.getSelectedItem());
//        List<String> beersBrands = expert.getBrands(beerType);
//        StringBuilder brandsFormatted = new StringBuilder();
//        for (String brand: beersBrands){
//            brandsFormatted.append(brand).append('\n');
//        }
//    }
}
