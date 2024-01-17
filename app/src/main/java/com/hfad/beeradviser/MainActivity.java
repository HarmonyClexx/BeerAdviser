package com.hfad.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    called when the user clicks the button
    public void onClickFindBeer(View view){
//        get reference to the Textview and Spinner
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);

//        get the selected item in the spinner
        String beerType = String.valueOf(color.getSelectedItem());
//        Display the selected item
        brands.setText(beerType);
    }
}