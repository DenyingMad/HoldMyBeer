package com.example.holdmybeer;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView brands;
    private Spinner color;
    private Button find_beer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        brands = findViewById(R.id.brands);
        color = findViewById(R.id.color);
        find_beer = findViewById(R.id.find_beer);
        
    }
    public void onClickFindBeer(View view){

    }
}
