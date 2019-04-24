package com.example.finalprioject;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
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
        chkArboretum = findViewById(R.id.Arboretum);
        chkArboretum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Did you smell the flowers, like you? ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkAlmaMater() {
        chkAlmaMater = findViewById(R.id.AlmaMater);
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
        chkFoellingerAuditorium = findViewById(R.id.FoellingerAuditorium);
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
        chkGraingerEngineeringLibraryInformationCenter = findViewById(R.id.GraingerEngineeringLibraryInformationCenter);
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
        chkHalleneGateway = findViewById(R.id.HalleneGateway);
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
        chkIlliniUnion = findViewById(R.id.IlliniUnion);
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
        chkMemorialStadium = findViewById(R.id.MemorialStadium);
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
        chkKrannertCenterforthePerformingArts = findViewById(R.id.KrannertCenterforthePerformingArts);
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
        chkNationalCenterforSupercomputingApplications = findViewById(R.id.NationalCenterforSupercomputingApplications);
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
        chkThomasMSiebelCenterforComputerScience = findViewById(R.id.ThomasMSiebelCenterforComputerScience);
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
        chkStateFarmCenter = findViewById(R.id.StateFarmCenter);
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
        chkIlliniBookStore = findViewById(R.id.Illini_Union_Bookstore);
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
        chkAltgeldHall = findViewById(R.id.AltgeldHall);
        chkAltgeldHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Did you hear the bell ring?", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkArmory() {
        chkArmory = findViewById(R.id.Armory);
        chkArmory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Left, left, left, right, left!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkAstronomicalObservatory() {
        chkAstronomicalObservatory = findViewById(R.id.AstronomicalObservatory);
        chkAstronomicalObservatory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "The Universe is pretty big..", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkActivitiesandRecreationCenter() {
        chkActivitiesandRecreationCenter = findViewById(R.id.ActivitiesandRecreationCenter);
        chkActivitiesandRecreationCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Sweat it out!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkMcFarlandBellTower() {
        chkMcFarlandBellTower = findViewById(R.id.McFarlandBellTower);
        chkMcFarlandBellTower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Ding! Ding! Ding!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkKrannertArtMuseumandKinkeadPavilion() {
        chkKrannertArtMuseumandKinkeadPavilion = findViewById(R.id.KrannertArtMuseumandKinkeadPavilion);
        chkKrannertArtMuseumandKinkeadPavilion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "The Art Museum, not the performing center...", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkLincolnHall() {
        chkLincolnHall = findViewById(R.id.LincolnHall);
        chkLincolnHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Rub Lincoln's nose for good luck!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkMorrowPlots() {
        chkMorrowPlots = findViewById(R.id.MorrowPlots);
        chkMorrowPlots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Are these plants edible?", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkRoundDairyBarns() {
        chkRoundDairyBarns = findViewById(R.id.RoundDairyBarns);
        chkRoundDairyBarns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Was that a cow?!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkSpurlockMuseum() {
        chkSpurlockMuseum = findViewById(R.id.SpurlockMuseum);
        chkSpurlockMuseum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "So much to look at!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkUniversityLibrary() {
        chkUniversityLibrary = findViewById(R.id.UniversityLibrary);
        chkUniversityLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Were you studying?", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkUIIceArena() {
        chkUIIceArena = findViewById(R.id.UIIceArena);
        chkUIIceArena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Don't slip!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void addListenerOnChkBeckmanInstituteforAdvancedScienceandTechnology() {
        chkBeckmanInstituteforAdvancedScienceandTechnology = findViewById(R.id.BeckmanInstituteforAdvancedScienceandTechnology);
        chkBeckmanInstituteforAdvancedScienceandTechnology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ScrollingActivity.this, "Welcome to the largest building on campus!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
