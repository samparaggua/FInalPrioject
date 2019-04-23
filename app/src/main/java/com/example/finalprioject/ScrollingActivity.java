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
        addListenerOnChkFoellingerAuditorium();
        addListenerOnChkGraingerEngineeringLibraryInformationCenter();
        addListenerOnChkHalleneGateway();
        addListenerOnChkIlliniUnion();
        addListenerOnChkKrannertCenterforthePerformingArts();
        addListenerOnChkMemorialStadium();
        addListenerOnChkNationalCenterforSupercomputingApplications();
        addListenerOnChkThomasMSiebelCenterforComputerScience();
        addListenerOnChkStateFarmCenter();
        addListenerOnChkIlliniBookStore();
        addListenerOnChkAltgeldHall();
        addListenerOnChkArmory();
        addListenerOnChkAstronomicalObservatory();
        addListenerOnChkActivitiesandRecreationCenter();
        addListenerOnChkUIIceArena();
        addListenerOnChkMcFarlandBellTower();
        addListenerOnChkKrannertArtMuseumandKinkeadPavilion();

        addListenerOnChkLincolnHall();
        addListenerOnChkMorrowPlots();
        addListenerOnChkRoundDairyBarns();
        addListenerOnChkSpurlockMuseum();
        addListenerOnChkUniversityLibrary();
        addListenerOnChkBeckmanInstituteforAdvancedScienceandTechnology();










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
        chkAlmaMater = (CheckBox) findViewById(R.id.AlmaMater);
        chkAlmaMater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkFoellingerAuditorium() {
        chkFoellingerAuditorium = (CheckBox) findViewById(R.id.FoellingerAuditorium);
        chkFoellingerAuditorium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkGraingerEngineeringLibraryInformationCenter() {
        chkGraingerEngineeringLibraryInformationCenter = (CheckBox) findViewById(R.id.GraingerEngineeringLibraryInformationCenter);
        chkGraingerEngineeringLibraryInformationCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkHalleneGateway() {
        chkHalleneGateway = (CheckBox) findViewById(R.id.HalleneGateway);
        chkHalleneGateway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkIlliniUnion() {
        chkIlliniUnion = (CheckBox) findViewById(R.id.IlliniUnion);
        chkIlliniUnion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkMemorialStadium() {
        chkMemorialStadium = (CheckBox) findViewById(R.id.MemorialStadium);
        chkMemorialStadium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkKrannertCenterforthePerformingArts() {
        chkKrannertCenterforthePerformingArts = (CheckBox) findViewById(R.id.KrannertCenterforthePerformingArts);
        chkKrannertCenterforthePerformingArts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkNationalCenterforSupercomputingApplications() {
        chkNationalCenterforSupercomputingApplications = (CheckBox) findViewById(R.id.NationalCenterforSupercomputingApplications);
        chkNationalCenterforSupercomputingApplications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkThomasMSiebelCenterforComputerScience() {
        chkThomasMSiebelCenterforComputerScience = (CheckBox) findViewById(R.id.ThomasMSiebelCenterforComputerScience);
        chkThomasMSiebelCenterforComputerScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkStateFarmCenter() {
        chkStateFarmCenter = (CheckBox) findViewById(R.id.StateFarmCenter);
        chkStateFarmCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkIlliniBookStore() {
        chkIlliniBookStore = (CheckBox) findViewById(R.id.Illini_Union_Bookstore);
        chkIlliniBookStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkAltgeldHall() {
        chkAltgeldHall = (CheckBox) findViewById(R.id.AltgeldHall);
        chkAltgeldHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkArmory() {
        chkArmory = (CheckBox) findViewById(R.id.Armory);
        chkArmory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkAstronomicalObservatory() {
        chkAstronomicalObservatory = (CheckBox) findViewById(R.id.AstronomicalObservatory);
        chkAstronomicalObservatory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkActivitiesandRecreationCenter() {
        chkActivitiesandRecreationCenter = (CheckBox) findViewById(R.id.ActivitiesandRecreationCenter);
        chkActivitiesandRecreationCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkMcFarlandBellTower() {
        chkMcFarlandBellTower = (CheckBox) findViewById(R.id.McFarlandBellTower);
        chkMcFarlandBellTower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkKrannertArtMuseumandKinkeadPavilion() {
        chkKrannertArtMuseumandKinkeadPavilion = (CheckBox) findViewById(R.id.KrannertArtMuseumandKinkeadPavilion);
        chkKrannertArtMuseumandKinkeadPavilion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkLincolnHall() {
        chkLincolnHall = (CheckBox) findViewById(R.id.LincolnHall);
        chkLincolnHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkMorrowPlots() {
        chkMorrowPlots = (CheckBox) findViewById(R.id.MorrowPlots);
        chkMorrowPlots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkRoundDairyBarns() {
        chkRoundDairyBarns = (CheckBox) findViewById(R.id.RoundDairyBarns);
        chkRoundDairyBarns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkSpurlockMuseum() {
        chkSpurlockMuseum = (CheckBox) findViewById(R.id.SpurlockMuseum);
        chkSpurlockMuseum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkUniversityLibrary() {
        chkUniversityLibrary = (CheckBox) findViewById(R.id.UniversityLibrary);
        chkUniversityLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkUIIceArena() {
        chkUniversityLibrary = (CheckBox) findViewById(R.id.UIIceArena);
        chkUIIceArena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkBeckmanInstituteforAdvancedScienceandTechnology() {
        chkBeckmanInstituteforAdvancedScienceandTechnology = (CheckBox) findViewById(R.id.BeckmanInstituteforAdvancedScienceandTechnology);
        chkBeckmanInstituteforAdvancedScienceandTechnology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Been to our Jesus? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
