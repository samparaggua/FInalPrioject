package com.example.finalprioject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class ScrollingActivity extends AppCompatActivity {
    private CheckBox chkArboretum;
    private CheckBox chkAlmaMater;
    private CheckBox chkFoellingerAuditorium;
    private CheckBox chkGraingerEngineeringLibraryInformationCenter;
    private CheckBox chkHalleneGateway;
    private CheckBox chkIlliniUnion;
    private CheckBox chkKrannertCenterforthePerformingArts;
    private CheckBox chkMemorialStadium;
    private CheckBox chkNationalCenterforSupercomputingApplications;
    private CheckBox chkThomasMSiebelCenterforComputerScience;
    private CheckBox chkStateFarmCenter;
    private CheckBox chkIlliniBookStore;

    private CheckBox chkAltgeldHall;
    private CheckBox chkArmory;
    private CheckBox chkAstronomicalObservatory;
    private CheckBox chkActivitiesandRecreationCenter;
    private CheckBox chkUIIceArena;
    private CheckBox chkMcFarlandBellTower;
    private CheckBox chkKrannertArtMuseumandKinkeadPavilion;
    private CheckBox chkLincolnHall;
    private CheckBox chkMorrowPlots;
    private CheckBox chkRoundDairyBarns;
    private CheckBox chkSpurlockMuseum;
    private CheckBox chkUniversityLibrary;
    private CheckBox chkBeckmanInstituteforAdvancedScienceandTechnology;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("I-GO Checklist");
        setSupportActionBar(toolbar);

        addListenerOnChkArboretum();
        addListenerOnChkAlmaMater();

    }
    public void addListenerOnChkArboretum() {
        chkArboretum = (CheckBox) findViewById(R.id.Arboretum);
        chkArboretum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Did you smell the flowers like you? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkAlmaMater() {
        chkArboretum = (CheckBox) findViewById(R.id.AlmaMater);
        chkArboretum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
