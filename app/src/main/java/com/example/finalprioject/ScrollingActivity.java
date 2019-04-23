package com.example.finalprioject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("I-GO Checklist");
        setSupportActionBar(toolbar);

//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_maps);

//        addListenerOnChkArboretum();
//        addListenerOnButton();
    }
//    public void addListenerOnChkArboretum() {
//        chkArboretum = (CheckBox) findViewById(R.id.Arboretum);
//        chkArboretum.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (((CheckBox) v).isChecked()) {
//                    Toast.makeText(MapsActivity.this, "YOU CAN DO IT! :)", Toast.LENGTH_LONG).show();
//                }
//
//            }
//        });
//    }
//
//    public void addListenerOnButton() {
//        chkArboretum = (CheckBox) findViewById(R.id.Arboretum);
//        btnDisplay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                StringBuffer result = new StringBuffer();
//                result.append("University of Illinois Arboretum check : ").append(chkArboretum.isChecked());
//
//                Toast.makeText(MapsActivity.this, result.toString(),
//                        Toast.LENGTH_LONG).show();
//            }
//        });
//    }
}
