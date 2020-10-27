package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Spinner spiner1, spinner2;
    TextView editTextView;
    TextView TextView;
    String[] items ={"USD","EURO","POUND","YEN","NDT","WON","MANAT","VND","KWT","DINAR"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView =(TextView) findViewById(R.id.Text2);
        editTextView=(TextView) findViewById(R.id.Text1);
        spiner1 = (Spinner) findViewById(R.id.spinner1);
        spiner1.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,
                items));
        spiner1.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner2.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,
                items));
        spinner2.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
    }
}
