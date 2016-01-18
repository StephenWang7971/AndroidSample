package com.keelean.citest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.keelean.citest.service.Add;
import com.keelean.citest.service.Calculable;
import com.keelean.citest.service.Sub;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView result = (TextView) findViewById(R.id.result);

        String text = "";

        String symbol = "";

        Calculable calc = null;

        if (BuildConfig.VERSION.equals("DEBUG")) {
            calc = new Add();
            symbol = "+";
        } else {
            calc = new Sub();
            symbol = "-";
        }

        int number = calc.calc(7, 4);
        text = "7 " + symbol + " 4 = " + String.valueOf(number);

        result.setText(text);


    }
}
